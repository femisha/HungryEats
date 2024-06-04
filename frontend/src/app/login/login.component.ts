import { Component, ComponentFactoryResolver, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from  '@angular/forms';
import { RouterModule,Router,ActivatedRoute } from  '@angular/router';
import {User } from '../register/user';
import {NgForm} from '@angular/forms'
import { RegisterService } from '../register/register.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router,private _service : RegisterService) { }

  user= new User();
  msg=''

  ngOnInit() {
    this.loginUser();
  }
  //get formControls() { return this.loginForm.controls; }

  loginUser(){
    this._service.loginUserFromRemote(this.user).subscribe(data => {
        console.log("response recieved") ;
        this.router.navigate(['/login/dashboard'])
    },
      error=>{
        console.log("exception occured");
        this.msg="Bad crendentials, please enter valid email id and password";
      }
    )
    
   
  }
  // navigateToLogin()
  // {
  //   console.log("got here ");
  //   this.router.navigate(['/signup'])
  //   console.log("after sign up");
  // }
  // functionOnWhichRedirectShouldHappen(){
  //   this.router.navigate(['/signup']);
  // }


 
}
