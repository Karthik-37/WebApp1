package com.project.Inventory.InventoryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Inventory.InventoryService.ReportService;
import com.project.Inventory.pojo.ReportPojo;

@RequestMapping("/report")
@RestController

public class ReportController {
	
	
	
	@Autowired
	ReportService reportService;
	
	@PostMapping("/add")
	public ReportPojo add(@RequestBody ReportPojo reportPojo) {
		reportPojo=reportService.add(reportPojo);
		return reportPojo;
		
	}
	@GetMapping("/get/{godownId}")
	public ReportPojo get(@PathVariable("godownId")long godownId) {
		ReportPojo r = reportService.get(godownId);
		return r;
		
	}
	@GetMapping("/getALl")
	public List<ReportPojo> getAllReport(){
		List<ReportPojo>r=reportService.getAllReportPojos();
		return r;
	}
	@DeleteMapping(value="/delete/{godownId}")
	public void delete(@PathVariable("godownId") long godownId) {
		reportService.delete(godownId);
	}

}
