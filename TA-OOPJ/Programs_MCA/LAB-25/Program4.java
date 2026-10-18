// Scientific Calculator with static import from java.lang.Math.* (PI, sqrt, pow).[C]

import static java.lang.Math.*;

public class Program4 {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * pow(radius, 2);

        double number = 64.0;
        double squareRoot = sqrt(number);

        double base = 2.0;
        double exp = 8.0;
        double powerResult = pow(base, exp);

        System.out.printf("Area of Circle with radius %.2f: %.2f (using PI & pow)%n", radius, area);
        System.out.printf("Square root of %.2f: %.2f (using sqrt)%n", number, squareRoot);
        System.out.printf("%.2f ^ %.2f: %.2f (using pow)%n", base, exp, powerResult);
    }
}
