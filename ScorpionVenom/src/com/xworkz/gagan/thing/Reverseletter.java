package com.xworkz.gagan.thing;

public class Reverseletter {

public static class ReverseWords {
    public static void main(String args[]) {
      String s[] = "Xworkz is a training institute".split(" "); 
      String ans = ""; 
      for (int i = s.length - 1; i >= 0; i--) { 
        ans = ans+ s[i] + " "; 
      } 
      System.out.println("Reversed String: " + ans); 
    }
}
}