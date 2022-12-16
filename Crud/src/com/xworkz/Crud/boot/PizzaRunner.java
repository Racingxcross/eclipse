package com.xworkz.Crud.boot;

import com.xworkz.Crud.Service.PizzaServiceimpl;
import com.xworkz.Crud.dto.PizzaDTO;

public class PizzaRunner {
	public static void main(String[] args) {

		PizzaDTO dto = new PizzaDTO();
		dto.setCompany(null);
		dto.setFlavour(null);

		PizzaServiceimpl pizzaServiceimpl = new PizzaServiceimpl();

		pizzaServiceimpl.validAndSave(dto);

	}
}
