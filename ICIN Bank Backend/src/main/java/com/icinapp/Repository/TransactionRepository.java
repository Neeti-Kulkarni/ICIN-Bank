package com.icinapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.icinapp.Entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	@Query(value="select * from Transaction where senderaccountnumber=?1",nativeQuery=true)
	public List<Transaction> findByUserAC(long acnumber);
}
