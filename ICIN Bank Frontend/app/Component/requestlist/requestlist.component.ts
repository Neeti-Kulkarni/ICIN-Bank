import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Req } from 'src/app/Model/req';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-requestlist',
  templateUrl: './requestlist.component.html',
  styleUrls: ['./requestlist.component.css']
})
export class RequestlistComponent {

  req: Req[];
  constructor(private service: IcinBankserviceService, private route: Router){}

  ngOnInit(){
    this.service.getallRequest().subscribe(x=>this.req=x)
  }
}
