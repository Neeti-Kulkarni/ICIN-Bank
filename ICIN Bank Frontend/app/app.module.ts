import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserloginComponent } from './Component/userlogin/userlogin.component';
import { HeaderComponent } from './Component/header/header.component';
import { HomeComponent } from './Component/home/home.component';
import { ProfileComponent } from './Component/profile/profile.component';
import { TransactionComponent } from './Component/transaction/transaction.component';
import { ReqComponent } from './Component/req/req.component';
import { AdminComponent } from './Component/admin/admin.component';
import { AdmindashboardComponent } from './Component/admindashboard/admindashboard.component';
import { UserlistComponent } from './Component/userlist/userlist.component';
import { AdduserComponent } from './Component/adduser/adduser.component';
import { TransactionlistComponent } from './Component/transactionlist/transactionlist.component';
import { RequestlistComponent } from './Component/requestlist/requestlist.component';
import { BlockuserComponent } from './Component/blockuser/blockuser.component';
import { UpdateRequestComponent } from './Component/update-request/update-request.component';

@NgModule({
  declarations: [
    AppComponent,
    UserloginComponent,
    HeaderComponent,
    HomeComponent,
    ProfileComponent,
    TransactionComponent,
    ReqComponent,
    AdminComponent,
    AdmindashboardComponent,
    UserlistComponent,
    AdduserComponent,
    TransactionlistComponent,
    RequestlistComponent,
    BlockuserComponent,
    UpdateRequestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
