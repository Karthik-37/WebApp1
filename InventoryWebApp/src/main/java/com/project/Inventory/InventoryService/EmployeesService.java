package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.EmployeesPojo;

public interface EmployeesService {
	
	EmployeesPojo add(EmployeesPojo employeesPojo);
	EmployeesPojo get(long empId);
	List<EmployeesPojo> getallEmployeesPojos();
	void update(EmployeesPojo employeesPojo , long empId);
	void delete(long empId);

	
}
