// Write a java program that implements a multi-thread application that has
// three threads. First thread generates random integer every 1 second and if
// the value is even, second thread computes the square of the number and
// prints. If the value is odd, the third thread will print the value of cube of
// the number. [B]

import java.util.Random;

class NumberGenerator extends Thread {
    static int number;
    static boolean numberGenerated = false;
    static final Object lock = new Object();

    @Override
    public void run() {
        Random rand = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    number = rand.nextInt(100);
                    System.out.println("\n[Thread 1] Generated Random Number: " + number);
                    numberGenerated = true;
                    lock.notifyAll();
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Generator interrupted.");
        }
    }
}

class SquareComputer extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                synchronized (NumberGenerator.lock) {
                    while (!NumberGenerator.numberGenerated) {
                        NumberGenerator.lock.wait();
                    }
                    if (NumberGenerator.number % 2 == 0) {
                        int num = NumberGenerator.number;
                        System.out.println("[Thread 2] Even Number: " + num + " -> Square: " + (num * num));
                    }
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Square computer interrupted.");
        }
    }
}

class CubeComputer extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                synchronized (NumberGenerator.lock) {
                    while (!NumberGenerator.numberGenerated) {
                        NumberGenerator.lock.wait();
                    }
                    if (NumberGenerator.number % 2 != 0) {
                        int num = NumberGenerator.number;
                        System.out.println("[Thread 3] Odd Number: " + num + " -> Cube: " + (num * num * num));
                    }
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Cube computer interrupted.");
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        NumberGenerator gen = new NumberGenerator();
        SquareComputer sq = new SquareComputer();
        CubeComputer cb = new CubeComputer();

        System.out.println("Starting 3-Thread Generator, Square & Cube System...");
        gen.start();
        sq.start();
        cb.start();
    }
}
