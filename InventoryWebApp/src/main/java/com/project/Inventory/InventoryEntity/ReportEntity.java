package com.project.Inventory.InventoryEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Report_tb")
@SequenceGenerator(name="rep_seq" , sequenceName="rep_seq" , initialValue = 101)
public class ReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "rep_seq")
	private long colNo;
	private long godownId;
	private long monthlyInwards;
	private long monthlyDeliveries;
	private long monthlyReturns;
	
	
	
	public long getColNo() {
		return colNo;
	}
	public void setColNo(long colNo) {
		this.colNo = colNo;
	}
	public long getGodownId() {
		return godownId;
	}
	public void setGodownId(long godownId) {
		this.godownId = godownId;
	}
	public long getMonthlyInwards() {
		return monthlyInwards;
	}
	public void setMonthlyInwards(long monthlyInwards) {
		this.monthlyInwards = monthlyInwards;
	}
	public long getMonthlyDeliveries() {
		return monthlyDeliveries;
	}
	public void setMonthlyDeliveries(long monthlyDeliveries) {
		this.monthlyDeliveries = monthlyDeliveries;
	}
	public long getMonthlyReturns() {
		return monthlyReturns;
	}
	public void setMonthlyReturns(long monthlyReturns) {
		this.monthlyReturns = monthlyReturns;
	}

}
