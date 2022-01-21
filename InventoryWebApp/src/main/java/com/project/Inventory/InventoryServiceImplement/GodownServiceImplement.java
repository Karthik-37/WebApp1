package com.project.Inventory.InventoryServiceImplement;
	
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.Inventory.InventoryEntity.GodownEntity;
import com.project.Inventory.InventoryEntity.ReportEntity;
import com.project.Inventory.InventoryRepository.GodownRepository;
import com.project.Inventory.InventoryService.GodownService;
import com.project.Inventory.pojo.GodownPojo;
import com.project.Inventory.pojo.ReportPojo;

@Service
public class GodownServiceImplement implements GodownService{

	@Autowired
	private GodownRepository godownRepository;
	
	@Override
	public GodownPojo add(GodownPojo godownPojo) {
		
		GodownEntity godown = new GodownEntity();
		
		godown.setGodownId(godownPojo.getGodownId());
		godown.setGodownLocation(godownPojo.getGodownLocation());
		godown.setGodownManager(godownPojo.getGodownManager());
		godown.setCapacity(godownPojo.getCapacity());
		godown.setStartDate(godownPojo.getStartDate());
		
		godownRepository.save(godown);
		
		return godownPojo;
	}

	@Override
	public GodownPojo get(long godownId) {
		
		GodownEntity getDataFromGodown = godownRepository.getById(godownId);
		
		GodownPojo pojo = new GodownPojo();
		
		pojo.setGodownId(getDataFromGodown.getGodownId());
		pojo.setGodownLocation(getDataFromGodown.getGodownLocation());
		pojo.setGodownManager(getDataFromGodown.getGodownLocation());
		pojo.setCapacity(getDataFromGodown.getCapacity());
		pojo.setStartDate(getDataFromGodown.getStartDate());
		
		return pojo;
	}
	
	
	

	@Override
	public List<GodownPojo> getAllGodownPojos() {
		
		List<GodownPojo> god = new ArrayList<GodownPojo>();
		List<GodownEntity> repo = godownRepository.findAll();
		for(GodownEntity godownEntity:repo) {
			GodownPojo pojo = new GodownPojo();
			pojo.setGodownId(godownEntity.getGodownId());
			pojo.setGodownLocation(godownEntity.getGodownLocation());
			pojo.setGodownManager(godownEntity.getGodownLocation());
			pojo.setCapacity(godownEntity.getCapacity());
			pojo.setStartDate(godownEntity.getStartDate());
			
		    god.add(pojo);
		}
		
		return god;
	}

	@Override
	public void update(GodownPojo godownPojo , long godownId) {
		
		GodownEntity godownEntity = godownRepository.getById(godownId);
		godownEntity.setCapacity(godownPojo.getCapacity());
		godownEntity.setGodownId(godownPojo.getGodownId());
		godownEntity.setGodownLocation(godownPojo.getGodownLocation());
		godownEntity.setGodownManager(godownPojo.getGodownManager());
		godownEntity.setStartDate(godownPojo.getStartDate());
		
		godownRepository.save(godownEntity);
		
			
			System.out.println("Update successful");	
		
	}

	@Override
	public void delete(long godownId) {
		godownRepository.deleteById(godownId);
		
	}
	
	

	
	
}


