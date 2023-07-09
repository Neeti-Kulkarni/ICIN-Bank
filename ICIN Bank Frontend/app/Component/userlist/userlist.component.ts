import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent {

  user: User[]
  constructor(private service: IcinBankserviceService, private route: Router){}
  
  ngOnInit(){
    this.service.getAllUsers().subscribe(x=>this.user=x)
  }
}
