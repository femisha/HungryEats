import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { cart } from '../models/Cart';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  

  constructor(private http:HttpClient) { }
  private baseUrl = 'http://localhost:9091/api/v1/';



  addCart(cart: object): Observable<cart> {
    return this.http.post(`${this.baseUrl}`+'Cart',cart);
  }


  getAllCart():Observable<any>{
    return this.http.get<any>("http://localhost:9091/api/v1/carts");
  }
  
}
