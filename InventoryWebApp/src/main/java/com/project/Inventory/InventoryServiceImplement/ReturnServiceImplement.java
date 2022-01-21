package com.project.Inventory.InventoryServiceImplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Inventory.InventoryEntity.ReturnEntity;
import com.project.Inventory.InventoryRepository.ReturnRepository;
import com.project.Inventory.InventoryService.ReturnService;
import com.project.Inventory.pojo.ReturnPojo;


@Service
public class ReturnServiceImplement implements ReturnService{
	
	@Autowired
	private ReturnRepository returnRepository;
	
	public ReturnPojo add(ReturnPojo returnPojo) {
		ReturnEntity r=new ReturnEntity();
		r.setBillValue(returnPojo.getBillValue());
		r.setCheckedBy(returnPojo.getCheckedBy());
		r.setDateDelivery(returnPojo.getDateDelivery());
		r.setInvoiceNo(returnPojo.getInvoiceNo());
		r.setQuanity(returnPojo.getQuanity());
		r.setReceiptNo(returnPojo.getReceiptNo());
		r.setReturnedBy(returnPojo.getReturnedBy());
		
		returnRepository.save(r);
		
		return returnPojo;
	}
	
	@Override
	public ReturnPojo get(long godown_id) {
		
		ReturnEntity get = returnRepository.getById(godown_id);
		
		ReturnPojo pojo = new ReturnPojo();
		
		pojo.setBillValue(get.getBillValue());
		pojo.setCheckedBy(get.getCheckedBy());
		pojo.setDateDelivery(get.getDateDelivery());
		pojo.setGodownId(get.getGodownId());
		pojo.setInvoiceNo(get.getInvoiceNo());
		pojo.setQuanity(get.getQuanity());
		pojo.setReceiptNo(get.getReceiptNo());
		pojo.setReturnedBy(get.getReturnedBy());
		
		
		return pojo;
	}

	@Override
	public List<ReturnPojo> getAllReturn() {
		List<ReturnPojo> pojo = new ArrayList<ReturnPojo>();
		
		List<ReturnEntity> returnEntityList = returnRepository.findAll();
		
		for(ReturnEntity returnEntity : returnEntityList) {
			ReturnPojo ret = new ReturnPojo();
			
			ret.setBillValue(returnEntity.getBillValue());
			ret.setCheckedBy(returnEntity.getCheckedBy());
			ret.setDateDelivery(returnEntity.getDateDelivery());
			ret.setGodownId(returnEntity.getGodownId());
			ret.setInvoiceNo(returnEntity.getInvoiceNo());
			ret.setQuanity(returnEntity.getQuanity());
			ret.setReceiptNo(returnEntity.getReceiptNo());
			ret.setReturnedBy(returnEntity.getReturnedBy());
		
			pojo.add(ret);
		}
		return pojo;
	}

	@Override
	public void delete(long godownId) {
		
		returnRepository.deleteById(godownId);		
	}
	
	
	
}
