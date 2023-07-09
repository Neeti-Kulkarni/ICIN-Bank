import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Transaction } from 'src/app/Model/transaction';
import { User } from 'src/app/Model/user';
import { IcinBankserviceService } from 'src/app/Service/icin-bankservice.service';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent {

  transaction: Transaction= new Transaction();
  user: User
  transactionuser: User= new User()
  constructor(private service: IcinBankserviceService, private route: Router){}

  ngOnInit(){
    this.service.getUserProfile().subscribe(x=>this.user=x)
    console.log(this.user)
  }

  onSubmit(){
    this.transaction.senderaccountnumber=this.user.useraccountnumber
    this.service.saveTransaction(this.transaction).subscribe()
    alert("Transaction success");
    let amount = this.transaction.senderamount
    console.log(amount)
   
    let userAmount = this.user.amountdeposited
    console.log(userAmount)
    let updatedAmount: Number=Number(userAmount)-Number(amount)
    console.log(updatedAmount)

    this.transactionuser.amountdeposited=updatedAmount
    console.log(this.transactionuser)
    console.log(this.user.userid)
    this.service.updateUser(this.transactionuser, this.user.userid).subscribe()

    this.route.navigate(['home'])
    
   
    
  }

  depositSubmit(){
    this.transaction.senderaccountnumber=this.user.useraccountnumber
    this.transaction.receivername="self"
    this.service.saveTransaction(this.transaction).subscribe()
    alert("Transaction success");
    let amount = this.transaction.senderamount
    console.log(amount)
   
    let userAmount = this.user.amountdeposited
    console.log(userAmount)
    let updatedAmount: Number=Number(userAmount)+Number(amount)
    console.log(updatedAmount)
    this.transactionuser.amountdeposited=updatedAmount
    this.service.updateUser(this.transactionuser, this.user.userid).subscribe()

    this.route.navigate(['home'])
  }

  WithdrawSubmit(){
    this.transaction.senderaccountnumber=this.user.useraccountnumber
    this.transaction.receivername="self"
    this.service.saveTransaction(this.transaction).subscribe()
    alert("Transaction success");
    let amount = this.transaction.senderamount
    console.log(amount)
   
    let userAmount = this.user.amountdeposited
    console.log(userAmount)
    let updatedAmount: Number=Number(userAmount)-Number(amount)
    console.log(updatedAmount)
    this.transactionuser.amountdeposited=updatedAmount
    this.service.updateUser(this.transactionuser, this.user.userid).subscribe()

    this.route.navigate(['home'])
  }
}
