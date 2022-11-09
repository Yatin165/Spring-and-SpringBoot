package com.springbootrelation.manytooneentity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
	
	@Id
	private int loanid;
	private long amount;
	private LocalDate issuedDate;
	private String status;
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "customerId")
	private LoanCustomer  customer;
	
	
	
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public LoanCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(LoanCustomer customer) {
		this.customer = customer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
