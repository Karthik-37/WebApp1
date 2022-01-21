package com.project.Inventory.InventoryService;

import java.util.List;

import com.project.Inventory.pojo.DeliveryPojo;

public interface DeliveryService {
	
	DeliveryPojo add(DeliveryPojo deliveryPojo);
	DeliveryPojo get(long godown_id);
	List<DeliveryPojo> getAllDeliveryPojos();
	void update(DeliveryPojo deliveryPojo , long receiptNo);
	void delete(long godown_id);

}
