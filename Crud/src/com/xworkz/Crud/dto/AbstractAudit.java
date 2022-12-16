package com.xworkz.Crud.dto;

import java.time.LocalDateTime;

public class AbstractAudit {

	private String CreatedBy;
	private LocalDateTime CreatedDate;
	private String UpdatedBy;
	private LocalDateTime UpdatedDate;

	public AbstractAudit() {

	}

	@Override
	public String toString() {
		return "AbstractAudit [CreatedBy=" + CreatedBy + ", CreatedDate=" + CreatedDate + ", UpdatedBy=" + UpdatedBy
				+ ", UpdatedDate=" + UpdatedDate + ", toString()=" + super.toString() + "]";
	}

	public AbstractAudit(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
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
