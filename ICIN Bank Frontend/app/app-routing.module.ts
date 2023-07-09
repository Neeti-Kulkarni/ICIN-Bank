import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserloginComponent } from './Component/userlogin/userlogin.component';
import { HomeComponent } from './Component/home/home.component';
import { ProfileComponent } from './Component/profile/profile.component';
import { TransactionComponent } from './Component/transaction/transaction.component';
import { ReqComponent } from './Component/req/req.component';
import { AdminComponent } from './Component/admin/admin.component';
import { AdmindashboardComponent } from './Component/admindashboard/admindashboard.component';
import { UserlistComponent } from './Component/userlist/userlist.component';
import { AdduserComponent } from './Component/adduser/adduser.component';
import { RequestlistComponent } from './Component/requestlist/requestlist.component';
import { TransactionlistComponent } from './Component/transactionlist/transactionlist.component';
import { BlockuserComponent } from './Component/blockuser/blockuser.component';
import { UpdateRequestComponent } from './Component/update-request/update-request.component';

const routes: Routes = [
  { path:"userlogin",component:UserloginComponent},
  { path:"home",component:HomeComponent},
  { path:"profile",component:ProfileComponent},
  { path:"transfer",component:TransactionComponent},
  { path:"req",component:ReqComponent},
  { path:"adminlogin",component:AdminComponent},
  { path:"admindashboard",component:AdmindashboardComponent},
  { path:"userlist",component:UserlistComponent},
  { path:"adduser",component:AdduserComponent},
  { path:"transactionlist",component:TransactionlistComponent},
  { path:"requestlist",component:RequestlistComponent},
  { path:"blockuser/:id",component:BlockuserComponent},
  { path:"updateReq/:id",component:UpdateRequestComponent},
  { path:"**",component:UserloginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
