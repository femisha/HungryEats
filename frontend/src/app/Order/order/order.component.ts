import { Component, OnInit } from '@angular/core';
import { Order } from 'src/app/models/Order';
import { CartService } from 'src/app/Services/cart.service';
import { OrderService } from 'src/app/Services/order.service';
import { SharedService } from 'src/app/Services/shared.service';
@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  orderList: any = {};

  constructor(private service:OrderService,private _service:CartService) { }

  ngOnInit(): void {
    this.getOrderList;
    

  }
  

  addOrder(){
    this.service.addOrder(this.orderList).subscribe((data)=>{
      console.log(data);
      this.orderList=data;
     });
  }

  addCart(cart:any)
{
  console.log(cart);
  this._service.addCart(cart).subscribe(data=>{
  console.log(data);
  });
}
myfun1()
  {
alert("your order has been placed");
  }

    
    
  
  //getOrder(){
  //  this.service.getOrder(this.orderList).subscribe((data)=>{
   //   console.log(data);
   //   this.orderList=data;
  //  });
    
  //}
  getOrderList(){
    this.service.getOrderList().subscribe((data)=>{
      console.log(data);
      this.orderList=data;
    });
  }
  
  }
