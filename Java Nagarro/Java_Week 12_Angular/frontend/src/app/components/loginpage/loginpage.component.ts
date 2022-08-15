import { Component, OnInit } from '@angular/core';
// import { FormBuilder, FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { DataShareService } from '../../services/data-share.service';

// import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit{

  
  form: any;
  constructor(private http: HttpClient, private router: Router, private dataserve:DataShareService) { 
    
  }
  ngOnInit(): void {
    this.form = {
      username: "",
      password: "",
    }
  }


  print() {
    console.log(this.form.username)
  }


  login(){
    
    this.http.get<any>("http://localhost:3000/users")
    .subscribe(res =>{
      const user = res.find((a:any)=>{
        return a.username == this.form.username && a.password == this.form.password
      });
      if(user){
        
        
        console.log(user)
        if(user.role === "Teacher"){
          alert("Signup Successful")
          this.router.navigate(['teacher'])
        }else {
          this.dataserve.setData(this.form.username);

          // console.log(this.dataserve.getData())
          this.router.navigate(['showresult']);
        }
      }else{
        alert("User not found")
      }
    },err=>{
      alert("Something went Wrong")
    }
    )
  }
    
  
  


}

function username(arg0: string[], username: any) {
  throw new Error('Function not implemented.');
}
