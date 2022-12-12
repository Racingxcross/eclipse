package com.xworkz.Crud.Repository;

import com.xworkz.Crud.dto.IPL;

public class IPLRepositoryImpl implements IPLRepository {

	private IPL[] ipl = new IPL[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IPL ipl) {
		System.out.println("running create of IPL" + ipl);
		if (this.currentIndex > this.ipl.length) {
			System.err.println("size exceeded cannot add more ipl");
			return false;
		}
		this.ipl[this.currentIndex]=ipl;
		System.out.println("saved" + ipl+ "in index" + this.currentIndex++);
		this.currentIndex++;
		return true;
	}
	

}
