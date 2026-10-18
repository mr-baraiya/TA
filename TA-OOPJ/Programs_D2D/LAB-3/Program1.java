// Illustrate the Operator  precedence.[A] 
// a. 10 + 20 * 30 
// b. 100 / 10 * 100 
// c. 5 * 4 / 4 % 3 
// d. 100 + 200 / 10 – 3 * 10

public class Program1 {
    public static void main(String[] args) {
        
        int a = 10 + 20 * 30;
        int b = 100 / 10 * 100;
        int c = 5 * 4 / 4 % 3;
        int d = 100 + 200 / 10 - 3 * 10;

        System.out.println("Result of a: " + a);
        System.out.println("Result of b: " + b);
        System.out.println("Result of c: " + c);
        System.out.println("Result of d: " + d);
    }
}
