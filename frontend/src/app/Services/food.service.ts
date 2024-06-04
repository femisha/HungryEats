import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable} from 'rxjs';
import { Food } from '../models/Food';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  private url = 'http://localhost:7052/api/v1/';
  constructor(private http: HttpClient) { }
  //  addFood method using HttpClient for a saving food item details

  addFood(food: object): Observable<any> {
    return this.http.post(`${this.url}`+'food',food);
  }  
  //  updateFood method to update a food item
  updateFood(food: object): Observable<any> {
    return this.http.put(`${this.url}`+'food',food);
  }
  //  deleteOrder method to delete a food item
  deleteFood(id: number): Observable<any> {
    return this.http.delete(`${this.url}/food/${id}`,{responseType:'text'});
  }
  getAllFood():Observable<Food>{
    ​
       return this.http.get<Food>("http://localhost:7052/api/v1/foods");
      }

   getFoodById(foodId:Number): Observable<any> {
       return this.http.get<any>("http://localhost:7052/api/v1/food/"+foodId);
      //  return this.http.get<any>("http://localhost:8052/api/v1/food/");
        
    }
    

}
  

