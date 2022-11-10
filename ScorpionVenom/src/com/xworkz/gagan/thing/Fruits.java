package com.xworkz.gagan.thing;

public class Fruits {
	public String[] name;
	public String[] color;
	public double price;
	public boolean quality;
	public int quantity;
	public boolean vitamin;
	public char size;
	public String[] dryFruit;
	public boolean seeds;
	public String[] favouriteFruit;
	  
	
	public Fruits (String[] name, String[] color, double price, boolean quality, int quantity, boolean vitamin, char size, String[] dryFruit, boolean seeds, String[] favouriteFruit)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.quality=quality;
		this.quantity=quantity;
		this.vitamin=vitamin;
		this.size=size;
		this.dryFruit=dryFruit;
		this.seeds=seeds;
		this.favouriteFruit=favouriteFruit;
	}



	


	public void display()
	{
        System.out.println(this.price);
		
		System.out.println(this.quantity);
		
		
		System.out.println(this.quality); 
		
		System.out.println(this.vitamin);
		
		System.out.println(this.size);
		
		System.out.println(this.seeds);
		
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		
		
		for (int i = 0; i < dryFruit.length; i++) {
			String string = dryFruit[i];
			System.out.println(string);
		}
		
		
		for (int i = 0; i < favouriteFruit.length; i++) {
			String string = favouriteFruit[i];
			System.out.println(string);
		} 
	}
	
}