class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("RunnableThread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Runnable r = new RunnableDemo();
        Thread t1 = new Thread(r);
        t1.start(); // starts the thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("MainThread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
