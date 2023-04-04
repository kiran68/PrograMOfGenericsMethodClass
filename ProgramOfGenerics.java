package com.bridgelabz.generics;

public class ProgramOfGenerics {
	 public static <K extends Comparable<K>>K maximum (K x, K y, K z){
		 
		 K max = x;
		 
		 if (y.compareTo(max) > 0) {
			 max = y;
			 
		 }
		 if (z.compareTo(max)>0) {
			 max = z;
		 }
		 
		 return max;
		 
	 }
	 public static void main(String[] args) {
		
		
		System.out.println("Maximum Float Value : " + maximum(2.14,4.15,1.45));
	 }
}
