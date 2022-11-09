package com.springbootrelation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springbootrelation.onetomany.AxisBankCards;
import com.springbootrelation.onetomany.AxisBankCustomer;

public interface AxisBankRepo extends CrudRepository<AxisBankCustomer,Integer> {



}
