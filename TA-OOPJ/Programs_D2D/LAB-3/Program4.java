// Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f
// 32*5/9 ) [B]
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit : ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is : " + c);
        sc.close();
    }
}
