import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from 'src/app/Model/admin';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {

  admin : Admin= new Admin();

  constructor(private service: IcinBankserviceService, private route: Router){}



  onSubmit(){
    this.service.adminLogin(this.admin).subscribe(x=>{
    if(x==true){
      this.route.navigate(['admindashboard'])
    }else if(x==false){
      alert("Invalid Password")
    }else{
      alert("Admin not found")
    }
    })
  }
}
