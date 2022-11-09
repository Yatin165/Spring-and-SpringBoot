package com.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.*;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {

}
