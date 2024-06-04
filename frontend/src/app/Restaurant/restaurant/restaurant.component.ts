import { Component, OnInit } from '@angular/core';
import { Restaurant } from 'src/app/models/Restaurant';
import { RestaurantService } from 'src/app/Services/restaurant.service';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {
  
  restaurants: any= {};
  
  constructor(private _service:RestaurantService) { }

  ngOnInit(): void {
  }
  insert:any;
  myfun()
  {
    alert("restauarent added successfully");
  }

  addRestaurant(data:any) {
    

    this._service.addRestaurant(this.restaurants).subscribe((data)=>{
      console.log(data);
      this.restaurants=data;
     });
    }

   /* getRestaurant(data:any)
    {
      this._service.getAllRestaurant(this.restaurants).subscribe((data)=>
      {
        console.log(data);
        this.restaurants=data;
      });
    }*/

    



}
