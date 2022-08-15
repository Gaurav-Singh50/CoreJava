import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginService } from 'src/app/services/login.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginData = {
    username: '',
    password: ''
  }


  constructor(private snack: MatSnackBar, private login: LoginService) { }

  ngOnInit(): void {
  }
  formSubmit() {
    if (this.loginData.username.trim() == '' || this.loginData.username == null || this.loginData.password.trim() == '' || this.loginData.password == null) {
      this.snack.open("** All the feilds are required !!", '', {
        duration: 1000,
      });
      return;

    }
    //generate token
    this.login.generateToken(this.loginData).subscribe((data: any) => {
      this.snack.open("Wohoo !! Logged In Sucessfully", '', {
        duration: 3000,
      })
      console.log(data);

      //login..
      this.login.loginUser(data.token);
      this.login.getCurrentUser().subscribe(
        (user: any) => {
          this.login.setUser(user);
          console.log(user);
          //redirect //admin
          //redirect //normal

          if (this.login.getUserRole() == 'Admin') {
            window.location.href = "/admin";
            this.login.loginStatusSubject.next(true);
          } else if (this.login.getUserRole() == 'Normal') {
            window.location.href = "/user";
            this.login.loginStatusSubject.next(true);
          }
          else {
            this.login.logout();

          }

        }
      )
    },
      (error) => {
        this.snack.open("Inavlid Credentials Try again!!!", '', {
          duration: 3000,
        })
        console.log(error);

      });
  }
}
