package com.xworkz.thing.boot;

import com.xworkz.gagan.thing.Fruits;

public class FruitsRunner
{
	public static void main(String[] args) {
		String[] name= {"apple","mango","orange","pineApple","banana","pomogranate"};
		String[] color= {"red","yellow","orange","yellow","yelloww","pink"};
	   String[] dryFruit = {"grapes","godambi"};
	  String[] favouriteFruit = {"apple"};
	  
	Fruits fruits=new Fruits( name , color, 120, false, 0, true, 'S', dryFruit, false, favouriteFruit); 
	  
		
			 if( fruits!=null);{
			  
	       fruits.display();
			  }
			 
	}

}
