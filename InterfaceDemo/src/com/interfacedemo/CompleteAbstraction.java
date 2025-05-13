package com.interfacedemo;

interface A{
	void config();
}

class B implements A{
	public void config() {
		System.out.println("In config");
	}
}

public class CompleteAbstraction {
	public static void main(String[] args) {
		A obj = new B();
		obj.config();
	}
}
