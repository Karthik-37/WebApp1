package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.ReturnPojo;


public interface ReturnService {
	
	ReturnPojo add(ReturnPojo returnPojo);
	ReturnPojo get(long godownId);
	List<ReturnPojo> getAllReturn();
	void delete(long godownId);

}
