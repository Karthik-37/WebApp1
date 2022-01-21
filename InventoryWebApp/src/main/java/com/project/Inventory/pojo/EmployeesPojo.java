package com.project.Inventory.pojo;

import java.sql.Date;

public class EmployeesPojo {
	
	private long employeesId;
	private String empName;
	private long managerId;
	private String emailId;
	private long empSalary;
	private Date hireDate;
	
	public long getEmployeesId() {
		return employeesId;
	}
	public void setEmployeesId(long employeesId) {
		this.employeesId = employeesId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	

}
