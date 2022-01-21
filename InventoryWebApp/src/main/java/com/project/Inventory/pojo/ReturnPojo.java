package com.project.Inventory.pojo;

import java.sql.Date;

public class ReturnPojo {
	
	private long godownId;
	private Date dateDelivery;
	private long quanity;
	private String invoiceNo;
	private String returnedBy;
	private long receiptNo;
	private long billValue;
	private String checkedBy;
	
	public long getGodownId() {
		return godownId;
	}
	public void setGodownId(long godownId) {
		this.godownId = godownId;
	}
	public Date getDateDelivery() {
		return dateDelivery;
	}
	public void setDateDelivery(Date dateDelivery) {
		this.dateDelivery = dateDelivery;
	}
	public long getQuanity() {
		return quanity;
	}
	public void setQuanity(long quanity) {
		this.quanity = quanity;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getReturnedBy() {
		return returnedBy;
	}
	public void setReturnedBy(String returnedBy) {
		this.returnedBy = returnedBy;
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
	public String getCheckedBy() {
		return checkedBy;
	}
	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}
	
	
	

}
