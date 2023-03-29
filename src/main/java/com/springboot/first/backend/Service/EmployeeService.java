package com.springboot.first.backend.Service;

import java.util.List;

import com.springboot.first.backend.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee ,long id);
	void deleteEmployee(long id);
}
