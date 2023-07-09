import { Component } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-blockuser',
  templateUrl: './blockuser.component.html',
  styleUrls: ['./blockuser.component.css']
})
export class BlockuserComponent {

  user:User;

  updateuser:User=new User();
  id:string | null
  constructor(private service: IcinBankserviceService, private route: Router,private activatedroute:ActivatedRoute){}

  ngOnInit(){
     this.id= this.activatedroute.snapshot.paramMap.get("id")!
    console.log(this.id)
    this.service.getUserById(Number(this.id)).subscribe(x=>this.user=x)
  }

  onSubmit(){
    const id= this.activatedroute.snapshot.paramMap.get("id")!
    console.log(id)
    this.service.BlockUser(this.updateuser,Number(id)).subscribe();
    alert("User Blocked")
    this.route.navigate(['admindashboard'])
  }
}

