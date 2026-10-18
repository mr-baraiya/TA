// Write a program to create two threads, one thread will print odd numbers and second 
// thread will print even numbers between 1 to 20 numbers. [A]

class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("[Odd Thread]  : " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("[Even Thread] : " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        System.out.println("Starting Odd and Even Threads (1 to 20):");
        oddThread.start();
        evenThread.start();
    }
}
