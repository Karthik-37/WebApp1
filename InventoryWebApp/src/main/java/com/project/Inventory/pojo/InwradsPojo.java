package com.project.Inventory.pojo;

import java.sql.Date;

public class InwradsPojo {
	
	private long godownId;
	private String nameOfSupplier;
	private Date dateOfSupply;
	private String itemName;
	private String invoiceNo;
	private long quantity;
	private String receivedBy;
	private long receiptNo;
	private String billCheckedBy;
	
	public long getGodownId() {
		return godownId;
	}
	public void setGodownId(long godownId) {
		this.godownId = godownId;
	}
	public String getNameOfSupplier() {
		return nameOfSupplier;
	}
	public void setNameOfSupplier(String nameOfSupplier) {
		this.nameOfSupplier = nameOfSupplier;
	}
	public Date getDateOfSupply() {
		return dateOfSupply;
	}
	public void setDateOfSupply(Date dateOfSupply) {
		this.dateOfSupply = dateOfSupply;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	public long getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(long receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getBillCheckedBy() {
		return billCheckedBy;
	}
	public void setBillCheckedBy(String billCheckedBy) {
		this.billCheckedBy = billCheckedBy;
	}
	
	

}
