package com.xworkz.Crud.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable{
	
	private String createdBy;
	private LocalDateTime CreatedDate;
	private String updatedBy;
	
	
	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", CreatedDate=" + CreatedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	private LocalDateTime updatedDate;
	
	public AbstractAuditDTO() {
		System.out.println("calling no-args const of AbstractAudit");
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		CreatedDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
