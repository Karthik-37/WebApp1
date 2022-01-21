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

import com.project.Inventory.InventoryService.InwardsService;
import com.project.Inventory.pojo.InwradsPojo;

@RestController
@RequestMapping("/inwards")
public class InwardsController {
	
	@Autowired
	InwardsService inwardsService;
	
	
	@PostMapping("/add")
	public InwradsPojo add(@RequestBody InwradsPojo inwardsPojo) {
		inwardsPojo = inwardsService.add(inwardsPojo);
		return inwardsPojo;
	}
	
	@GetMapping(value="/get/{receiptNo}")
	public InwradsPojo get(@PathVariable("receiptNo") long receiptNo) {
		InwradsPojo ind=inwardsService.get(receiptNo);
		return ind;
		
	}
	
	@GetMapping("/getAll")
	public List<InwradsPojo> getAllInwradsPojos(){
		
		List<InwradsPojo> ind = inwardsService.getAllInwradsPojos();
		return ind;
	}
	
	@PutMapping(value="/upadteinwards/{receiptNo}")
	public  InwradsPojo update( @PathVariable("receiptNo")long receiptNo,@RequestBody InwradsPojo ind) {
		inwardsService.update(ind, receiptNo);
		return ind;
	}
	
	@DeleteMapping(value="/delete/{receiptNo}")
	public void delete(@PathVariable("receiptNo") long receiptNo) {
	inwardsService.delete(receiptNo);
	}

}
