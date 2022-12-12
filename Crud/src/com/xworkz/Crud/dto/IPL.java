package com.xworkz.Crud.dto;

import com.xworkz.Crud.Repository.AbstractAudit;

public class IPL extends AbstractAudit {
	private String teamName;
	private String captainName;
	private boolean ownerAlive;
	private double purse;
	private int wins;
	private int defeats;

	public IPL() {
		System.out.println("calling no-arg const of IPL");
	}

	@Override
	public String toString() {
		return "IPL [teamName=" + teamName + ", captainName=" + captainName + ", ownerAlive=" + ownerAlive + ", purse="
				+ purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public double getPurse() {
		return purse;
	}

	public int getWins() {
		return wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setteamName(String string) {
		// TODO Auto-generated method stub

	}

	public void setownerAlive() {
		// TODO Auto-generated method stub

	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setOwnerAlive11(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public void setPurse(int i) {
		// TODO Auto-generated method stub

	}

	public void setWins(int i) {
		// TODO Auto-generated method stub

	}

	public void setDefeats(int i) {
		// TODO Auto-generated method stub

	}

	public void setCaptainName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setOwnerAlive1(boolean ownerAlive2) {
		// TODO Auto-generated method stub
		
	}

	public void setOwnerAlive(boolean ownerAlive2) {
		// TODO Auto-generated method stub
		
	}

}
