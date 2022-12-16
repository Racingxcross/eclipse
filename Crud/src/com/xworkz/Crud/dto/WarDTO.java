package com.xworkz.Crud.dto;

import com.xworkz.Crud.Repository.AbstractAudit;

public class WarDTO extends AbstractAuditDTO {
	private String name;
	private short startDate;
	private short endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeaths;

	public WarDTO() {
		System.out.println("let them die");
	}

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getStartDate() {
		return startDate;
	}

	public void setStartDate(short startDate) {
		this.startDate = startDate;
	}

	public short getEndDate() {
		return endDate;
	}

	public void setEndDate(short endDate) {
		this.endDate = endDate;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

	public void create(WarDTO dto) {
		// TODO Auto-generated method stub

	}

	public char[] total() {
		// TODO Auto-generated method stub
		return null;
	}

}
