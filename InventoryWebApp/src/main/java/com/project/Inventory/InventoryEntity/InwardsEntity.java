package com.project.Inventory.InventoryEntity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="Inwards_tb")
@SequenceGenerator(name="inwards_seq" , sequenceName="inwards_seq" , initialValue = 1000)
public class InwardsEntity {

	
	private long godownId;
	private String nameOfSupplier;
	 @JsonFormat(pattern="yyyy-mm-dd",shape= Shape.STRING)
	private Date dateOfSupply;
	private String itemName;
	private String invoiceNo;
	private long quantity;
	private String receivedBy;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "inwards_seq")
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
