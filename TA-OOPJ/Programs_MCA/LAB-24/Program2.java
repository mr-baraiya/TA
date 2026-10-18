// Two threads: Good Morning every 1000ms & Good Afternoon every 3000ms using Runnable.[A]

class GoodMorningRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Good Morning");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class GoodAfternoonRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Good Afternoon");
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
        }
    }
}

public class Program2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new GoodMorningRunner());
        Thread t2 = new Thread(new GoodAfternoonRunner());

        t1.start();
        t2.start();
    }
}
