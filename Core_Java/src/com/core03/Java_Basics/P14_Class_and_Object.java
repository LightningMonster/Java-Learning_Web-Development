// 1. Class and Object
package src.com.core03.Java_Basics;

public class P14_Class_and_Object {
    public static void main(String[] args) {

        Car car = new Car();
        car.drive();
    }

    static class Car{
        String model;
        void drive(){
            System.out.println("Car is moving....");
        }
    }

}
