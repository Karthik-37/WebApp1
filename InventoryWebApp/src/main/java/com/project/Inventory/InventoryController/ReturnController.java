package com.project.Inventory.InventoryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Inventory.InventoryService.ReturnService;
import com.project.Inventory.pojo.ReturnPojo;

@RestController
public class ReturnController {
	
	@Autowired
	ReturnService returnService;
	
	
	@PostMapping("/return")
	public ReturnPojo add(@RequestBody ReturnPojo returnPojo) {
		returnPojo =returnService.add(returnPojo);
		return returnPojo;
	}
	
	@GetMapping(value="/return/{godownId}")
	public ReturnPojo get(@PathVariable("godownId") int godownId) {
		ReturnPojo returns= returnService.get(godownId);
		return returns;
	}
	

	

}
