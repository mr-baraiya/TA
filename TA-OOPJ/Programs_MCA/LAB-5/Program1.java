// Illustrate the Operator precedence.[A]
// a. 10 + 20 * 30
// b. 100 + 200 / 10 - 3 * 10
// c. 50 * 20 / 10
// d. 10 + 20 / 5 + 3 * 2

public class Program1 {
    public static void main(String[] args) {
        int a = 10 + 20 * 30;
        int b = 100 + 200 / 10 - 3 * 10;
        int c = 50 * 20 / 10;
        int d = 10 + 20 / 5 + 3 * 2;

        System.out.println("Operator Precedence Illustrations:");
        System.out.println("a. 10 + 20 * 30            = " + a + " (* evaluated before +)");
        System.out.println("b. 100 + 200 / 10 - 3 * 10 = " + b + " (/ and * before + and -)");
        System.out.println("c. 50 * 20 / 10            = " + c + " (* and / evaluated left to right)");
        System.out.println("d. 10 + 20 / 5 + 3 * 2     = " + d + " (/ and * before +)");
    }
}
