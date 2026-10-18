// Write a Java program to copy all the elements of an array to another array and print both the array elements. [B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] source = new int[n];
        int[] dest = new int[n];

        System.out.println("Enter " + n + " elements for source array:");
        for (int i = 0; i < n; i++) {
            source[i] = sc.nextInt();
            dest[i] = source[i];
        }

        System.out.print("Source array: ");
        for (int val : source) System.out.print(val + " ");
        System.out.println();

        System.out.print("Destination array (copied): ");
        for (int val : dest) System.out.print(val + " ");
        System.out.println();
        sc.close();
    }
}
