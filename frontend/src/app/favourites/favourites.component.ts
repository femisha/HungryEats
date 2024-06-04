import { Component, OnInit } from '@angular/core';
import { Favourites } from '../models/Favourites';
import { FavouritesService } from '../Services/favourites.service';
import { RestaurantService } from '../Services/restaurant.service';
import { SharedService } from '../Services/shared.service';
​
@Component({
  selector: 'app-favourites',
  templateUrl: './favourites.component.html',
  styleUrls: ['./favourites.component.css']
})
export class FavouritesComponent implements OnInit {
​
  favouritesList: any = [];
  errorMessage: string ="";
  
​
  constructor(private _service:RestaurantService,private _favservice:FavouritesService) { }
​
  ngOnInit(): void {

    this.getFavourites();
  }

 // getFavourites(){
 //   this.favouritesList = this._sharedService.getFavourites();
 // }

 addFavourite(){
  this._favservice.addFavourites(this.favouritesList).subscribe((data)=>{
    console.log(data);
    this.favouritesList=data;
   });
}
myfun()
{
  alert("Item removed from favourite")
}

getFavourites(){
  this._favservice.getAllFavourites().subscribe((data)=>{
    console.log(data);
    this.favouritesList=data;
  });
}

deleteFavourite(id:number)
{
    this._favservice.deleteFavourites(id).subscribe((data)=>
    {
      console.log("item deleted");
    });
}


}


  /* deleteFavorite(foodId : Number) {
     this._favservice.deleteFavourites(foodId).subscribe(data=>{
       console.log("Record Deleted")
       
     },err=>{console.log(err);
        err.error = "Server down";
        this.errorMessage = "some thing went wrong";
      
     });*/




  


    // deleteFavourites(index: any){
     //  this.favouritesList.splice(index,1);
      //this._sharedService.deleteFavourite(index);
     //}
    // delfun()
    // {
    //   alert("Food item removed");
    // }
    
  
    
  
​

​