package com.springbootrelation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrelation.manytooneentity.Loan;
import com.springbootrelation.repository.LoanRepo;

@Service
public class LoanService {
	
	@Autowired
	LoanRepo loanrepo;

	public Loan addLoanToDataBase(Loan loan) {
		return loanrepo.save(loan);
	}
	
	public Loan getLoanDataFromDataBase(int id) {
		Optional<Loan> optionalloan =  loanrepo.findById(id);
		return optionalloan.get();
	}

}
