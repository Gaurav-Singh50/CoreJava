import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {


  }

  //add user
  public addUser(user: any) {
    console.log("inside add User and user =", user);
    return this.http.post('http://localhost:8112/user/', user);

  }
}
