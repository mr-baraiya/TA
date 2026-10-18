// Multithread program using Thread class and using Runnable interface.[A]

class ThreadByClass extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread (via Thread class) running step " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }
}

class ThreadByRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread (via Runnable) running step " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        ThreadByClass t1 = new ThreadByClass();
        Thread t2 = new Thread(new ThreadByRunnable());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
        System.out.println("Both threads completed.");
    }
}
