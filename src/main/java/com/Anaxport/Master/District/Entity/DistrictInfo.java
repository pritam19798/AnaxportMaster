package com.Anaxport.Master.District.Entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.Anaxport.Master.State.Entity.StateInfo;

@Entity
public class DistrictInfo {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer districtId;
	
	@Column(name="DISTRICT_NAME",columnDefinition = "varchar(25)")
	private String districtName;
	
	@Column(name="DISTRICT_DESC",columnDefinition = "varchar(2500)")
	private String districtDesc;
	
	@Column(name="DISTRICT_CODE",columnDefinition = "varchar(5)")
	private String districtCode;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "STATE_ID", referencedColumnName = "stateId")
	private StateInfo stateInfo;
	
	@Column(name="HEADQUARTER_ID",columnDefinition = "integer")
	private long headquarterId;
	
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

	public DistrictInfo() {

	}

	public DistrictInfo(Integer districtId, String districtName, String districtDesc, String districtCode,
			StateInfo stateInfo, long headquarterId, int visitCount, int displayOrder, String remarks, char isActive,
			int createdBy, LocalDateTime createdOn, int modifieddBy, LocalDateTime modifiedOn) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.districtDesc = districtDesc;
		this.districtCode = districtCode;
		this.stateInfo = stateInfo;
		this.headquarterId = headquarterId;
		this.visitCount = visitCount;
		this.displayOrder = displayOrder;
		this.remarks = remarks;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifieddBy = modifieddBy;
		this.modifiedOn = modifiedOn;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictDesc() {
		return districtDesc;
	}

	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public StateInfo getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(StateInfo stateInfo) {
		this.stateInfo = stateInfo;
	}

	public long getHeadquarterId() {
		return headquarterId;
	}

	public void setHeadquarterId(long headquarterId) {
		this.headquarterId = headquarterId;
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
