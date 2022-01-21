package com.project.Inventory.InventoryServiceImplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Inventory.InventoryEntity.DeliveryEntity;
import com.project.Inventory.InventoryRepository.DeliveryRepository;
import com.project.Inventory.InventoryService.DeliveryService;
import com.project.Inventory.pojo.DeliveryPojo;
@Service
public class DeliveryServiceImplement implements DeliveryService{
	
	@Autowired
	DeliveryRepository deliveryRepository;

	@Override
	public DeliveryPojo add(DeliveryPojo deliveryPojo) {
		
		DeliveryEntity del = new DeliveryEntity();
		
		del.setBillValue(deliveryPojo.getBillValue());
		del.setDeliveredTo(deliveryPojo.getDeliveredTo());
		del.setDeliveryDate(deliveryPojo.getDeliveryDate());
		del.setGodownId(deliveryPojo.getGodownId());
		del.setInvoiceNo(deliveryPojo.getInvoiceNo());
		del.setReceiptNo(deliveryPojo.getReceiptNo());
		del.setItemName(deliveryPojo.getItemName());
		del.setQuantity(deliveryPojo.getQuantity());
		del.setSupplyDate(deliveryPojo.getSupplyDate());
		del.setPurpose(deliveryPojo.getPurpose());
		
		deliveryRepository.save(del);
		
		return deliveryPojo;
	}

	@Override
	public DeliveryPojo get(long godownId) {
		
        DeliveryEntity del = deliveryRepository.getById(godownId);
		
		DeliveryPojo pojo = new DeliveryPojo();
		
		pojo.setBillValue(del.getBillValue());
		pojo.setDeliveredTo(del.getDeliveredTo());
		pojo.setDeliveryDate(del.getDeliveryDate());
		pojo.setGodownId(del.getGodownId());
		pojo.setBillValue(del.getBillValue());
		pojo.setBillValue(del.getBillValue());
		pojo.setBillValue(del.getBillValue());
		pojo.setBillValue(del.getBillValue());
		pojo.setBillValue(del.getBillValue());
		pojo.setBillValue(del.getBillValue());
		
		
		return pojo;
	}

	
	
	@Override
	public List<DeliveryPojo> getAllDeliveryPojos() {
		List<DeliveryPojo> emp = new ArrayList<DeliveryPojo>();
		List<DeliveryEntity> deliveryEntityList= deliveryRepository.findAll();
		
		for(DeliveryEntity deliveryEntity : deliveryEntityList) {
			DeliveryPojo pojo = new DeliveryPojo();
			

			pojo.setBillValue(deliveryEntity.getBillValue());
			pojo.setDeliveredTo(deliveryEntity.getDeliveredTo());
			pojo.setDeliveryDate(deliveryEntity.getDeliveryDate());
			pojo.setGodownId(deliveryEntity.getGodownId());
			pojo.setBillValue(deliveryEntity.getBillValue());
			pojo.setBillValue(deliveryEntity.getBillValue());
			pojo.setBillValue(deliveryEntity.getBillValue());
			pojo.setBillValue(deliveryEntity.getBillValue());
			pojo.setBillValue(deliveryEntity.getBillValue());
			pojo.setBillValue(deliveryEntity.getBillValue());
		
			emp.add(pojo);
		}
		return emp;
	}

	@Override
	public void update(DeliveryPojo deliveryPojo , long receiptNo) {
		
		DeliveryEntity del = deliveryRepository.getById(receiptNo);
		
		del.setBillValue(deliveryPojo.getBillValue());
		del.setDeliveredTo(deliveryPojo.getDeliveredTo());
		del.setDeliveryDate(deliveryPojo.getDeliveryDate());
		del.setGodownId(deliveryPojo.getGodownId());
		del.setBillValue(deliveryPojo.getBillValue());
		del.setBillValue(deliveryPojo.getBillValue());
		del.setBillValue(deliveryPojo.getBillValue());
		del.setBillValue(deliveryPojo.getBillValue());
		del.setBillValue(deliveryPojo.getBillValue());
		del.setBillValue(deliveryPojo.getBillValue());
		
		deliveryRepository.save(del);
		
		
		System.out.println("Updates Succesfully");
	}

	@Override
	public void delete(long receiptNo) {
		
		deliveryRepository.deleteById(receiptNo);
		
	}
	
	

}
