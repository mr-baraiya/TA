// Print multiplication table of two numbers using Thread Synchronization.[A]

class TablePrinter {
    public synchronized void printTable(int n) {
        System.out.println("--- Multiplication Table of " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    private TablePrinter printer;
    private int number;

    public TableThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    @Override
    public void run() {
        printer.printTable(number);
    }
}

public class Program2 {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();
        TableThread t1 = new TableThread(printer, 5);
        TableThread t2 = new TableThread(printer, 7);

        t1.start();
        t2.start();
    }
}
