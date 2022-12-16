package com.xworkz.Crud.Service;

import com.xworkz.Crud.dto.PizzaDTO;

public class PizzaServiceimpl implements PizzaService {

	@Override
	public boolean validAndSave(PizzaDTO dto) {
if(dto!=null) {
		String company = dto.getCompany();
		if (company != null && company.length() > 4 && company.length() < 20) {
			System.out.println("company name is valid " + company);
		} else {
			System.err.println("company name is invalid " + company);
		
		}
		String flavour = dto.getFlavour();
		if (flavour != null && flavour.length() > 4 && flavour.length() < 20) {
			System.out.println("flavour is valid " + flavour);
		} else {
			System.err.println("flavour is invalid " + flavour);
		}
		
		
		
		return false;

}
		return true;
	}

}
