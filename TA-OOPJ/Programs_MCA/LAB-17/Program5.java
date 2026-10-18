// MyPoint (2D) and ThreeDPoint (3D) classes with distance methods.[C]

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}

class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        super(0, 0);
        this.z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() { return z; }

    public double distance(ThreeDPoint p) {
        return Math.sqrt(Math.pow(getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2) + Math.pow(this.z - p.z, 2));
    }
}

public class Program5 {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        double dist = p1.distance(p2);
        System.out.printf("Distance between (0, 0, 0) and (10, 30, 25.5): %.2f%n", dist);
    }
}
