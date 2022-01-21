package com.project.Inventory.InventoryServiceImplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Inventory.InventoryEntity.EmployeesEntity;
import com.project.Inventory.InventoryEntity.GodownEntity;
import com.project.Inventory.InventoryEntity.InwardsEntity;
import com.project.Inventory.InventoryRepository.EmployeesRepository;
import com.project.Inventory.InventoryService.EmployeesService;
import com.project.Inventory.pojo.EmployeesPojo;
import com.project.Inventory.pojo.InwradsPojo;

@Service
public class EmployeesServiceImplement implements EmployeesService
{
	
	@Autowired
	EmployeesRepository employeesRepository;

	@Override
	public EmployeesPojo add(EmployeesPojo employeesPojo) {
		
		EmployeesEntity emp = new EmployeesEntity();
		
		emp.setEmailId(employeesPojo.getEmailId());
		emp.setEmployeesId(employeesPojo.getEmployeesId());
		emp.setEmpName(employeesPojo.getEmpName());
		emp.setEmpSalary(employeesPojo.getEmpSalary());
		emp.setHireDate(employeesPojo.getHireDate());
		emp.setManagerId(employeesPojo.getManagerId());
		
		employeesRepository.save(emp);
		
		
		return employeesPojo;
	}

	@Override
	public EmployeesPojo get(long empId) {
		
		EmployeesEntity emp = employeesRepository.getById(empId);
		
		EmployeesPojo pojo = new EmployeesPojo();
		
		pojo.setEmailId(emp.getEmailId());
		pojo.setEmployeesId(emp.getEmployeesId());
		pojo.setEmpName(emp.getEmpName());
		pojo.setEmpSalary(emp.getEmpSalary());
		pojo.setHireDate(emp.getHireDate());
		pojo.setManagerId(emp.getManagerId());
		
		return pojo;
	}

	
	
	@Override
	public List<EmployeesPojo> getallEmployeesPojos() {
		
		List<EmployeesPojo> emp = new ArrayList<EmployeesPojo>();
		List<EmployeesEntity> employeesEntityList= employeesRepository.findAll();
		
		for(EmployeesEntity employeesEntity : employeesEntityList) {
			EmployeesPojo pojo = new EmployeesPojo();
			
			pojo.setEmailId(employeesEntity.getEmailId());
			pojo.setEmployeesId(employeesEntity.getEmployeesId());
			pojo.setEmpName(employeesEntity.getEmpName());
			pojo.setEmpSalary(employeesEntity.getEmpSalary());
			pojo.setHireDate(employeesEntity.getHireDate());
			pojo.setManagerId(employeesEntity.getManagerId());
			
		
			emp.add(pojo);
		}
		return emp;
	}

	@Override
	public void update(EmployeesPojo employeesPojo , long empId) {
		
		EmployeesEntity emp = employeesRepository.getById(empId);
		emp.setEmailId(employeesPojo.getEmailId());
		emp.setEmployeesId(employeesPojo.getEmployeesId());
		emp.setEmpName(employeesPojo.getEmpName());
		emp.setEmpSalary(employeesPojo.getEmpSalary());
		emp.setHireDate(employeesPojo.getHireDate());
		emp.setManagerId(employeesPojo.getManagerId());
		
		employeesRepository.save(emp);
		
		System.out.println("Updates SuccessFully");
		
	}

	@Override
	public void delete(long empId) {
		
		employeesRepository.deleteById(empId);
		
	}
	
	

}
