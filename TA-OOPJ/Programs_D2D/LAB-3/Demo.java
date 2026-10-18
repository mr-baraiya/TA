public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        sumofNumbers(5, 10);
    }

    public static void sumofNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}