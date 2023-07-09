import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Req } from 'src/app/Model/req';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-req',
  templateUrl: './req.component.html',
  styleUrls: ['./req.component.css']
})
export class ReqComponent {

  request : Req= new Req();
  user: User
  constructor(private service: IcinBankserviceService, private route: Router){}

  ngOnInit(){
    this.service.getUserProfile().subscribe(x=>this.user=x)
  }

  onSubmit(){

    this.request.username=this.user.username;
    this.request.useraccountnumber= this.user.useraccountnumber;
    this.service.saveRequest(this.request).subscribe();
    alert("Request Submited")
    this.route.navigate(['home'])
  }
}
