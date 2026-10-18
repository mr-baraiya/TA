// Two threads: one prints odd numbers and second prints even numbers between 1 and 20.[B]

class OddPrinter implements Runnable {
    @Override
    public void run() {
        System.out.print("Odd Numbers: ");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}

class EvenPrinter implements Runnable {
    @Override
    public void run() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
        System.out.print("Even Numbers: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}

public class Program3 {
    public static void main(String[] args) {
        Thread tOdd = new Thread(new OddPrinter());
        Thread tEven = new Thread(new EvenPrinter());

        tOdd.start();
        tEven.start();
    }
}
