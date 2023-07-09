import { Component } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Req } from 'src/app/Model/req';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-update-request',
  templateUrl: './update-request.component.html',
  styleUrls: ['./update-request.component.css']
})
export class UpdateRequestComponent {

  req:Req=new Req();


  id: string|null
  request:Req
  constructor(private service: IcinBankserviceService, private route: Router,private activatedroute:ActivatedRoute){}

  ngOnInit(){

    const id= this.activatedroute.snapshot.paramMap.get("id")!
    let acno=this.req.useraccountnumber
    console.log(acno)
    this.service.getRequestById(Number(id)).subscribe(y=>this.request=y)
  }

  onSubmit(){
    const id= this.activatedroute.snapshot.paramMap.get("id")!
    this.service.updateStatus(this.req,Number(id)).subscribe()
    alert("Status Approved")
    this.route.navigate(['admindashboard'])
  }
  
}
