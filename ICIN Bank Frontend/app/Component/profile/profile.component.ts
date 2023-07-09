import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent {

  user: User;
  constructor(private service: IcinBankserviceService, private route: Router){}

  ngOnInit(){
    this.service.getUserProfile().subscribe(x=>{
      this.user=x
      console.log("from profile", this.user)
    })
  }

  logout(){
    this.service.emptyUserProfile();
    alert("Logout Success")
    this.route.navigate(['/userlogin'])
  }
}
