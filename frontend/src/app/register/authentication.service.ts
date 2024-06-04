import { User } from './user';
import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import {HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService 
{

  public api:string ="http://localhost:3000/students";

  constructor(private http:HttpClient) 
  {


  }
  addUser(stu: User):Observable<User>
   {

    console.log("here");
     return this.http.post<User>(this.api,stu);

   }
  
   
}
