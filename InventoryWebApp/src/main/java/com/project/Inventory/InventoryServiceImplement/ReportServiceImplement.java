package com.project.Inventory.InventoryServiceImplement;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Inventory.InventoryEntity.ReportEntity;
import com.project.Inventory.InventoryRepository.ReportRepository;
import com.project.Inventory.InventoryService.ReportService;
import com.project.Inventory.pojo.ReportPojo;

@Service
public class ReportServiceImplement implements ReportService{
	
	@Autowired
	ReportRepository reportRepository;

	@Override
	public ReportPojo add(ReportPojo reportPojo) {
	
		ReportEntity repo=new ReportEntity();
		
		repo.setGodownId(reportPojo.getGodownId());
		repo.setMonthlyDeliveries(reportPojo.getMonthlyDeliveries());
		repo.setMonthlyInwards(reportPojo.getMonthlyInwards());
		repo.setMonthlyReturns(reportPojo.getMonthlyReturns());
		reportRepository.save(repo);
		return reportPojo;
	}

	@Override
	public ReportPojo get(long godownId) {
		ReportEntity repo=reportRepository.getById(godownId);
		ReportPojo r1 =new ReportPojo();
		r1.setMonthlyDeliveries(repo.getMonthlyDeliveries());
		r1.setMonthlyInwards(repo.getMonthlyInwards());
		r1.setMonthlyReturns(repo.getMonthlyReturns());
		
		return r1;
	}
	
	

	@Override
	public List<ReportPojo> getAllReportPojos() {
		List<ReportPojo> pojo = new ArrayList<ReportPojo>();
		List<ReportEntity> repo = reportRepository.findAll();
		for(ReportEntity reportEntity:repo) {
			ReportPojo repo1 = new ReportPojo();
			repo1.setMonthlyDeliveries(reportEntity.getMonthlyDeliveries());
			repo1.setMonthlyInwards(reportEntity.getMonthlyInwards());
			repo1.setMonthlyReturns(reportEntity.getMonthlyReturns());
			
			pojo.add(repo1);
		}
		
		return pojo;
	}

	@Override
	public void update(ReportPojo reportPojo,long godownId) {
		
		ReportEntity report=reportRepository.getById(godownId);
		
		report.setMonthlyDeliveries(reportPojo.getMonthlyDeliveries());
		report.setMonthlyInwards(reportPojo.getMonthlyInwards());
		report.setMonthlyReturns(reportPojo.getMonthlyReturns());
		
		reportRepository.save(report);
		
		System.out.println("Updated Successfully");
		
	}

	@Override
	public void delete(long godownId) {
		
		reportRepository.deleteById(godownId);
		
		
	}
	
	

	
	

	
}
