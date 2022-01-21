package com.project.Inventory.InventoryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Inventory.InventoryService.DeliveryService;
import com.project.Inventory.pojo.DeliveryPojo;

@RequestMapping("/delivery")
@RestController
public class DeliveryController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@PostMapping("/add")
	public DeliveryPojo add(@RequestBody DeliveryPojo deliveryPojo) {
		deliveryPojo = deliveryService.add(deliveryPojo);
		return deliveryPojo;
	}
	
	@GetMapping(value="/get/{godownId}")
	public DeliveryPojo get(@PathVariable("godownId") long godownId) {
		DeliveryPojo del=deliveryService.get(godownId);
		return del;
		
	}
	
	@GetMapping("/getAll")
	public List<DeliveryPojo> getAllDeliveryPojos(){
		
		List<DeliveryPojo> del = deliveryService.getAllDeliveryPojos();
		return del;
	}
	
	@PutMapping(value="/update/{receiptNo}")
	public DeliveryPojo update( @PathVariable("receiptNo")long receiptNo,@RequestBody DeliveryPojo del) {
		deliveryService.update(del, receiptNo);
		return del;
	}
	
	@DeleteMapping(value="/delete/{godownId}")
	public void deleteUser(@PathVariable("godownId") long godownId) {
		deliveryService.delete(godownId);
	}
	

}
