// Write a java Multithread program [A] 
// i. Using Thread class. 
// ii. Using Runnable Interface.

class ThreadByClass extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Thread Class] Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ThreadByRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Runnable Interface] Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        System.out.println("--- Starting Threads ---");

        // 1. Thread by extending Thread class
        ThreadByClass thread1 = new ThreadByClass();

        // 2. Thread by implementing Runnable interface
        Thread thread2 = new Thread(new ThreadByRunnable());

        thread1.start();
        thread2.start();
    }
}
