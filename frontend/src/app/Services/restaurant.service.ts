import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable} from 'rxjs';
import { Restaurant } from '../models/Restaurant';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {
  private url = 'http://localhost:7052/api/v1/';
  constructor(private http: HttpClient) { }
  //  add method using HttpClient for a saving restaurant details
  addRestaurant(restaurant: object): Observable<any> {
    return this.http.post(`${this.url}`+'restaurant',restaurant);
  }  
  //  update method to update a restaurant
  updateRestaurant(restaurant: object): Observable<any> {
    return this.http.put(`${this.url}`+'restaurant',restaurant);
  }
  getAllRestaurant():Observable<any>{
    ​
       return this.http.get<Restaurant>("http://localhost:7052/api/v1/restaurants");
      }

 
  



 // constructor() { }
}
