package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String emailId;
	private String firstName;
	private String lastName;
	private String departmentName;
	
	
	
	public Employee(String firstName, String lastName, String departmentName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.emailId = emailId;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", departmentName=" + departmentName
				+ ", emailId=" + emailId + "]";
	}
	
	
	
	
}
