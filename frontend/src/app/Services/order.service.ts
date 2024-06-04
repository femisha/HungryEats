import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Order } from '../models/Order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private baseUrl = 'http://localhost:9091/api/v1/';

  constructor(private http:HttpClient) { }


  addOrder(order:object):Observable<Order>{

    return this.http.post(`${this.baseUrl}`+'Order',order);
  }

  getOrder(id:number):Observable<any>{
    return this.http.get(`${this.baseUrl}/Order`);
  }
  getOrderList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`+'Orders');
  }

  addCart(cart: object): Observable<any> {
    return this.http.post<any>("http://localhost:9091/api/v1/carts",cart);
  }
}

  
