package com.xworkz.Crud.dto;

import com.xworkz.Crud.constants.HelmetColor;
import com.xworkz.Crud.constants.HelmetType;

public class HelmetDTO extends AbstractAudit{

	private String name;
	private HelmetType type;
	private HelmetColor color;
	private double price;

	public HelmetDTO() {

	}

	@Override
	public String toString() {
		return "HelmetDTO [name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + ", toString()="
				+ super.toString() + "]";
	}

	public HelmetDTO(String name, HelmetType type, HelmetColor color, double price) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public HelmetColor getColor() {
		return color;
	}

	public void setColor(HelmetColor color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
