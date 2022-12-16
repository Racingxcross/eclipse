package com.xworkz.Crud.Repository;

import java.time.LocalDateTime;

import com.xworkz.Crud.Exception.WarSizeExceededException;
import com.xworkz.Crud.dto.WarDTO;

public class WarRepositoryimpl implements WarRepository {

	private WarDTO[] war = new WarDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(WarDTO war) {
		System.out.println("running create of war" + war);
		if (this.currentIndex >= this.war.length) {
			System.err.println("size exceeded cannot add more war");
			throw new WarSizeExceededException();
		}
		this.war[this.currentIndex] = war;
		System.out.println("saved" + war + "in index" + currentIndex);
		this.currentIndex++;

		return true;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return WarRepository.super.total();
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println();
		return null;
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String StartedWith, String startedBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartAndEndDate(LocalDateTime start, LocalDateTime end) {
		// TODO Auto-generated method stub
		return null;
	}

}
