import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map} from 'rxjs/operators';
// import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ResultService {

  constructor(private http: HttpClient) { }

  url :string = "http://localhost:3000/results/"
  postResult(data :any){
      return this.http.post<any>(this.url, data)
      .pipe(map((res:any)=>{
        return res;
      }))
  }

  getResults(){
    return this.http.get<any>(this.url)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  getResult(id :number){
    return this.http.get<any>(this.url +id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  updateResult(data:any, id :number){
    return this.http.put<any>(this.url +id, data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  deleteResult(id :number){
    return this.http.delete<any>(this.url +id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
}

