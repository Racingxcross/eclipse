package com.xworkz.gagan.thing;

public class Bike {
	
	public String name;
	public int cc;
	public int topSpeed;
	public String[] color;
	public int[] RPM;
	public int[] noOfGears;
	public int[] mialage;
	public int[] model;
	public boolean discBrake;
	public boolean offRoad;
	public char bikeLength;
	public double fuelCapacity;

	
	public Bike(String name, int cc, int topSpeed, String[] color, int[] RPM, int[] noOfGears, int[] model, int[] mialage, boolean discBrake, boolean offRoad, char bikeLength, double fuelCapacity) {
		this.name=name;
		this.cc=cc;
		this.topSpeed=topSpeed;
		this.color=color;
		this.RPM=RPM;
		this.noOfGears=noOfGears;
		this.model=model;
		this.mialage=mialage;
		this.discBrake=discBrake;
		this.offRoad=offRoad;
		this.bikeLength=bikeLength;
		this.fuelCapacity=fuelCapacity;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.cc);
		System.out.println(this.topSpeed);
		System.out.println(this.discBrake);
		System.out.println(this.offRoad);
		System.out.println(this.bikeLength);  
		System.out.println(this.fuelCapacity);
		
		for (int i = 0; i < color.length; i++) {
			String string  = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < RPM.length; i++) {
		     int  j  = RPM[i];
			System.out.println(j);
		}
		for (int i = 0; i < noOfGears.length; i++) {
			int j = noOfGears[i];
			System.out.println(j);
		}
		for (int i = 0; i < model.length; i++) {
			int j = model[i];
			System.out.println(j);
		}
		for (int i = 0; i < mialage.length; i++) {  
			int j = mialage[i];
			System.out.println(j);
		}
	
		}
	}
	
		


