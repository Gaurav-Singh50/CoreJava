import { Options } from '@angular-slider/ngx-slider';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DataShareService } from 'src/app/services/datashare.service';
import { LoginService } from 'src/app/services/login.service';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-userpage',
  templateUrl: './userpage.component.html',
  styleUrls: ['./userpage.component.css']
})
export class UserpageComponent implements OnInit {

  searchData = {
    query: ''
  }
  minprice: number = 0;
  maxprice: number = 50000;
  options: Options = {
    floor: 0,
    ceil: 50000
  };

  constructor(public login: LoginService, private http: HttpClient, public datashare: DataShareService, private router: Router) { }
  api: ProductService = new ProductService(this.http);
  products !: any

  ngOnInit(): void {
    this.getAllProducts();
  }
  getAllProducts() {
    this.api.getProducts()
      .subscribe(res => {
        this.products = res;
        console.log(this.products);
      })
  }
  viewProduct(product: any) {
    this.datashare.setData(product);
    this.router.navigate(['user/buy']);

  }
  searchSubmit() {
    console.log(this.searchData.query);
    this.api.searchProduct(this.searchData.query)
      .subscribe(res => {
        this.products = res;
        console.log(this.products);
      })

  }
  onValueChange() {
    // console.log(this.minprice)
    // console.log(this.maxprice)
    this.api.filterProductByRange(this.minprice, this.maxprice)
      .subscribe(res => {
        this.products = res;
        console.log(this.products);
      })
  }

}
