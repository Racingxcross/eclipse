package com.xworkz.instance.boot;

import com.xworkz.instance.thing.Marriage;
import com.xworkz.instance.thing.omkarSir;
import com.xworkz.instance.thing.Invitation;
;

public class omkarSirRunner {
	
	public static void main(String[] args) {
		Marriage marriage = new omkarSir("Omkar","mamatha","suspense");
		System.out.println("groom Name :" +omkarSir.groomName);
		System.out.println("bride Name :" +omkarSir.brideName);
		System.out.println("marriageType :" +omkarSir.marriageType);	
		
		Invitation invitation = new Invitation("foldable", "white", 'm');
		System.out.println("type :" +omkarSir.foldable);
		System.out.println("color :" +omkarSir.white);
		System.out.println("size :" +omkarSir.white);
	}
}
