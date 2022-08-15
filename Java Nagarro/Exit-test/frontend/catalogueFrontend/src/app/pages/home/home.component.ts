import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  searchData = {
    query: ''
  }
  constructor(private http: HttpClient) { }
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
  searchSubmit() {
    console.log(this.searchData.query);
    this.api.searchProduct(this.searchData.query)
      .subscribe(res => {
        this.products = res;
        console.log(this.products);
      })

  }
}
