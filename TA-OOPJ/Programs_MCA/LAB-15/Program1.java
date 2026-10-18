// Class Area with static final variable PI=3.14159 to calculate area of circle.[A]

class Area {
    public static final double PI = 3.14159;

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

public class Program1 {
    public static void main(String[] args) {
        double r = 7.0;
        System.out.println("Radius: " + r);
        System.out.println("Calculated Area: " + Area.circleArea(r));
    }
}
