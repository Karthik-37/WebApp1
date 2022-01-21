package com.project.Inventory.InventoryEntity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="StockReturn")
@SequenceGenerator(name="ret_seq" , sequenceName="ret_seq" , initialValue = 1001)
public class ReturnEntity {
	
	@Column(name="godown_Id")
	private long godownId;
	@Column(name="date_Delivery")
	 @JsonFormat(pattern="yyyy-mm-dd",shape= Shape.STRING)
	private Date dateDelivery;
	@Column(name="quanity")
	private long quanity;
	@Column(name="invoice_no")
	private String invoiceNo;
	@Column(name="returned_By")
	private String returnedBy;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "ret_seq")
	@Column(name="receipt_no")
	private long receiptNo;
	@Column(name="bill_value")
	private long billValue;
	@Column(name="checked_by")
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
