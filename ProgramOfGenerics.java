package com.bridgelabz.generics;

public class ProgramOfGenerics {
	 public static <K extends Comparable<K>>K maximum (K x, K y, K z, K a, K b){
		 
		 K max = x;
		 
		 if (y.compareTo(max) > 0) {
			 max = y;
			 
		 }
		 if (z.compareTo(max)>0) {
			 max = z;
		 }
		 if (a.compareTo(max)> 0) {
			 max = a;
		 }
		 if (b.compareTo(max) > 0) {
			 max = b;
		 }
		 
		 return max;
		 
	 }
	 public static void main(String[] args) {
		
		
		System.out.println("Maximum String Value : " + maximum('K','I','R', 'Z', 'N'));
	 }
}
