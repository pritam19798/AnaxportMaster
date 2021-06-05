package com.Anaxport.Master.Place.Entity;

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

import com.Anaxport.Master.District.Entity.DistrictInfo;

@Entity
public class PlaceInfo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer placeId;
	
	@Column(name="PLACE_NAME",columnDefinition = "varchar(25)")
	private String placeName;
	
	@Column(name="PLACE_DESC",columnDefinition = "varchar(2500)")
	private String placeDesc;
	
	@Column(name="PLACE_CODE",columnDefinition = "varchar(5)")
	private String placeCode;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "DISTRICT_ID", referencedColumnName = "districtId")
	private DistrictInfo districtInfo;
	
	@Column(name="AIRPORT_CODE",columnDefinition = "integer")
	private int airportCode;
	
	@Column(name="STATION_CODE",columnDefinition = "integer")
	private int stationCode;
	
	@Column(name="PIN_CODE",columnDefinition = "integer")
	private int pinCode;
	
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

	public PlaceInfo() {
	}

	public PlaceInfo(Integer placeId, String placeName, String placeDesc, String placeCode, DistrictInfo districtInfo,
			int airportCode, int stationCode, int pinCode, int visitCount, int displayOrder, String remarks,
			char isActive, int createdBy, LocalDateTime createdOn, int modifieddBy, LocalDateTime modifiedOn) {
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeDesc = placeDesc;
		this.placeCode = placeCode;
		this.districtInfo = districtInfo;
		this.airportCode = airportCode;
		this.stationCode = stationCode;
		this.pinCode = pinCode;
		this.visitCount = visitCount;
		this.displayOrder = displayOrder;
		this.remarks = remarks;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifieddBy = modifieddBy;
		this.modifiedOn = modifiedOn;
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceDesc() {
		return placeDesc;
	}

	public void setPlaceDesc(String placeDesc) {
		this.placeDesc = placeDesc;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public DistrictInfo getDistrictInfo() {
		return districtInfo;
	}

	public void setDistrictInfo(DistrictInfo districtInfo) {
		this.districtInfo = districtInfo;
	}

	public int getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}

	public int getStationCode() {
		return stationCode;
	}

	public void setStationCode(int stationCode) {
		this.stationCode = stationCode;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
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
