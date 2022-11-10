package com.xworkz.gagan.thing;

public class Laptop {
	
	public String[] name;
	public String[] color;
	public int[] RAM;
	public int storage;
	public int[] weight;
	public boolean longBatteryLife;
	public boolean working;
	public boolean latestWindows;
	public boolean ios;
	public boolean android;
	public boolean slim;
	public char[] camera;
	public float model;
	

	
	public Laptop (String[] name, String[] color, int[] RAM,int storage,int[] weight,boolean longBatteryLife,  boolean working ,boolean latestWindows,  boolean ios,boolean android,boolean slim, char[] camera, float model ) {
		this.name=name;
		this.color=color;
		this.RAM=RAM;
		this.storage=storage;
		this.weight=weight;
		this.longBatteryLife=android;
		this.working=working;
		this.latestWindows=latestWindows;
		this.ios=ios;
		this.android=android;
		this.slim=slim;
		this.camera=camera;
		this.model=model;
		
	}
		

		public void display() {
			 System.out.println(this.storage);
			 System.out.println(this.longBatteryLife);
			 System.out.println(this.working);
			 System.out.println(this.latestWindows);
			 System.out.println(this.ios);
			 System.out.println(this.android);
			 System.out.println(this.slim);
			 System.out.println(this.model);
			 
			 for (int i = 0; i < name.length; i++) {
				System.out.println();
			 }
				
				for (int k = 0; k < color.length; k++) {
				System.out.println();
				}
					
				for (int i = 0; i < RAM.length; i++) {
					System.out.println();
				}
				
				for (int i = 0; i < weight.length; i++) {
					System.out.println();
				}
				for (int i = 0; i < camera.length; i++) {
					
				}
				}
				
			}
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	
	
	

	