import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/services/user.service';




@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService: UserService, private snack: MatSnackBar) { }

  public user = {
    username: '',
    password: '',
    firstName: '',
    lastName: '',
    email: '',
    phone: '',

  };

  ngOnInit(): void {
  }

  formSubmit() {
    if (this.user.username.trim() == '' || this.user.username == null || this.user.password.trim() == '' || this.user.password == null ||
      this.user.firstName.trim() == '' || this.user.firstName == null || this.user.lastName.trim() == '' || this.user.lastName == null ||
      this.user.email.trim() == '' || this.user.email == null || this.user.phone == '' || this.user.phone == null) {
      this.snack.open("** All the feilds are required !!", '', {
        duration: 1000,
      });
      return;
    }
    else {
      //add user
      this.userService.addUser(this.user).subscribe((data) => {
        this.snack.open("Registerd Sucessfully!!", '', {
          duration: 1000,
        })
        console.log(data);
      }, (error) => {
        this.snack.open("Already user exits with this username", '', {
          duration: 1000,
        })

      }
      )
      // this.userService.addUser(this.user).subscribe(error => {
      //   this.snack.open(" UserName Already Exists !! ");
      //   console.log(error);
      // }
      // )
    }

  }
  //add user


}
