package com.xworkz.gagan.thing;

public class NumberPyramid {

	int n=4;
		  public static void main (String[] args) {
			  //to change characters change the value of i,j,k values and allow space for logic
			  int n=4;
			  //main loop
			  for(int i=1;i<=n;i++) {
				  //printing space
				  for(int j=n-1;j>=i;j--) {
					  System.out.print(" ");
				  }
				  for(int k=1;k<=i;k++) {
					  System.out.print(i);
				  }
				  System.out.println(" ");
			  }
		  

		// change the k value

	  //to change characters change the value of i,j,k values and allow space for logic
	  
	  //main loop
	  for(int i=1;i<=n;i++) {
		  //printing space
		  for(int j=n-1;j>=i;j--) {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++) {
			  System.out.print(k);
		  }
		  System.out.println(" ");
	  }
}

}


