package com.springboot.first.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.first.backend.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
