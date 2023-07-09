import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent {

user: User= new User();



constructor(private service: IcinBankserviceService, private route: Router){}

onSubmit(){
  this.service.userLogin(this.user).subscribe(x=>{
    console.log(x)
    if(x==true){
      this.service.getUserById(this.user.userid).subscribe(x=>{
        this.service.addUserProfile(x)
        if(x.block=="true"){
          alert("User Blocked")
        }else{
          console.log("from login class",x)
        this.route.navigate(['home'])
        }

        
      })
    }else if(x==false){
      alert("Invalid Password")
    }else{
      alert("User Not Found ")
    }
  })
}

}
