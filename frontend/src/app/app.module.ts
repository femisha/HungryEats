import { HttpClientModule} from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatToolbarModule} from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatDialogModule} from '@angular/material/dialog';


import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FavouritesComponent } from './favourites/favourites.component';
import { SearchComponent } from './search/search.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { OrderComponent } from './order/order/order.component';
//import { AdminHomeComponent } from './Restaurant/admin-home/admin-home.component';
import { LogoutComponent } from './logout/logout.component';
import { CartComponent } from './Order/cart/cart.component';
import { FoodComponent } from './Restaurant/food/food.component';
import { RestaurantComponent } from './Restaurant/restaurant/restaurant.component';
import { FoodService } from './Services/food.service';
import { RestaurantService } from './Services/restaurant.service';
import { OrderService } from './Services/order.service';
import { CartService } from './Services/cart.service';
import { FavouritesService } from './Services/favourites.service';
import { DashboardserviceService } from './Services/dashboardservice.service';
import { SharedService } from './Services/shared.service';
import { AdminComponent } from './admin/admin.component';
//import { BehaviorSubject } from "rxjs/BehaviorSubject"
//import { Ng2SearchPipe } from 'ng2-search-filter';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    RegisterComponent,
    SearchComponent,
    FavouritesComponent,
    RestaurantComponent,
    FoodComponent,
    OrderComponent,
    CartComponent,
    LogoutComponent,
    AdminComponent,
    //AdminHomeComponent
  ],
  entryComponents: [
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatToolbarModule,
    MatIconModule,
    MatDialogModule,
    NgxPaginationModule,
    Ng2SearchPipeModule
   // Ng2SearchPipe
    
   // BehaviorSubject
    
  ],
  providers:[FoodService,RestaurantService,OrderService,CartService,FavouritesService,DashboardserviceService,SharedService],
  bootstrap: [AppComponent]
})
export class AppModule { }
