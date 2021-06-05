package com.Anaxport.Master.State.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StateInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stateId;
	
	@Column(name="STATE_NAME",columnDefinition = "varchar(25)")
	private String stateName;
	
	@Column(name="STATE_DESC",columnDefinition = "varchar(2500)")
	private String stateDesc;
	
	@Column(name="GST_CODE",columnDefinition = "varchar(2)")
	private long gstCode;
	
	@Column(name="ALPHA_CODE",columnDefinition = "long")
	private long alphaCode;
	
	@Column(name="REGION_VALUE",columnDefinition = "varchar(5)")
	private String regionValue;
	
	@Column(name="CAPITAL_ID",columnDefinition = "integer")
	private int capitalId;
	
	@Column(name="PIN_START",columnDefinition = "varchar(6)")
	private String pinStart;
	
	@Column(name="PIN_END",columnDefinition = "varchar(6)")
	private String pinEnd;
	
	@Column(name="VISIT_COUNT",columnDefinition = "integer")
	private int visitCount;
	
	@Column(name="DIPLAY_ORDER",columnDefinition="integer")
	private int displayOrder;
	
	@Column(name="REMARKS",columnDefinition = "varchar(1000)")
	private String remarks;
	
	@Column(name="IS_ACTIVE",columnDefinition = "varchar(1)")
	private char isActive;
	
	@Column(name="CREATED_BY",columnDefinition = "integer default 0")
	private int createdBy;
	
	@Column(name="CREATED_ON",columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	private LocalDateTime createdOn=LocalDateTime.now();
	
	@Column(name="MODIFIED_BY",columnDefinition = "integer ")
	private int modifieddBy;
	
	@Column(name="MODIFIED_ON",columnDefinition = "timestamp")
	private LocalDateTime modifiedOn;

	public StateInfo() {

	}

	public StateInfo(Integer stateId, String stateName, String stateDesc, long gstCode, long alphaCode,
			String regionValue, int capitalId, String pinStart, String pinEnd, int visitCount, int displayOrder,
			String remarks, char isActive, int createdBy, LocalDateTime createdOn, int modifieddBy,
			LocalDateTime modifiedOn) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.stateDesc = stateDesc;
		this.gstCode = gstCode;
		this.alphaCode = alphaCode;
		this.regionValue = regionValue;
		this.capitalId = capitalId;
		this.pinStart = pinStart;
		this.pinEnd = pinEnd;
		this.visitCount = visitCount;
		this.displayOrder = displayOrder;
		this.remarks = remarks;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifieddBy = modifieddBy;
		this.modifiedOn = modifiedOn;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateDesc() {
		return stateDesc;
	}

	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

	public long getGstCode() {
		return gstCode;
	}

	public void setGstCode(long gstCode) {
		this.gstCode = gstCode;
	}

	public long getAlphaCode() {
		return alphaCode;
	}

	public void setAlphaCode(long alphaCode) {
		this.alphaCode = alphaCode;
	}

	public String getRegionValue() {
		return regionValue;
	}

	public void setRegionValue(String regionValue) {
		this.regionValue = regionValue;
	}

	public int getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(int capitalId) {
		this.capitalId = capitalId;
	}

	public String getPinStart() {
		return pinStart;
	}

	public void setPinStart(String pinStart) {
		this.pinStart = pinStart;
	}

	public String getPinEnd() {
		return pinEnd;
	}

	public void setPinEnd(String pinEnd) {
		this.pinEnd = pinEnd;
	}

	public int getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public int getModifieddBy() {
		return modifieddBy;
	}

	public void setModifieddBy(int modifieddBy) {
		this.modifieddBy = modifieddBy;
	}

	public LocalDateTime getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(LocalDateTime modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	
}
