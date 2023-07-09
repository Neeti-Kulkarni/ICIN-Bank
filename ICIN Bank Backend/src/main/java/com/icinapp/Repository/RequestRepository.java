package com.icinapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.icinapp.Entity.Request;

public interface RequestRepository extends JpaRepository<Request, Integer>{

	@Query(value="select * from request where useraccountnumber =?1",nativeQuery=true)
	public List<Request> findUserRequest(long Acno);
}
