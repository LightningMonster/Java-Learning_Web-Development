public class LambdaRunnable {
    public static void main(String[] args) {
        // Runnable using lambda expression
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        // Creating thread and starting it
        Thread thread = new Thread(task);
        thread.start();

        // Main thread code
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
