import java.util.*;

class Welcome extends Thread {
    public void run() {
        System.out.println("\n   Welcome to Java program! \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Options extends Thread {
    public void run() {
        String[] options = {
            "   Which topic do you like?",
            "   1. Fundamentals of Java",
            "   2. OOPs of Java",
            "   3. JDBC",
            "   4. Spring",
            "   5. Spring Boot",
            "   6. Hibernate\n",
            "   Enter your choice (1-6): "
        };

        for (String line : options) {
            System.out.println(line);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class JavaLearning {

    public static void main(String[] args) {
        Thread welcome = new Welcome();
        welcome.start();

        try {
            welcome.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Thread options = new Options();
        options.start();

        try {
            options.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        Runnable topicTask;

        switch (choice) {
            case 1:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   Fundamentals of Java:",
                            "   - Variables",
                            "   - Data Types",
                            "   - Control Statements",
                            "   - Loops",
                            "   - Arrays"
                        });
                    }
                };
                break;
            case 2:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   OOPs of Java:",
                            "   - Classes and Objects",
                            "   - Inheritance",
                            "   - Polymorphism",
                            "   - Encapsulation",
                            "   - Abstraction"
                        });
                    }
                };
                break;
            case 3:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   JDBC:",
                            "   - Connecting to databases",
                            "   - CRUD operations",
                            "   - PreparedStatement",
                            "   - Transactions"
                        });
                    }
                };
                break;
            case 4:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   Spring:",
                            "   - Dependency Injection",
                            "   - Bean Lifecycle",
                            "   - AOP",
                            "   - Spring MVC"
                        });
                    }
                };
                break;
            case 5:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   Spring Boot:",
                            "   - Auto Configuration",
                            "   - Spring Boot Starters",
                            "   - Embedded Server",
                            "   - REST API"
                        });
                    }
                };
                break;
            case 6:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   Hibernate:",
                            "   - ORM",
                            "   - Mapping Entities",
                            "   - HQL",
                            "   - Caching",
                            "   - Transactions"
                        });
                    }
                };
                break;
            default:
                topicTask = new Runnable() {
                    public void run() {
                        printLinesSlowly(new String[]{
                            "   Invalid choice. Please run the program again."
                        });
                    }
                };
        }

        Thread topicThread = new Thread(topicTask);
        topicThread.start();

        try {
            topicThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    static void printLinesSlowly(String[] lines) {
        for (String line : lines) {
            System.out.println(line);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
