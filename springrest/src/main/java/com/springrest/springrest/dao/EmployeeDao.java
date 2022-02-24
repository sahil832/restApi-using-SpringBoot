package com.springrest.springrest.dao;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, String> {
	
	//Employee findById(String email);
	
}
