package com.interfacedemo;

interface Computer {
    public void run();
}

class Desktop implements Computer {
    public void run() {
        System.out.println("run : debug : deploy : faster ");
    }
}

class Laptop implements Computer {
    public void run() {
        System.out.println("run : debug : deploy");
    }
}

class Developer {
    public void java(Computer com) {
        com.run();
    }
}

public class Loose_Coupling {
    public static void main(String[] args) {
        Developer d = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        d.java(desk); 
    }
}
