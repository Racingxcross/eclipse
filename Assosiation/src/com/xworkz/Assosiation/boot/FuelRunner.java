package com.xworkz.Assosiation.boot;

import com.xworkz.Assosiation.thing.Fuel;

public class FuelRunner {
	
		public static void main(String[] args) {
			
			Fuel fuel=new Fuel( false,103.6);
			fuel.showOff();
			fuel.setPrice();

		}

	}


