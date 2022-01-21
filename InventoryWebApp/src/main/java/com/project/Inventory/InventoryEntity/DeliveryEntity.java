package com.project.Inventory.InventoryEntity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "Delivery_tb")
public class DeliveryEntity {
	
	
	private long godownId;

	private String itemName;

	private long invoiceNo;

	@JsonFormat(pattern="yyyy-mm-dd",shape= Shape.STRING)
	private String supplyDate;

	 @JsonFormat(pattern="yyyy-mm-dd",shape= Shape.STRING)
	private String deliveryDate;

	private String deliveredTo;

	private long quantity;
	
	private String purpose;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long receiptNo;

	private long billValue;

	public long getGodownId() {
		return godownId;
	}

	public void setGodownId(long godownId) {
		this.godownId = godownId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getSupplyDate() {
		return supplyDate;
	}

	public void setSupplyDate(String supplyDate) {
		this.supplyDate = supplyDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveredTo() {
		return deliveredTo;
	}

	public void setDeliveredTo(String deliveredTo) {
		this.deliveredTo = deliveredTo;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public long getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(long receiptNo) {
		this.receiptNo = receiptNo;
	}

	public long getBillValue() {
		return billValue;
	}

	public void setBillValue(long billValue) {
		this.billValue = billValue;
	}

	
	

}
