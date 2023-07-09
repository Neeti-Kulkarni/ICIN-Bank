import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent {


  constructor(private service: IcinBankserviceService,private route:Router){}
  logout(){
    this.route.navigate(['adminlogin'])
  }
}
