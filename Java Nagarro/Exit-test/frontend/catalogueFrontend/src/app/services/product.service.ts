import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }


  url: string = "http://localhost:8112/products/"

  getProducts() {
    return this.http.get<any>(this.url)
  }

  getProduct(id: number) {
    return this.http.get<any>(this.url + id)
  }

  searchProduct(query: string) {
    return this.http.get<any>(this.url + "filter/" + query)
  }
  filterProductByRange(minprice: number, maxprice: number) {
    return this.http.get<any>(this.url + "filter/" + minprice + "/" + maxprice)
  }

  checkPincode(pincode: number) {
    return this.http.get<any>("http://localhost:8112/days/" + pincode)
  }
}