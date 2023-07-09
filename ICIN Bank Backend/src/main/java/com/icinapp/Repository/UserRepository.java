package com.icinapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.icinapp.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value="select * from user where useraccountnumber=?1",nativeQuery=true)
	public User findByAcNo(long acno);
}
