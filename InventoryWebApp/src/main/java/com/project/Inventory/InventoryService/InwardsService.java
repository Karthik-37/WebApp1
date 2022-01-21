package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.InwradsPojo;

public interface InwardsService {
	
	InwradsPojo add(InwradsPojo inwardsPojo);
	InwradsPojo get(long receiptNo);
	List<InwradsPojo> getAllInwradsPojos();
	void update(InwradsPojo inwardsPojo,long receiptNo);
	void delete(long receiptNo);

}
