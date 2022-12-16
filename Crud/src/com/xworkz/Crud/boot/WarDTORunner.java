package com.xworkz.Crud.boot;

import com.xworkz.Crud.Repository.WarRepository;
import com.xworkz.Crud.Repository.WarRepositoryimpl;
import com.xworkz.Crud.dto.WarDTO;

public class WarDTORunner {
	public static void main(String[] args) throws Exception {
		WarRepository repository = new WarRepositoryimpl();

		WarDTO dto = new WarDTO();
		dto.setName("WORLDWAR");
		dto.setWonBy("INDIA");
		dto.setStartedWith("PAK");
		dto.setStartedBy("PAK");
		dto.setStartDate((short) 1946);
		dto.setNoOfDeaths(212);
		dto.setEndDate((short) 1947);

		repository.create(dto);
		repository.create(dto);
		repository.create(dto);
		System.out.println(repository.total());

	}
}
