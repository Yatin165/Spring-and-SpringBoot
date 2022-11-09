package com.passenger.repository;

import org.springframework.data.repository.CrudRepository;

import com.passenger.entity.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

}
