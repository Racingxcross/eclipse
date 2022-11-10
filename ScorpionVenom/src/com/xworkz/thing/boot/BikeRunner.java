package com.xworkz.thing.boot;

import com.xworkz.gagan.thing.Bike;

public class BikeRunner {

	public static void main(String[] args) {
        String[] color= {"black","white","red"};
        int[] RPM= {1200,1400};
        int[] noOfGears= {5,6,8};
        int[] mialage= {35,40,20};
        int[] model= {1988,2021,2021};
	 
        Bike bike=new Bike("rx", 100, 120, color, RPM, noOfGears, mialage, model, false,false,'S', 12);
        
        bike.display();
        
        
	}     
        
	}


