package com.Anaxport.Master.GST.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GstRates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gstId;
	
	@Column(name="HSN_CODE",columnDefinition = "varchar(10)")
	private String hsnCode;
	
	@Column(name="CATEGORY_CODE",columnDefinition = "varchar(4)")
	private String categoryCode;
	
	@Column(name="COMMODITY_DESC",columnDefinition = "long")
	private Long commodityDesc;
	
	@Column(name="CHAPTER_NO",columnDefinition = "varchar(5)")
	private String chapterNo;
	
	@Column(name="SCHEDULE_NO",columnDefinition = "varchar(5)")
	private String scheduleNo;
	
	@Column(name="CGST",columnDefinition = "float")
	private float cgst;
	
	@Column(name="SGST",columnDefinition = "float")
	private float sgst;
	
	@Column(name="IGST",columnDefinition = "float")
	private float igst;
	
	@Column(name="CESS",columnDefinition = "float")
	private float cess;
	
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
	
	public GstRates() {

	}

	public GstRates(Integer gstId, String hsnCode, String categoryCode, Long commodityDesc, String chapterNo,
			String scheduleNo, float cgst, float sgst, float igst, float cess, String remarks, char isActive,
			int createdBy, LocalDateTime createdOn, int modifieddBy, LocalDateTime modifiedOn) {
		super();
		this.gstId = gstId;
		this.hsnCode = hsnCode;
		this.categoryCode = categoryCode;
		this.commodityDesc = commodityDesc;
		this.chapterNo = chapterNo;
		this.scheduleNo = scheduleNo;
		this.cgst = cgst;
		this.sgst = sgst;
		this.igst = igst;
		this.cess = cess;
		this.remarks = remarks;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifieddBy = modifieddBy;
		this.modifiedOn = modifiedOn;
	}

	public Integer getGstId() {
		return gstId;
	}

	public void setGstId(Integer gstId) {
		this.gstId = gstId;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Long getCommodityDesc() {
		return commodityDesc;
	}

	public void setCommodityDesc(Long commodityDesc) {
		this.commodityDesc = commodityDesc;
	}

	public String getChapterNo() {
		return chapterNo;
	}

	public void setChapterNo(String chapterNo) {
		this.chapterNo = chapterNo;
	}

	public String getScheduleNo() {
		return scheduleNo;
	}

	public void setScheduleNo(String scheduleNo) {
		this.scheduleNo = scheduleNo;
	}

	public float getCgst() {
		return cgst;
	}

	public void setCgst(float cgst) {
		this.cgst = cgst;
	}

	public float getSgst() {
		return sgst;
	}

	public void setSgst(float sgst) {
		this.sgst = sgst;
	}

	public float getIgst() {
		return igst;
	}

	public void setIgst(float igst) {
		this.igst = igst;
	}

	public float getCess() {
		return cess;
	}

	public void setCess(float cess) {
		this.cess = cess;
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
