import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent {

  user: User= new User();
  constructor(private service: IcinBankserviceService, private route: Router){}
  
  onSubmit(){
    this.service.saveUser(this.user).subscribe();
    alert("Account will be Generated Soon")
    this.route.navigate(['userlogin'])
  }
}
