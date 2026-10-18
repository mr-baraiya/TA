// Implement an array with 5 elements. Create four methods for array operations (sortArray(), searchArray(), sumArray(), and avgArray()) and call all four using object.[B]

import java.util.Arrays;
import java.util.Scanner;

class ArrayManager {
    int[] arr;

    public ArrayManager(int[] arr) {
        this.arr = arr;
    }

    public void sortArray() {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }

    public int searchArray(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public int sumArray() {
        int sum = 0;
        for (int v : arr) sum += v;
        return sum;
    }

    public double avgArray() {
        return (double) sumArray() / arr.length;
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integer elements for array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayManager manager = new ArrayManager(arr);
        System.out.println("Sum of array: " + manager.sumArray());
        System.out.println("Average of array: " + manager.avgArray());
        manager.sortArray();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int idx = manager.searchArray(key);
        if (idx != -1) {
            System.out.println("Element " + key + " found at index " + idx);
        } else {
            System.out.println("Element " + key + " not found in array.");
        }
        sc.close();
    }
}
