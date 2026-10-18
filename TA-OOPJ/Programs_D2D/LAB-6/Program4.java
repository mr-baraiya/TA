// implement an array with 5 elements in class A. Create four methods for array  operation(sortArray(), searchArray(), SumArray(), and avgArray()) and call all the four  methods using object.[B]  

import java.util.Scanner;
import java.util.Arrays;

class A {

    int[] arr = new int[5];

    public void setArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void sortArray() {

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void searchArray(int target) {

        boolean found = false;

        for (int i = 0; i < 5; i++) {

            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }

    public int sumArray() {

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public double avgArray() {
        return (double) sumArray() / 5;
    }
}

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        A obj = new A();

        obj.setArray();

        obj.sortArray();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        obj.searchArray(target);

        System.out.println("Sum: " + obj.sumArray());

        System.out.println("Average: " + obj.avgArray());

        sc.close();
    }
}
