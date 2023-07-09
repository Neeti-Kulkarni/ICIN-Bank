import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../Model/user';
import { BehaviorSubject, Observable } from 'rxjs';
import { Admin } from '../Model/admin';
import { Transaction } from '../Model/transaction';
import { Req } from '../Model/req';

@Injectable({
  providedIn: 'root'
})
export class IcinBankserviceService {

  baseURL: string ="http://localhost:8080"

  public userprofile: any;
  public userview= new BehaviorSubject<any>([])

  constructor(private http : HttpClient) { }

  getAllUsers():Observable<User[]>{
    return this.http.get<User[]>(this.baseURL+"/allusers")
  }

  getUserById(id: Number):Observable<User>{
    return this.http.get<User>(this.baseURL+"/getuserbyid/"+id)
  }

  saveUser(user: User){
    return this.http.post(this.baseURL+"/adduser/",user)
  }

  updateUser(user: User, id: Number):Observable<User>{
    return this.http.put<User>(this.baseURL+"/updateUser/"+id, user)
  }
  userLogin(user: User){
    return this.http.post(this.baseURL+"/userlogin",user)
  }

  adminLogin(admin: Admin){
    return this.http.post(this.baseURL+"/adminlogin",admin)
  }

  getUserProfile(){
    return this.userview.asObservable();
  }

  addUserProfile(user: any){
    this.userprofile=user;
    this.userview.next(this.userprofile);
    console.log("from service class",this.userprofile)
  }

  emptyUserProfile(){
    this.userprofile=[]
    this.userview.next(this.userprofile)
  }
  

  getAllTransaction():Observable<Transaction[]>{
    return this.http.get<Transaction[]>(this.baseURL+"/allTransactions")
  }

  getTransactionById(id: Number):Observable<Transaction>{
    return this.http.get<Transaction>(this.baseURL+"/getTransactionById/"+id)
  }

  saveTransaction(transaction:Transaction){
    return this.http.post(this.baseURL+"/addTransaction",transaction)
  }

  getuserTransaction(Acno: Number):Observable<Transaction[]>{
    return this.http.get<Transaction[]>(this.baseURL+"/userTransaction/"+Acno)
  }

  getallRequest():Observable<Req[]>{
    return this.http.get<Req[]>(this.baseURL+"/allRequest")
  }

  getRequestById(id:Number):Observable<Req>{
    return this.http.get<Req>(this.baseURL+"/request/"+id)
  }

  saveRequest(req: Req){
    return this.http.post(this.baseURL+"/addRequest",req)
  }

  getuserRequest(acno: Number):Observable<Req[]>{
    return this.http.get<Req[]>(this.baseURL+"/userReq/"+acno)
  }

  BlockUser(user: User, id:Number){
    return this.http.put(this.baseURL+"/blockUser/"+id, user)
  }

  updateStatus(req: Req, id:Number){
    return this.http.put(this.baseURL+"/updateReqStatus/"+id,req)
  }

  getUserByAc(acno:Number):Observable<User>{
    return this.http.get<User>(this.baseURL+"/getuserByac/"+acno)
  }

  updateUserAc(user:User, id:Number){
    return this.http.put(this.baseURL+"/updateUserAc/"+id,user)
  }
}
