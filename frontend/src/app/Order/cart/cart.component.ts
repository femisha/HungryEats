import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/Services/cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  
  cart : any = {};
  constructor(private service:CartService) { }


  ngOnInit(): void {
    this.getAllCart();
    
    
  }

  getAllCart = ()=>{
    this.service.getAllCart().subscribe((data)=>{
      console.log(data);
      this.cart=data;
    }, (err)=>{
      console.log(err);
      //this.errormessage ="some thing went wrong";
    
    })
  }

  addCart(){
    this.service.addCart(this.cart).subscribe((data)=>{
      console.log(data);
      this.cart=data;
     });
     

}
}
