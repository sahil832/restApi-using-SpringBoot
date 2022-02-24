package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.Employee;

public interface EmpServices {
	
	public List<Employee> getEmployees();

	public Employee employee(String emailId);

	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(Employee emp,String emailId);

	public void deleteEmployee(String emailId);
	
}
