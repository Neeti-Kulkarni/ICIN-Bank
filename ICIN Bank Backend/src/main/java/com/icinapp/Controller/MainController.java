package com.icinapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.icinapp.Entity.Admin;
import com.icinapp.Entity.Request;
import com.icinapp.Entity.SavingsDetails;
import com.icinapp.Entity.Transaction;
import com.icinapp.Entity.User;
import com.icinapp.Repository.UserRepository;
import com.icinapp.Service.IcinBankServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200/")
public class MainController {

	@Autowired
	private IcinBankServiceImpl service;
	
	@Autowired
	private UserRepository ur;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User u) {
		return service.addUser(u);
	}
	
	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id){
		User user= ur.findById(id).get();
		if(user==null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return service.getallUser();
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable long id) {
		service.deleteUser(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public void updateUserSavings(@RequestBody User u,@PathVariable long id) {
		service.updateUser(u, id);
	}
	
	@GetMapping("/userTransaction/{acno}")
	public List<Transaction> getbyUserTransaction(@PathVariable long acno){
		return service.getUserTransaction(acno);
	}
	
	
	@PutMapping("/blockUser/{id}")
	public void blockUser(@RequestBody User u,@PathVariable long id) {
		service.blockUser(u, id);
	}
	
	@GetMapping("/getuserByac/{acno}")
	public User getByAcno(@PathVariable long acno) {
		return service.getUserByAccno(acno);
	}
	
	@PutMapping("/updateUserAc/{id}")
	public void updateUserAc(@RequestBody User u,@PathVariable long id) {
		service.updateUserAC(u, id);
	}
	
	//**********************************************************************************
	
	@GetMapping("/allTransactions")
	public List<Transaction> getallTransaction(){
		return service.getallTransaction();
	}
	
	@GetMapping("/getTransactionById/{id}")
	public Transaction getTransactionById(@PathVariable int id) {
		return service.getTransactionById(id);
	}
	
	@PostMapping("/addTransaction")
	public Transaction addTransaction(@RequestBody Transaction t) {
		return service.addTransaction(t);
	}
	
	public void updateTransaction(@RequestBody Transaction t, @PathVariable int id) {
		service.updateTransaction(t, id);
	}
	
	@DeleteMapping("/deleteTransaction/{id}")
	public void deleteTransaction(@PathVariable int id) {
		service.deleteTransaction(id);
	}
	
	//**********************************************************************************
	
	@GetMapping("/SavingsDetails")
	public List<SavingsDetails> getallSavingsDetails(){
		return service.getallSavings();
	}
	
	@GetMapping("/SavingsDetails/{id}")
	public SavingsDetails getSavingsDetailsbyId(@PathVariable int id) {
		return service.getSavingsById(id);
	}
	
	@PostMapping("/addSavingsDetails")
	public SavingsDetails addSavingsDetails(@RequestBody SavingsDetails s) {
		return service.addSavings(s);
	}
	
	
	public void updateSavingsDetails(@RequestBody SavingsDetails s,@PathVariable int id) {
		 service.updateSavingsDetails(s, id);
	}
	
	@DeleteMapping("/deleteSavingsDetails/{id}")
	public void deleteSavingsDetails(@PathVariable int id) {
		service.deleteSavingsDetails(id);
	}
	
	@GetMapping("/getAdmin/{id}")
	public Admin getAdminById(@PathVariable String id) {
		return service.getAdminById(id);
	}
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin a) {
		return service.addAdmin(a);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdminbyId(String id) {
		service.deleteAdminById(id);
	}
	
	@PostMapping("/userlogin")
	public String userLogin(@RequestBody User u) {
		return service.userLogin(u);
	}
	
	@PostMapping("/adminlogin")
	public String adminLogin(@RequestBody Admin a) {
		return service.adminLogin(a);
	}
	
	//**********************************************************************************
	
	@GetMapping("/allRequest")
	public List<Request> getallRequest() {
		return service.getAllRequest();
	}
	
	@GetMapping("/request/{id}")
	public Request getRequestById(@PathVariable int id) {
		return service.getRequestById(id);
	}
	
	@PostMapping("/addRequest")
	public Request addRequest(@RequestBody Request r) {
		return service.addRequest(r);
	}
	
	@PutMapping("/updateRequest/{id}")
	public void updateRequest(@RequestBody Request r,@PathVariable int id) {
		service.updateRequest(r, id);
	}
	
	@DeleteMapping("/deleteRequest/{id}")
	public void deleteRequest(@PathVariable int id) {
		service.deleteRequestById(id);
	}
	
	@GetMapping("/userReq/{acno}")
	public List<Request> getuserReq(@PathVariable long acno){
		return service.getUserRequest(acno);
	}
	
	@PutMapping("/updateReqStatus/{id}")
	public void updateStatus(@RequestBody Request r,@PathVariable int id) {
		service.updateReqStatus(r, id);
	}
}
