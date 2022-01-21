package com.project.Inventory.InventoryEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="godown_td")
public class GodownEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="godown_id")
	private long godownId;
	@Column(name="godown_loc")
	private String godownLocation;
	@Column(name="capacity")
	private long capacity;
	@Column(name="godown_manager")
	private String godownManager;
	@Column(name="start_date")
	@JsonFormat(pattern="yyyy-mm-dd",shape= Shape.STRING)
	private String StartDate;
	
	public long getGodownId() {
		return godownId;
	}
	public void setGodownId(long godownId) {
		this.godownId = godownId;
	}
	public String getGodownLocation() {
		return godownLocation;
	}
	public void setGodownLocation(String godownLocation) {
		this.godownLocation = godownLocation;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public String getGodownManager() {
		return godownManager;
	}
	public void setGodownManager(String godownManager) {
		this.godownManager = godownManager;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	
	
	

}
