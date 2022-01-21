package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.ReportPojo;

public interface ReportService {
	
	ReportPojo add(ReportPojo reportPojo);
	ReportPojo get(long godownId);
	List<ReportPojo> getAllReportPojos();
	void update(ReportPojo reportPojo,long godownId);
	void delete(long godownId);

}
