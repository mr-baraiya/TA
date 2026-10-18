// Write a program to find a total odd and total even digit of a given number.[B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int evenCount = 0, oddCount = 0;

        if (temp == 0) {
            evenCount = 1;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                temp /= 10;
            }
        }

        System.out.println("Total even digits: " + evenCount);
        System.out.println("Total odd digits: " + oddCount);
        sc.close();
    }
}
