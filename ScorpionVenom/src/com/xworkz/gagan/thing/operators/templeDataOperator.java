package com.xworkz.gagan.thing.operators;

public class templeDataOperator {
	
		static String[] TempleNames={null,null,null,null,null};
		static int position=0;
		public static void save(String templeName)
		{
			System.out.println("save:start");
			TempleNames[position]=templeName;
			position++;
			System.out.println("saved: "+templeName + " in position "+position);
			System.out.println("save:end");
		}
	}

