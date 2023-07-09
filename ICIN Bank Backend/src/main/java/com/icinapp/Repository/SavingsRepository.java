package com.icinapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icinapp.Entity.SavingsDetails;

public interface SavingsRepository extends JpaRepository<SavingsDetails, Integer>{

}
