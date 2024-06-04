import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';
import {HttpClient} from '@angular/common/http';
import {HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private _http : HttpClient) { }
    public loginUserFromRemote(user :User):Observable<any>{
      return this._http.post<any>("http://localhost:8090/login",user)
    }
    public registerUserFromRemote(user :User):Observable<any>{
      return this._http.post<any>("http://localhost:8090/registeruser",user);
    }
    handleError(error: Response){

    }
}
