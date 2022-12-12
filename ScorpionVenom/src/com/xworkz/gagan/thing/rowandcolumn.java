package com.xworkz.gagan.thing;

public class rowandcolumn {
	
  public static void main (String[] args) {
	  
	  int n=4;
	  //main loop
	  for (int i = 1; i <=  n; i++) {
		  //printing space
		  for (int j = n - 1; j >= i; j--) {
			  System.out.print(" ");
		  }
		  //for char add space to get equilateral
		  for (int k = 1; k <=i; k++) {
			  if(k !=2) {
			  System.out.print(k);
		  }
		  else {
		System.out.print("Gagan");
		  }
		  }
		  System.out.println(" ");
	  }
  }
}

