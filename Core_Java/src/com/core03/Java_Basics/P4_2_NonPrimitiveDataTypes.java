package com.core03.Java_Basics;

public class P4_2_NonPrimitiveDataTypes {
	interface Animal{
		void sound();
	}
	
	static class Dog implements Animal{
		public void sound() {
			System.out.println("Woof");
		}
	}
	
	static class car{
		 String model;
		 int year;
		 
		 car(String model, int year){
			 this.model = model;
			 this.year = year;
		 }
		 
		 void display() {
			 System.out.println("\n# Class:");
			 System.out.println(model + " " + year);
		 }
		 
		 
	 }
	
	 public static void main(String[] args) {
		 
		 //Strings
		 String n = "Geek1";
	     String m = "Hello, World!";
	
	     System.out.println("# Strings:");
	     System.out.println("Name: " + n); 
	     System.out.println("Message: " + m);   
	     
	     //Class
	     //Object
	     car myCar = new car("Toyota", 2020);
	     myCar.display();
	     System.out.println(myCar.model + " " + myCar.year);
	     
	     int[] num = {1,2,3,4,5,6,7,8,9,0};
	     String[] arr = {"One", "Two", "Three"};
	     
	     System.out.println("\n# Array:");
	     System.out.println("\nNumbers:");
	     for(int i=0; i<10; i++) {
	    	 System.out.print(num[i]+" ");
	     }
	     System.out.println("\nStrings:");
	     for(int i=0; i<3; i++) {
	    	 System.out.print(arr[i]+" ");
	     }
	     
	     System.out.println("\n\n# Interface:");
	     Dog myDog = new Dog();
	     myDog.sound();
	 }
 
}
