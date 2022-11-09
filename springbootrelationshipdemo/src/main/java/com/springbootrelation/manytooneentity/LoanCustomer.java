package com.springbootrelation.manytooneentity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanCustomer {

	@Id
	private int customerId;
	private String emailid;
	private String name;
	
	
	public int getCustomerid() {
		return customerId;
	}
	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
