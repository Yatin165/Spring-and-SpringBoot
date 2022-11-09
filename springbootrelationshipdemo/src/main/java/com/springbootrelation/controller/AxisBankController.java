package com.springbootrelation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrelation.onetomany.AxisBankCards;
import com.springbootrelation.onetomany.AxisBankCustomer;
import com.springbootrelation.service.AxisBankService;

@RestController
public class AxisBankController {
	
	@Autowired
	private AxisBankService axisbankservice;

	@PostMapping("/axis")
	public AxisBankCustomer addAxisBankData(@RequestBody AxisBankCustomer ax) {
		return axisbankservice.addDataToDataBase(ax);
	}
	
//	@GetMapping("/axis")
//	public List<AxisBankCards> getAxisBankData(int id) {
//		return axisbankservice.getDataFromDataBase(id);
//	}
	
	@PutMapping("/axis")
	public AxisBankCustomer updateAxisBankData(@RequestBody AxisBankCustomer ax) {
		return axisbankservice.updateCardDetails(ax);
		
	}
}
