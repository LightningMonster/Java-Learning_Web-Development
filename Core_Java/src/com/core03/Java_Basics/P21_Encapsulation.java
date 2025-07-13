// 8. Encapsulation
package src.com.core03.Java_Basics;

public class P21_Encapsulation {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setSalary(30000);
        System.out.println(e.getSalary());
    }

    static class Employee{
        private int salary;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }
    }
}
