package com.xworkz.Crud.boot;

import java.awt.Color;

import com.xworkz.Crud.Repository.HelmetRepository;
import com.xworkz.Crud.Repository.HelmetRepositoryimpl;
import com.xworkz.Crud.Service.HelmetService;
import com.xworkz.Crud.Service.HelmetServiceimpl;
import com.xworkz.Crud.constants.HelmetColor;
import com.xworkz.Crud.constants.HelmetType;
import com.xworkz.Crud.dto.HelmetDTO;

public class HelmetRunner {
	public static void main(String[] args) {
		System.out.println("main method run");

		HelmetDTO dto = new HelmetDTO("vega", HelmetType.HALF, HelmetColor.WHITE, 4000D);

		HelmetRepository helmetRepository = new HelmetRepositoryimpl();
		HelmetService helmetService = new HelmetServiceimpl(helmetRepository);

		boolean helmet = helmetService.validAndSave(dto);
		System.out.println("valid " + helmet);

	}
}
