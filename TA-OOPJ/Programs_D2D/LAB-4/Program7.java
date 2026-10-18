// Write a program in Java to print all 3-digit prime numbers.[C]

public class Program7 {
    public static void main(String[] args) {
        System.out.println("3-digit prime numbers are: ");
        for (int number = 100; number <= 999; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
