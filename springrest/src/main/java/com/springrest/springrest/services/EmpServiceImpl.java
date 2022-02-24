package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;

@Service
public class EmpServiceImpl implements EmpServices{
	
	@Autowired
	private EmployeeDao employeeDao;
	public EmpServiceImpl() {
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	
	@Override
	public Employee employee(String email_id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(email_id).get();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		employeeDao.save(emp);
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee newEmp,String emailId) {
		Employee employee=employeeDao.findById(emailId).get();
		employeeDao.delete(employee);
		employeeDao.save(newEmp);
//		employee.setDepartmentName(newEmp.getDepartmentName());
//		employee.setFirstName(newEmp.getFirstName());
//		employee.setLastName(newEmp.getLastName());
//		employee.setEmailId(newEmp.getEmailId());
		return newEmp;
	}
	
	@Override
	public void deleteEmployee(String emailId) {
		// TODO Auto-generated method stub
		Employee employee= employeeDao.findById(emailId).get();
		System.out.println(employee.getFirstName());
		employeeDao.delete(employee);;
	}
	
	
	
}
