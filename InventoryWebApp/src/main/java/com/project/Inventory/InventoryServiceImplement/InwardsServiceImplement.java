package com.project.Inventory.InventoryServiceImplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Inventory.InventoryEntity.InwardsEntity;
import com.project.Inventory.InventoryRepository.InwardsRepository;
import com.project.Inventory.InventoryService.InwardsService;
import com.project.Inventory.pojo.InwradsPojo;


@Service
public class InwardsServiceImplement implements InwardsService{
	
	@Autowired
	InwardsRepository inwardsRepository;
	

	@Override
	public InwradsPojo add(InwradsPojo inwardsPojo) {
		
		InwardsEntity ind = new InwardsEntity();
		
		ind.setBillCheckedBy(inwardsPojo.getBillCheckedBy());
		ind.setDateOfSupply(inwardsPojo.getDateOfSupply());
		ind.setGodownId(inwardsPojo.getGodownId());
		ind.setInvoiceNo(inwardsPojo.getInvoiceNo());
		ind.setItemName(inwardsPojo.getItemName());
		ind.setNameOfSupplier(inwardsPojo.getNameOfSupplier());
		ind.setQuantity(inwardsPojo.getQuantity());
		ind.setReceiptNo(inwardsPojo.getReceiptNo());
		ind.setReceivedBy(inwardsPojo.getReceivedBy());
		
		inwardsRepository.save(ind);
		
		
		return inwardsPojo;
	}

	@Override
	public InwradsPojo get(long receiptNo) {
		
        InwardsEntity inwards = inwardsRepository.getById(receiptNo);
		
		InwradsPojo pojo = new InwradsPojo();
		
		pojo.setBillCheckedBy(inwards.getBillCheckedBy());
		pojo.setDateOfSupply(inwards.getDateOfSupply());
		pojo.setGodownId(inwards.getGodownId());
		pojo.setInvoiceNo(inwards.getInvoiceNo());
		pojo.setItemName(inwards.getItemName());
		pojo.setQuantity(inwards.getQuantity());
		pojo.setReceivedBy(inwards.getReceivedBy());
		pojo.setReceiptNo(inwards.getReceiptNo());
		pojo.setNameOfSupplier(inwards.getNameOfSupplier());
		
		
		return pojo;
	}
	
	

	@Override
	public List<InwradsPojo> getAllInwradsPojos() {
		
		List<InwradsPojo> pojo = new ArrayList<InwradsPojo>();
		List<InwardsEntity> inwardsEntityList= inwardsRepository.findAll();
		
		for(InwardsEntity inwardsEntity : inwardsEntityList) {
			InwradsPojo in = new InwradsPojo();
			in.setBillCheckedBy(inwardsEntity.getBillCheckedBy());
			in.setDateOfSupply(inwardsEntity.getDateOfSupply());
			in.setGodownId(inwardsEntity.getGodownId());
			in.setInvoiceNo(inwardsEntity.getInvoiceNo());
			in.setItemName(inwardsEntity.getItemName());
			in.setQuantity(inwardsEntity.getQuantity());
			in.setReceivedBy(inwardsEntity.getReceivedBy());
			in.setReceiptNo(inwardsEntity.getReceiptNo());
			in.setNameOfSupplier(inwardsEntity.getNameOfSupplier());
		
			pojo.add(in);
		}
		return pojo;
	}

	@Override
	public void update(InwradsPojo inwardsPojo,long receiptNo) {
		
	    InwardsEntity ind =inwardsRepository.getById(receiptNo);
	    
	    ind.setBillCheckedBy(inwardsPojo.getBillCheckedBy());
	    ind.setDateOfSupply(inwardsPojo.getDateOfSupply());
	    ind.setGodownId(inwardsPojo.getGodownId());
	    ind.setInvoiceNo(inwardsPojo.getInvoiceNo());
	    ind.setItemName(inwardsPojo.getItemName());
	    ind.setQuantity(inwardsPojo.getQuantity());
	    ind.setReceivedBy(inwardsPojo.getReceivedBy());
	    ind.setReceiptNo(inwardsPojo.getReceiptNo());
		ind.setNameOfSupplier(inwardsPojo.getNameOfSupplier());
		
		inwardsRepository.save(ind);
		
		System.out.println("Updated Successfully");
		
		
	}

	@Override
	public void delete(long receiptNo) {
		
		inwardsRepository.deleteById(receiptNo);
		
	}
	
	

}
