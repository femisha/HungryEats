import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import {HttpClient} from '@angular/common/http';
import { Dashboard } from '../models/Dashboard';

@Injectable({
  providedIn: 'root'
})
export class DashboardserviceService {
 // private baseUrl = 'http://localhost:9090/api/v1/';
  constructor(private _http: HttpClient) { }

  addFavourites(favourites : object): Observable<any>{
    return this._http.post('http://localhost:9090/api/v1/display',favourites);
  }
  getAllFavourites():Observable<Dashboard>{
    ​
       return this._http.get<Dashboard>("http://localhost:8072/api/v1/displayAll");
      }
    ​


}
