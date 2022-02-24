package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.EmpServices;


//   gets request form server or client
@RestController
public class MyController {
	
	// auto wire injects interface here 
	@Autowired
	private EmpServices empService;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee> getEmplyoees(){
		return this.empService.getEmployees();
	}
	
	//get employee details having particular emailId
	@GetMapping("/employee/{emailId}")
	public Employee employee(@PathVariable String emailId) {
		return this.empService.employee(emailId);
	}
	
	//adds new employee details
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return this.empService.addEmployee(emp);
	}
	
	//updates existing employee details
	@PutMapping("/employee/{emailId}")
	public Employee updateEmployee(@RequestBody Employee emp,@PathVariable String emailId) {
		return this.empService.updateEmployee(emp,emailId);
	}
	
	//deletes employee details having given emialId
	@DeleteMapping("/employee/{emailId}")
	public void deleteEmployee(@PathVariable String emailId) {
		this.empService.deleteEmployee(emailId);
		
	}
}
