// Find Maximum, Second Maximum, Minimum, and Second Minimum from an Array (at least 4 distinct elements).[A]

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (>= 4): ");
        int n = sc.nextInt();
        if (n < 4) {
            System.out.println("Array must contain at least 4 elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Remove duplicates and sort
        int[] distinct = Arrays.stream(arr).distinct().sorted().toArray();
        if (distinct.length < 4) {
            System.out.println("Array must contain at least 4 distinct elements.");
        } else {
            int min = distinct[0];
            int secondMin = distinct[1];
            int secondMax = distinct[distinct.length - 2];
            int max = distinct[distinct.length - 1];

            System.out.println("Maximum        = " + max);
            System.out.println("Second Maximum = " + secondMax);
            System.out.println("Minimum        = " + min);
            System.out.println("Second Minimum = " + secondMin);
        }
        sc.close();
    }
}
