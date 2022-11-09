package com.springbootrelation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springbootrelation.manytooneentity.Loan;

public interface LoanRepo extends CrudRepository<Loan,Integer> {
	
	//@Query(value = "select  from   where eid = ?1",nativeQuery = true)

}
