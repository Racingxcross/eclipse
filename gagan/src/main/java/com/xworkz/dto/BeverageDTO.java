package com.xworkz.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BeverageDTO {
	private String name;
	private int price;
	private LocalDate mfg;
	private String add;
	private String addHero;
	private String madeIn;
	private String color;
	private String flavour;

}
