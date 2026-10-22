// Multi-thread application: thread 1 generates random integer; thread 2 computes square if even; thread 3 computes cube if odd.[B]

import java.util.Random;

class Square extends Thread {
    int n;

    Square(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square: " + (n * n));
    }
}

class Cube extends Thread {
    int n;

    Cube(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube: " + (n * n * n));
    }
}

class RandomNumber extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int n = r.nextInt(100);

            System.out.println("Random Number: " + n);

            if (n % 2 == 0) {
                Square t2 = new Square(n);
                t2.start();
            } else {
                Cube t3 = new Cube(n);
                t3.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        RandomNumber t1 = new RandomNumber();
        t1.start();
    }
}