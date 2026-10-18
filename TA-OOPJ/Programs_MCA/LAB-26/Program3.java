// Multi-thread application: thread 1 generates random integer; thread 2 computes square if even; thread 3 computes cube if odd.[B]

import java.util.Random;

class NumberProcessor {
    private int number;
    private boolean generated = false;
    private boolean finished = false;

    public synchronized void putNumber(int n) {
        this.number = n;
        this.generated = true;
        notifyAll();
    }

    public synchronized int getNumberForSquare() {
        while (!generated || (number % 2 != 0)) {
            if (finished) return -1;
            try { wait(); } catch (InterruptedException e) {}
        }
        generated = false;
        return number;
    }

    public synchronized int getNumberForCube() {
        while (!generated || (number % 2 == 0)) {
            if (finished) return -1;
            try { wait(); } catch (InterruptedException e) {}
        }
        generated = false;
        return number;
    }

    public synchronized void finish() {
        finished = true;
        notifyAll();
    }
}

public class Program3 {
    public static void main(String[] args) {
        Random rand = new Random();

        Thread generator = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                int val = rand.nextInt(50) + 1;
                System.out.println("\n[Generator] Generated: " + val);
                if (val % 2 == 0) {
                    System.out.println("[Even Thread] Square of " + val + " = " + (val * val));
                } else {
                    System.out.println("[Odd Thread]  Cube of " + val + " = " + (val * val * val));
                }
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        generator.start();
    }
}
