import { Component, OnInit } from '@angular/core';
import { Favourites } from '../models/Favourites';
import { Food } from '../models/Food';
import { Order } from '../models/Order';
import { CartService } from '../Services/cart.service';
import { DashboardserviceService } from '../Services/dashboardservice.service';
import { FavouritesService } from '../Services/favourites.service';
import { FoodService } from '../Services/food.service';
import { OrderService } from '../Services/order.service';
import { RestaurantService } from '../Services/restaurant.service';
import { SharedService } from '../Services/shared.service';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  foods:any=[];
  favourites:any [] = [];
  favouriteList:any ={};
  restaurant:any=[];

  order:any={};
  constructor(private _service:FoodService,private _sharedService:SharedService,private _cartService:OrderService, private _favservice:FavouritesService,private _resservice:RestaurantService) { }

  ngOnInit(): void {

    this._service.getAllFood().subscribe(
      data => {
       this.foods = data;
       console.log(data);
     });

     this.getRestaurant();

     
    
  }
  getRestaurant() {
    this._resservice.getAllRestaurant().subscribe(data=>{
      this.restaurant=data;
      console.log(data);
     });
  }

 getFoodById(foodId:Food)
  {
     this._service.getFoodById(foodId.foodId).subscribe((data)=>{
       console.log(data);
       this.foods=data;
       this.favourites.push(data);
       this._sharedService.setFavourites(this.favourites);
      // this._sharedService.setOrder(this.order);
     });
   }
   
    myFunction()
      {
        alert("added to favourites");
      }
      myFunction2()
      {
        alert("Added to cart");
      }

   addOrder(order:Order){
    this._cartService.addOrder(order).subscribe((data)=>{
      console.log(data);
  
     });
  }
   
 
  addFavourite(food:Food){
    this._favservice.addFavourites(food).subscribe((data)=>{
      console.log(data)
      if(data==null)
      {
        this._favservice.addFavourites(food).subscribe(data=>{

          console.log("favourite added");
          alert("Favourite added")});
        }
        else
        {
          alert("favourite alreadu added")
        }
      

      }
     
    );
  }



  addRestaurant(data:any) {
    

    this._resservice.addRestaurant(this.restaurant).subscribe((data)=>{
      console.log(data);
      this.restaurant=data;
     });
    }




   
}


    
    

  
  

