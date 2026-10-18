// Write a program in Java to print all 3-digit prime numbers.[C]

public class Program4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("All 3-digit prime numbers (100 to 999):");
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            if (isPrime(i)) {
                System.out.printf("%4d", i);
                count++;
                if (count % 15 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal 3-digit prime numbers: " + count);
    }
}
