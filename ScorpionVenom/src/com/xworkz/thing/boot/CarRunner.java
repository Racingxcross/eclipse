package com.xworkz.thing.boot;

import com.xworkz.gagan.thing.Car;

public class CarRunner {

	public static void main(String[] args) {
		        String[] color= {"black","white","red"};
		        int[] RPM= {1200,1400};
		        int[] noOfGears= {5,6,8};
		        int[] mialage= {35,40,20};
		        int[] model= {1988,2021,2021};
			 
		        Car car=new Car("santro", 1000, 140, color, RPM, noOfGears, model, mialage, false, false,'m', 35);
		        
		        car.display();
	}

}
