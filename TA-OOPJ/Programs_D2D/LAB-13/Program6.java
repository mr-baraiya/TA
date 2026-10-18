// Write a complete multi-threaded program to meet following requirements:
// a. Read matrix [A] m x n
// b. Create m number of threads
// c. Each thread computes summation of elements of one row, i.e. ith row of the matrix 
// is processed by ith thread. Where 0 <= i < m.
// d. Print the results. [C]

import java.util.Scanner;

class RowSumTask implements Runnable {
    private final int[] row;
    private final int rowIndex;
    private int rowSum;

    public RowSumTask(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
        this.rowSum = 0;
    }

    @Override
    public void run() {
        for (int val : row) {
            rowSum += val;
        }
        System.out.println("Thread for Row " + rowIndex + " completed. Sum: " + rowSum);
    }

    public int getRowSum() {
        return rowSum;
    }
}

public class Program6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Thread[] threads = new Thread[m];
        RowSumTask[] tasks = new RowSumTask[m];

        System.out.println("\nSpawning " + m + " threads to calculate row sums...");
        for (int i = 0; i < m; i++) {
            tasks[i] = new RowSumTask(matrix[i], i);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        // Wait for all threads to finish
        int totalSum = 0;
        for (int i = 0; i < m; i++) {
            threads[i].join();
            totalSum += tasks[i].getRowSum();
        }

        System.out.println("\n--- Final Results ---");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + i + " Sum: " + tasks[i].getRowSum());
        }
        System.out.println("Total Matrix Sum: " + totalSum);
        sc.close();
    }
}
