package com.project.Inventory.InventoryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Inventory.InventoryService.EmployeesService;
import com.project.Inventory.pojo.EmployeesPojo;

@RestController
public class EmployeesController {
	
	@Autowired
	EmployeesService employeesService;
	
	@PostMapping("/employee")
	public EmployeesPojo add(@RequestBody EmployeesPojo employeesPojo) {
		employeesPojo = employeesService.add(employeesPojo);
		return employeesPojo;
	}
	
	@GetMapping(value="/employee/{empId}")
	public EmployeesPojo get(@PathVariable("empId") long empId) {
		EmployeesPojo emp=employeesService.get(empId);
		return emp;
	}
	
	@GetMapping("/employee/getAll")
	public List<EmployeesPojo> getAllEmployeesPojos(){
		
		List<EmployeesPojo> emp = employeesService.getallEmployeesPojos();
		return emp;
	}
	
	@DeleteMapping(value="/delete/{empId}")
	public void deleteUser(@PathVariable("empId") long empId) {
		employeesService.delete(empId);
	}
	
	

}
