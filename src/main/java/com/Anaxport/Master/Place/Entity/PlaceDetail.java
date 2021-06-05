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
import javax.persistence.OneToOne;

@Entity
public class PlaceDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer placeDetailId;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "PLACE_ID", referencedColumnName = "placeId")
	private PlaceInfo placeInfo;
	
	@Column(name="SECTION_TYPE",columnDefinition = "varchar(5)")
	private String sectionType;
	
	@Column(name="SECTION_NAME",columnDefinition = "varchar(10)")
	private String sectionName;
	
	@Column(name="S_NAME_SIZE",columnDefinition = "integer")
	private int sNameSize;
	
	@Column(name="SECTION_ICON",columnDefinition = "integer")
	private int sectionIcon;
	
	@Column(name="S_ICON_SIZE",columnDefinition = "integer")
	private int sIconSize;
	
	@Column(name="SPACE_BEFORE",columnDefinition = "integer")
	private int spaceBefore;
	
	@Column(name="SPACE_DESC",columnDefinition = "long")
	private long spaceDesc;
	
	@Column(name="SPACE_AFTER",columnDefinition = "integer")
	private int spaceAfter;
	
	@Column(name="SPACE_ORDER",columnDefinition = "integer")
	private int spaceOrder;
	
	@Column(name="PARENT_ID",columnDefinition = "integer")
	private int parentId;
	
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

	
	public PlaceDetail() {
	}

	public PlaceDetail(Integer placeDetailId, PlaceInfo placeInfo, String sectionType, String sectionName,
			int sNameSize, int sectionIcon, int sIconSize, int spaceBefore, long spaceDesc, int spaceAfter,
			int spaceOrder, int parentId, char isActive, int createdBy, LocalDateTime createdOn, int modifieddBy,
			LocalDateTime modifiedOn) {
		this.placeDetailId = placeDetailId;
		this.placeInfo = placeInfo;
		this.sectionType = sectionType;
		this.sectionName = sectionName;
		this.sNameSize = sNameSize;
		this.sectionIcon = sectionIcon;
		this.sIconSize = sIconSize;
		this.spaceBefore = spaceBefore;
		this.spaceDesc = spaceDesc;
		this.spaceAfter = spaceAfter;
		this.spaceOrder = spaceOrder;
		this.parentId = parentId;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifieddBy = modifieddBy;
		this.modifiedOn = modifiedOn;
	}

	public Integer getPlaceDetailId() {
		return placeDetailId;
	}

	public void setPlaceDetailId(Integer placeDetailId) {
		this.placeDetailId = placeDetailId;
	}

	public PlaceInfo getPlaceInfo() {
		return placeInfo;
	}

	public void setPlaceInfo(PlaceInfo placeInfo) {
		this.placeInfo = placeInfo;
	}

	public String getSectionType() {
		return sectionType;
	}

	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public int getsNameSize() {
		return sNameSize;
	}

	public void setsNameSize(int sNameSize) {
		this.sNameSize = sNameSize;
	}

	public int getSectionIcon() {
		return sectionIcon;
	}

	public void setSectionIcon(int sectionIcon) {
		this.sectionIcon = sectionIcon;
	}

	public int getsIconSize() {
		return sIconSize;
	}

	public void setsIconSize(int sIconSize) {
		this.sIconSize = sIconSize;
	}

	public int getSpaceBefore() {
		return spaceBefore;
	}

	public void setSpaceBefore(int spaceBefore) {
		this.spaceBefore = spaceBefore;
	}

	public long getSpaceDesc() {
		return spaceDesc;
	}

	public void setSpaceDesc(long spaceDesc) {
		this.spaceDesc = spaceDesc;
	}

	public int getSpaceAfter() {
		return spaceAfter;
	}

	public void setSpaceAfter(int spaceAfter) {
		this.spaceAfter = spaceAfter;
	}

	public int getSpaceOrder() {
		return spaceOrder;
	}

	public void setSpaceOrder(int spaceOrder) {
		this.spaceOrder = spaceOrder;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
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
