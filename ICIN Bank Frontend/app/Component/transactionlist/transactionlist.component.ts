import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Transaction } from 'src/app/Model/transaction';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-transactionlist',
  templateUrl: './transactionlist.component.html',
  styleUrls: ['./transactionlist.component.css']
})
export class TransactionlistComponent {

  transaction: Transaction[]
  constructor(private service: IcinBankserviceService, private route: Router){}

  ngOnInit(){
    this.service.getAllTransaction().subscribe(x=>this.transaction=x)
  }
}
