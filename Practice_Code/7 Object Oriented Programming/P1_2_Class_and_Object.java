// 1. Class and Object
// Q2. Create a Car class with fields and a method to display details.
// Instantiate it in main.

public class P1_2_Class_and_Object {
    public static void main(String[] args) {

        Car car1 = new Car(1,"SVJ", "Sports Car");
        Car car2 = new Car(2,"URUS", "SUV");

        car1.getCar();
        car2.getCar();
    }

    static class Car{
        int model;
        String name;
        String type;

        Car(int model,String name, String type){
            this.model = model;
            this.name = name;
            this.type = type;
        }

        void getCar(){
            System.out.println(model+" | "+name+" | "+type);
        }
    }
}
