package com.project.Inventory.InventoryController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.Inventory.InventoryService.GodownService;
import com.project.Inventory.pojo.GodownPojo;

@RestController
public class GodownController {
	
	@Autowired
	GodownService godownService;
	
	@PostMapping("/godown")
	public GodownPojo add(@RequestBody GodownPojo godownPojo) {
		godownPojo = godownService.add(godownPojo);
		return godownPojo;
	}
	
	@GetMapping(value="/godown/{godownId}")
	public GodownPojo get(@PathVariable("godownId") int godownId) {
		GodownPojo godown=godownService.get(godownId);
		return godown;
		
	}
	
	@GetMapping("/godown/getAll")
	public List<GodownPojo> getAllGodownPojos(){
		
		List<GodownPojo> godown = godownService.getAllGodownPojos();
		return godown;
	}
	
	@PutMapping(value="/updategodown/{godownId}")
	public GodownPojo update( @PathVariable("godownId")int godownId,@RequestBody GodownPojo godown) {
		godownService.update(godown, godownId);
		return godown;
	}
	
	@DeleteMapping(value="/delete/{godownId}")
	public void deleteUser(@PathVariable("godownId") long godownId) {
		godownService.delete(godownId);
	}
	
}