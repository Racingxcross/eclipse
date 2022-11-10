package com.xworkz.thing.boot;

import com.xworkz.gagan.thing.Laptop;

public class LaptopRunner {


	public static void main(String[] args) {
		String[] name= {"lenovo","dell","hp"};
		String[] color= {"black","red","silver"};
		 int[] RAM= {8,16,24};
		 int[] weight= {500,600,750};
		 char[] cam= {'s'};
		
		 
new Laptop(name, color, RAM, 0, weight, false, false, false, false, false, false, cam, 0);


	}

}
