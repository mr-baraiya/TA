// Write an application that executes two threads. One thread displays "Good Morning" 
// every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
// milliseconds. Create the threads by implementing the Runnable interface. [A]

class GoodMorningRunner implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Good Morning thread interrupted.");
        }
    }
}

class GoodAfternoonRunner implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Good Afternoon thread interrupted.");
        }
    }
}

public class Program2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new GoodMorningRunner());
        Thread t2 = new Thread(new GoodAfternoonRunner());

        System.out.println("Starting Good Morning & Good Afternoon Threads...");
        t1.start();
        t2.start();
    }
}
