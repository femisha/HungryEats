import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Favourites} from '../models/Favourites';
​
​
@Injectable({
  providedIn: 'root'
})
export class FavouritesService {
​
  private baseUrl = 'http://localhost:8072/api/v1';
​
  constructor(private _http: HttpClient) { }
​
  addFavourites(favourites : object): Observable<any>{
    //return this._http.post('${this.baseUrl}'+'/Favourites',favourites);
    return this._http.post(`${this.baseUrl}`+'/Favourites',favourites);
  }
​
​
  deleteFavourites(id: number): Observable<any>{
    return this._http.delete("http://localhost:8072/api/v1/favourite/"+id);
  }
​
getAllFavourites():Observable<Favourites>{
​
   return this._http.get<Favourites>("http://localhost:8072/api/v1/favourites");
  }
  getFoodById(id:any): Observable<any> {
    return this._http.get<any>("http://localhost:8052/api/v1/food/"+id);
}
​
​
​
}