import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Req } from 'src/app/Model/req';
import { Transaction } from 'src/app/Model/transaction';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  public profileuser: User;
  transaction: Transaction[]
  req: Req[]
  constructor(private service:IcinBankserviceService, private route:Router){}

  ngOnInit(){
    this.service.getUserProfile().subscribe(x=>{
      this.profileuser=x
      console.log("From home",this.profileuser)
    })
    this.service.getuserTransaction(this.profileuser.useraccountnumber).subscribe(x=>this.transaction=x)
    this.service.getuserRequest(this.profileuser.useraccountnumber).subscribe(y=>this.req=y)
  }
}
