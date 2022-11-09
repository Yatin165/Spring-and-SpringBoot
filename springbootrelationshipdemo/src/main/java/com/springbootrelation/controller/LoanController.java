package com.springbootrelation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrelation.manytooneentity.Loan;
import com.springbootrelation.service.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	LoanService loanservice;

	@PostMapping("/loan")
	public Loan addLoan(@RequestBody Loan loan) {
		return loanservice.addLoanToDataBase(loan);
	}
	
	@GetMapping("/loan")
	public Loan getLoan(int id) {
		return loanservice.getLoanDataFromDataBase(id);
	}
	
	
	
}
