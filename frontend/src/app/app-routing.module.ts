import { DashboardComponent } from './dashboard/dashboard.component';
import { FavouritesComponent } from './favourites/favourites.component';
import { LoginComponent } from './login/login.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import {OrderComponent} from './Order/order/order.component';
import { SearchComponent } from './search/search.component';
import {FoodComponent} from './Restaurant/food/food.component';
import {RestaurantComponent} from './Restaurant/restaurant/restaurant.component';
import {LogoutComponent} from './logout/logout.component';
import { CartComponent } from './Order/cart/cart.component';
import { AdminComponent } from './admin/admin.component';
//import { AdminHomeComponent } from './Restaurant/admin-home/admin-home.component';


const routes: Routes = [
  {path:'',redirectTo:'/login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  {path:'signup',component:RegisterComponent},
  {path:'login/dashboard',component:DashboardComponent},
  { path: 'search', component: SearchComponent},
  {path:'dashboard',component:DashboardComponent},
  {path:'favourite',component:FavouritesComponent},
  {path:'cart',component:CartComponent},
  {path:'logout',component:LogoutComponent},
  {path:'order',component:OrderComponent},
  {path:'restaurant',component:RestaurantComponent},
  {path:'food',component:FoodComponent},
  {path:'admin',component:AdminComponent},
  {path:'cart',component:CartComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
