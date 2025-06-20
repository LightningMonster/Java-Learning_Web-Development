package com.core01.Introduction_Setup;

// **Package Names**
//
//- Use **all lowercase**
//- Avoid uppercase letters and underscores
//
//🔸 **Example:**


//Class name: - Start with **uppercase**
//			  - Use **PascalCase** (each word starts with a capital letter)
public class P04_JavaNamingConventions {
	public static void main (String[] args) {
		
		// Variable Names: - Start with **lowercase**
		//	               - Use **camelCase** for multi-word names
		
		int age = 20;
		String studentName = "Yash";
		double averageScore = 85.6;
		
//		Constant Names: - Use **all uppercase letters**
//						- Use **underscores** to separate words
		final int MAX_SIZE = 100;
		final double PI = 3.14159;
		final String DEFAULT_MESSAGE = "Welcome!";
		
		System.out.println("Age: "+age);
		System.out.println("Students Name: "+studentName);
		System.out.println("Average Score: "+averageScore);
		
		System.out.println("MAX_SIZE: "+MAX_SIZE);
		System.out.println("PI: "+PI);
		System.out.println("DEFAULT_MESSAGE: "+DEFAULT_MESSAGE);
		
	}
	
	// Method name: Use camelCase (first word lowercase, next words capitalised)
	public void printMessage() {
		System.out.println("Hello!");
	}
	
	public int calculateSum(int a, int b) {
	    return a + b;
	}
}
