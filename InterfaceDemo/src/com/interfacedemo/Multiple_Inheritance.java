package com.interfacedemo;

interface A1 {
 void config();
}

interface C {
 void run();
}

class B1 implements A1, C {
 public void config() {
     System.out.println("In config");
 }

 public void run() {
     System.out.println("In run");
 }
}

public class Multiple_Inheritance {
 public static void main(String[] args) {
     A1 obj1 = new B1();
     obj1.config();

     C obj2 = new B1();
     obj2.run();

     B1 obj3 = new B1();
     obj3.config();
     obj3.run();
 }
}

