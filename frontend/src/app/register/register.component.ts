import { Component, OnInit, NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import {AuthenticationService } from  './authentication.service'
import {HttpClient} from '@angular/common/http';
import {User} from './User';
import { NgForm } from '@angular/forms';
import { RouterModule,Router } from  '@angular/router';
import { RegisterService } from './register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user:User=new User();
  msg='';

  constructor(private _studentService:AuthenticationService, private http:HttpClient,private router: Router,private _service :RegisterService) { }

  ngOnInit(): void {
  }
  data: {};

  stu: User = new User();
  students:Array<User>=[];

 fun()
 {
   alert("Registration successful you can now login to the system")
 }

  registerUser(){
    this._service.registerUserFromRemote(this.user).subscribe(
      data=>{
        console.log("response recieved");
        this.router.navigate(['/login'])
      },
      error =>
      {
        console.log("exception occured");
        this.msg=error.error;
        
      }
    )
  }

}
