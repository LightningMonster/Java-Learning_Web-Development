class Employee {
    int id;
    String name;

    // Constructor
    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class constructor_demo {
    public static void main(String[] args) {
        Employee e = new Employee(2, "Raavi");
        e.display();
    }
}
