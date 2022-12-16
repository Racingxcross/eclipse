package com.xworkz.Crud.Service;

import com.xworkz.Crud.Repository.HelmetRepository;
import com.xworkz.Crud.constants.HelmetColor;
import com.xworkz.Crud.constants.HelmetType;
import com.xworkz.Crud.dto.HelmetDTO;

public class HelmetServiceimpl implements HelmetService {
	private HelmetRepository helmet;

	public HelmetServiceimpl(HelmetRepository helmet) {
		super();
		this.helmet = helmet;
	}

	@Override
	public boolean validAndSave(HelmetDTO dto) {
		String name = dto.getName();
		Double price = dto.getPrice();
		HelmetType type = dto.getType();
		HelmetColor color = dto.getColor();
		boolean nameValid = false;
		boolean priceValid = false;
		boolean typeValid = false;
		boolean colorValid = false;
		

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name data is valid");
			nameValid = true;
		} else {
			System.err.println("name is not invalid");
		}
		if (price != null && price > 1000 && price <= 5000) {
			System.out.println("price data is valid");
			priceValid = true;
		} else {
			System.err.println("price is invalid");
		}

		if (type != null) {
			System.out.println("type data is valid");
			typeValid = true;
		} else {
			System.err.println("type is not valid");
		}
		if (color != null) {
			System.out.println("color data is valid");
			colorValid = true;
		} else {
			System.err.println("color is not valid");
		}
		if (nameValid && priceValid && typeValid && colorValid) {
			System.out.println("data is valid save the data");
			boolean save = helmet.saveData(dto);
			System.out.println("saved data :" +save);
			return save;
			

		}

		return false;

	}

}
