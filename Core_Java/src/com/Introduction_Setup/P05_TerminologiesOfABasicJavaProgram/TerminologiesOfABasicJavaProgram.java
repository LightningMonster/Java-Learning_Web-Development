package com.Introduction_Setup.P05_TerminologiesOfABasicJavaProgram;

public class TerminologiesOfABasicJavaProgram {	
	
//	### **Main Method**
//
//	- It's the **entry point** of any Java application.
	public static void main(String[] args) {
//		### **Object**
//			- An **object** is an **instance of a class**.
//			- It represents a real-world entity and has:
//			    - **State (data/fields)** — e.g., name, age
//			    - **Behaviour (methods)** — e.g., bark(), eat()
		Animal dog = new Animal();
		
		//Allowed Characters
//		int totalMarks = 95;     // ✅ valid
//		int $salary = 50000;     // ✅ valid
//		int student_age = 20;    // ✅ valid
//		int name@ = 10;          // ❌ Invalid (contains '@')
		
//		Should Not Start with a Digit
//		### **Case-Sensitive**
//
//		- Java identifiers are **case-sensitive**.
//		    
//		    S`core`, `Score`, and `SCORE` are all different identifiers.
		
//		No Limit on Length
//		### **Cannot Use Reserved Keywords**
//
//		- **Java reserved words** (like `int`, `while`, `class`, `static`, etc.) **cannot be used** as identifiers.
		dog.name = "Bruno";
        dog.makeSound();
	}
	
//	### **Class Declaration**
//
//	- Every Java program begins with a **class declaration** using the `class` keyword.
//	- A **class** is a **blueprint or template** for creating objects with common properties and behaviours.

	public static class Animal {
	    String name;
	    void makeSound() {
	        System.out.println("Animal sound "+name);// semicolon ends the statement
	    }
	}
}
