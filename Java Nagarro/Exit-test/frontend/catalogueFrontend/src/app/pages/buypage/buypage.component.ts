import { Options } from '@angular-slider/ngx-slider';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { DataShareService } from 'src/app/services/datashare.service';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-buypage',
  templateUrl: './buypage.component.html',
  styleUrls: ['./buypage.component.css']
})
export class BuypageComponent implements OnInit {
  pincodeData = {
    pincode
      : ''
  }




  constructor(public datashare: DataShareService, private snack: MatSnackBar, private http: HttpClient) { }


  api: ProductService = new ProductService(this.http);
  days!: number
  product = this.datashare.getData();
  ngOnInit(): void {
    console.log(this.product);
  }
  pincodeSubmit() {
    if (this.pincodeData.pincode == null || this.pincodeData.pincode.trim() == '') {
      this.snack.open("** All the feilds are required !!", '', {
        duration: 1000,
      });
      return;

    }
    this.api.checkPincode(Number(this.pincodeData.pincode))
      .subscribe(res => {
        this.days = res;
        console.log(this.days);
        if (this.days == 0) {
          this.snack.open("** Oops !! Currently not deliverable to your location", '', {
            duration: 3000,
          });
          return;

        }
        else if (this.days == 1) {
          this.snack.open("** Woho !! Deliverable in " + this.days + " day", '', {
            duration: 3000,
          });
        }
        else {
          this.snack.open("** Woho !! Deliverable in " + this.days + " days", '', {
            duration: 3000,
          });
        }


      })



  }


}
