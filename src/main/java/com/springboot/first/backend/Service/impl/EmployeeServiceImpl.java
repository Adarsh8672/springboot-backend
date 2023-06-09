package com.springboot.first.backend.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.first.backend.Service.EmployeeService;
import com.springboot.first.backend.exception.ResourceNotFoundException;
import com.springboot.first.backend.model.Employee;
import com.springboot.first.backend.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}



	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
//		Optional<Employee> employee =employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}
//		else {
//			throw new ResourceNotFoundException("Employee", "id", id);
//		}
		
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
		
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		//we need to check whether employee with  given id is exist in DB or not
		Employee existingEmployee= employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		// save existing employee to DB
		employeeRepository.save(existingEmployee);
		
		return existingEmployee;
	}



	@Override
	public void deleteEmployee(long id) {
		
		//check whether a employee exits in a DB or not 
		employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "id", id));
		
		
		employeeRepository.deleteById(id);
		
	}

}
