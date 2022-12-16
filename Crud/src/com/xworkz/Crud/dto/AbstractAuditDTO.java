package com.xworkz.Crud.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {

	private String CreatedBy;
	private LocalDateTime CreatedDate;
	private String UpdatedBy;
	private LocalDateTime UpdatedDate;
	
	public AbstractAuditDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "AbstractAuditDTO [CreatedBy=" + CreatedBy + ", CreatedDate=" + CreatedDate + ", UpdatedBy=" + UpdatedBy
				+ ", UpdatedDate=" + UpdatedDate + "]";
	}


	public AbstractAuditDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		CreatedBy = createdBy;
		CreatedDate = createdDate;
		UpdatedBy = updatedBy;
		UpdatedDate = updatedDate;
	}


	public String getCreatedBy() {
		return CreatedBy;
	}


	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}


	public LocalDateTime getCreatedDate() {
		return CreatedDate;
	}


	public void setCreatedDate(LocalDateTime createdDate) {
		CreatedDate = createdDate;
	}


	public String getUpdatedBy() {
		return UpdatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}


	public LocalDateTime getUpdatedDate() {
		return UpdatedDate;
	}


	public void setUpdatedDate(LocalDateTime updatedDate) {
		UpdatedDate = updatedDate;
	}
	
	
	
}
