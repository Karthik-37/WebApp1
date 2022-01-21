package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.GodownPojo;


public interface GodownService {
	
	GodownPojo add(GodownPojo godownPojo);
	GodownPojo get(long godown_id);
	List<GodownPojo> getAllGodownPojos();
	void update(GodownPojo godownPojo , long godownId);
	void delete(long godown_id);
	

}
