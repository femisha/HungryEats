import { Component, OnInit } from '@angular/core';
import { Food } from 'src/app/models/Food';
import { Table } from 'src/app/models/table';
import { FoodService } from 'src/app/Services/food.service';

@Component({
  selector: 'app-food',
  templateUrl: './food.component.html',
  styleUrls: ['./food.component.css']
})
export class FoodComponent implements OnInit {

  //constructor() { }

 // ngOnInit(): void {
 // }
 
  foods: any= {};
  getFood:Table[]=[];
  
  constructor(private _service:FoodService) {
    
   }

  ngOnInit(): void {
  }
  insert:any;

  myfun()
  {
    alert("food added successfully");
  }

  addFood(data:any) {
    this._service.addFood(this.foods).subscribe((data)=>{
      console.log(data);
      this.foods=data;
     });
    }

    getFoodById(foodId:number)
    {
      this._service.getFoodById(13).subscribe((data)=>{
        console.log(data);
        this.getFood=data;
       });
    }

   }