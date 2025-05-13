package com.interfacedemo;

class Desktop1 {
    public void run() {
        System.out.println("run : debug : deploy : faster ");
    }
}

class Laptop1 {
    public void run() {
        System.out.println("run : debug : deploy");
    }
}

class Developer1 {
    
    public void java(Laptop com) {
        com.run();
    }
}

public class Tight_Coupling {
    public static void main(String[] args) {
        Developer d = new Developer();
        Laptop lap = new Laptop();
        d.java(lap);  
    }
}
