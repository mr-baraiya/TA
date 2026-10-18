// Multi-threaded matrix row summation: matrix m x n processed by m threads.[C]

import java.util.Scanner;

class RowSumTask extends Thread {
    private int[] row;
    private int rowIndex;
    private int sum = 0;

    public RowSumTask(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    @Override
    public void run() {
        for (int val : row) {
            sum += val;
        }
        System.out.println("Thread for Row " + rowIndex + " completed. Row Sum = " + sum);
    }

    public int getSum() {
        return sum;
    }
}

public class Program4 {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        RowSumTask[] threads = new RowSumTask[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumTask(matrix[i], i);
            threads[i].start();
        }

        int totalSum = 0;
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
                totalSum += threads[i].getSum();
            } catch (InterruptedException e) {}
        }

        System.out.println("Total Matrix Sum = " + totalSum);
    }
}
