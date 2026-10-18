// Create class Cube with attributes (height, width, depth). Getter/setter for 2 cubes and method volume().[B]

class Cube {
    private double height;
    private double width;
    private double depth;

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getDepth() { return depth; }
    public void setDepth(double depth) { this.depth = depth; }

    public double volume() {
        return height * width * depth;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Cube c1 = new Cube();
        c1.setHeight(4.0);
        c1.setWidth(5.0);
        c1.setDepth(6.0);

        Cube c2 = new Cube();
        c2.setHeight(2.5);
        c2.setWidth(3.0);
        c2.setDepth(4.0);

        System.out.println("Cube 1 Volume: " + c1.volume());
        System.out.println("Cube 2 Volume: " + c2.volume());
    }
}
