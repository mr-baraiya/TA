// Write a program to implement the solution to producer consumer problem in Java. [B]

class Buffer {
    int[] arr = new int[5];
    int count = 0, in = 0, out = 0;

    synchronized void produce(int value) throws InterruptedException {
        while (count == 5)
            wait();

        arr[in] = value;
        in = (in + 1) % 5;
        count++;

        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (count == 0)
            wait();

        int value = arr[out];
        out = (out + 1) % 5;
        count--;

        System.out.println("Consumed: " + value);
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++)
                b.produce(i);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++)
                b.consume();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}