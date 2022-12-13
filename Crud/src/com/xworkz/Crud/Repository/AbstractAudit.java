package com.xworkz.Crud.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAudit implements Serializable {

	
	private String createdBy;
	private LocalDateTime CreatedDate;
	private String updatedBy;
	private LocalDateTime updatedDate;

	public AbstractAudit() {
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

	public void setCreatedDate(LocalDateTime CreatedDate) {
		this.CreatedDate = CreatedDate;
	}
}
