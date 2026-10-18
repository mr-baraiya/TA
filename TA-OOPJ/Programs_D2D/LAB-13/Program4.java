// Write a program to implement the solution to producer consumer problem in Java. [B]

import java.util.LinkedList;

class Buffer {
    private final LinkedList<Integer> list = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }
        list.add(value);
        System.out.println("Produced: " + value + " | Buffer size: " + list.size());
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value + " | Buffer size: " + list.size());
        notifyAll();
    }
}

class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        System.out.println("Starting Producer-Consumer Demo...");
        producerThread.start();
        consumerThread.start();
    }
}
