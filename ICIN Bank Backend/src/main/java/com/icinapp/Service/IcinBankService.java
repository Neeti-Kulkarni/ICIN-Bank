package com.icinapp.Service;

import java.util.List;

import com.icinapp.Entity.Admin;
import com.icinapp.Entity.Request;
import com.icinapp.Entity.SavingsDetails;
import com.icinapp.Entity.Transaction;
import com.icinapp.Entity.User;

public interface IcinBankService {

	public List<User> getallUser();
	//public User getUserById(long id);
	public User addUser(User u);
	public void updateUser(User u, long id);
	public void deleteUser(long id);
	
	public List<Transaction> getallTransaction();
	public Transaction getTransactionById(int id);
	public Transaction addTransaction(Transaction t);
	public void updateTransaction(Transaction t, int id);
	public void deleteTransaction(int id);
	
	public List<SavingsDetails> getallSavings();
	public SavingsDetails getSavingsById(int id);
	public SavingsDetails addSavings(SavingsDetails s);
	public void updateSavingsDetails(SavingsDetails s, int id);
	public void deleteSavingsDetails(int id);
	
	public Admin getAdminById(String id);
	public Admin addAdmin(Admin a);
	public void deleteAdminById(String id);
	
	public List<Request> getAllRequest();
	public Request getRequestById(int id);
	public Request addRequest(Request r);
	public void updateRequest(Request r, int id);
	public void deleteRequestById(int id);
}
