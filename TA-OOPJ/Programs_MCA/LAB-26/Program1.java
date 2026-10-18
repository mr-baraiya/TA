// Producer Consumer problem in Java using wait() and notify().[A]

class Buffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int val) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = val;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer extends Thread {
    private Buffer buffer;
    public Producer(Buffer b) { this.buffer = b; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i * 10);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;
    public Consumer(Buffer b) { this.buffer = b; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
