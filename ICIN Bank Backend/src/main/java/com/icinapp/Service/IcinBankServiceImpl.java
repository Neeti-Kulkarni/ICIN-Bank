package com.icinapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.icinapp.Entity.Admin;
import com.icinapp.Entity.Request;
import com.icinapp.Entity.SavingsDetails;
import com.icinapp.Entity.Transaction;
import com.icinapp.Entity.User;
import com.icinapp.Repository.AdminRepository;
import com.icinapp.Repository.RequestRepository;
import com.icinapp.Repository.SavingsRepository;
import com.icinapp.Repository.TransactionRepository;
import com.icinapp.Repository.UserRepository;

@Service
public class IcinBankServiceImpl implements IcinBankService{
	
	@Autowired
	private UserRepository ur;
	
	@Autowired
	private TransactionRepository tr;
	
	@Autowired
	private SavingsRepository sr;
	
	@Autowired
	private AdminRepository ar;
	
	@Autowired
	private RequestRepository rr;
	
	
	public User getUserByAccno(long acno) {
		return ur.findByAcNo(acno);
	}

	@Override
	public List<User> getallUser() {
		return ur.findAll();
	}

	/*
	 * @Override public User getUserById(long id) { // TODO Auto-generated method
	 * stub return ur.findById(id).get(); }
	 */

	@Override
	public User addUser(User u) {
		BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();
		String encode= crypt.encode(u.getEpin());
		u.setEpin(encode);
		return ur.save(u);
	}

	@Override
	public void updateUser(User u, long id) {
		if(ur.findById(id).isPresent()){
			User user= ur.findById(id).get();
			user.setAmountdeposited(u.getAmountdeposited());
			ur.save(user);
		}
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		ur.deleteById(id);
		
	}
	
	public void blockUser(User u,long id) {
		if(ur.findById(id).isPresent()) {
			User user= ur.findById(id).get();
			user.setBlock(u.getBlock());
			ur.save(user);
		}
	}
	
	public void updateUserAC(User u, long id) {
		if(ur.findById(id).isPresent()) {
			User user= ur.findById(id).get();
			user.setUseraccountnumber(u.getUseraccountnumber());
			user.setStatus(u.getStatus());
			ur.save(user);
		}
	}

	public List<Transaction> getUserTransaction(long acno){
		return tr.findByUserAC(acno);
	}
	
	@Override
	public List<Transaction> getallTransaction() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public Transaction getTransactionById(int id) {
		// TODO Auto-generated method stub
		return tr.findById(id).get();
	}

	@Override
	public Transaction addTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return tr.save(t);
	}

	@Override
	public void updateTransaction(Transaction t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTransaction(int id) {
		tr.deleteById(id);
		
	}

	@Override
	public List<SavingsDetails> getallSavings() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public SavingsDetails getSavingsById(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public SavingsDetails addSavings(SavingsDetails s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public void updateSavingsDetails(SavingsDetails s, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSavingsDetails(int id) {
		sr.deleteById(id);
		
	}

	@Override
	public Admin getAdminById(String id) {
		// TODO Auto-generated method stub
		return ar.findById(id).get();
	}

	@Override
	public Admin addAdmin(Admin a) {
		BCryptPasswordEncoder crypt= new BCryptPasswordEncoder();
		String encode= crypt.encode(a.getPassword());
		a.setPassword(encode);
		return ar.save(a);
	}

	@Override
	public void deleteAdminById(String id) {
		// TODO Auto-generated method stub
		ar.deleteById(id);
		
	}
	
	public String userLogin(User u) {
		BCryptPasswordEncoder crypt= new BCryptPasswordEncoder(); 
		String status="";
		if(ur.findById(u.getUserid()).isPresent()) {
			User user = ur.findById(u.getUserid()).get();
			if((u.getUserid()==(user.getUserid()))&&crypt.matches(u.getEpin(), user.getEpin())) {
				status="true";
			}else
				status="false";
			
		}
		return status;
	}
	
	public String adminLogin(Admin u) {
		BCryptPasswordEncoder crypt= new BCryptPasswordEncoder(); 
		String status="";
		if(ar.findById(u.getAdminemail()).isPresent()) {
			Admin admin= ar.findById(u.getAdminemail()).get();
			if((u.getAdminemail().equals(admin.getAdminemail()))&& crypt.matches(u.getPassword(), admin.getPassword())) {
				status="true";
			}else
				status="false";
		}
		return status;
	}

	@Override
	public List<Request> getAllRequest() {
		
		return rr.findAll();
	}

	@Override
	public Request getRequestById(int id) {
		// TODO Auto-generated method stub
		return rr.findById(id).get();
	}

	@Override
	public Request addRequest(Request r) {
		// TODO Auto-generated method stub
		return rr.save(r);
	}

	@Override
	public void updateRequest(Request r, int id) {
		if(rr.findById(id).isPresent()) {
			Request request= rr.findById(id).get();
			request.setStatus(r.getStatus());
			rr.save(request);
		}
		
	}

	@Override
	public void deleteRequestById(int id) {
		rr.deleteById(id);
		
	}
	
	public List<Request> getUserRequest(long acno){
		return rr.findUserRequest(acno);
	}
	
	public void updateReqStatus(Request r , int id) {
		if(rr.findById(id).isPresent()){
			Request req= rr.findById(id).get();
			req.setStatus(r.getStatus());
			rr.save(req);
		}
	}
	

}
