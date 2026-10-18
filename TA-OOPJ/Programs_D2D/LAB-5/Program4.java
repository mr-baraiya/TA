// Write a Java program to copy all the elements of an array to another array and print 
// both the array elements. [B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i]; // Copying elements to the second array
        }
        System.out.println("The elements of the first array are:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nThe elements of the second array are:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
