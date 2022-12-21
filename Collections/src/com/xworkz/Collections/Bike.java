package com.xworkz.Collections;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
	public static void main(String[] args) {
		String bike1 = "RX100";
		String bike2 = "KTM";
		String bike3 = "RX135";
		String bike4 = "RXZ";
		String bike5 = "YEZDI";
		String bike6 = "ROADKING";
		String bike7 = "RAJDOOTH";
		String bike8 = "DAWN";
		String bike9 = "CD100";
		String bike10 = "HEROHONDA";
		String bike11 = "KARIZMA";
		String bike12 = "PULSAR";

		Collection<String> collection = new TreeSet();
		collection.add(bike3);
		collection.add(bike12);
		collection.add(bike11);
		collection.add(bike10);
		collection.add(bike9);
		collection.add(bike2);
		collection.add(bike1);
		collection.add(bike5);
		collection.add(bike7);
		collection.add(bike4);
		collection.add(bike6);
		collection.add(bike8);

		System.out.println(collection);
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clear...");
		System.out.println(collection.size());

		System.out.println("--------------------------------------------------------");

		String bike21 = "RX100";
		String bike22 = "KTM";
		String bike23 = "RX135";
		String bike24 = "RXZ";
		String bike25 = "YEZDI";
		String bike26 = "ROADKING";
		String bike27 = "RAJDOOTH";
		String bike28 = "DAWN";
		String bike29 = "CD100";
		String bike30 = "HEROHONDA";
		String bike31 = "KARIZMA";
		String bike32 = "PULSAR";

		Collection<String> collection1 = new TreeSet<String>();

		collection.add(bike23);
		collection.add(bike32);
		collection.add(bike31);
		collection.add(bike30);
		collection.add(bike29);
		collection.add(bike22);
		collection.add(bike21);
		collection.add(bike25);
		collection.add(bike27);
		collection.add(bike24);
		collection.add(bike26);
		collection.add(bike28);

		System.out.println(collection1);
		System.out.println(collection1.size());
		collection1.clear();
		System.out.println("after clear...");
		System.out.println(collection1.size());
	}
}
