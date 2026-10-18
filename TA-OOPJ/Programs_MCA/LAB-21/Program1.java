// Interface Car with moveForward, moveBackward, moveLeft, moveRight, applyBreak. Swift and Thar implement Car.[A]

interface Car {
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}

class Swift implements Car {
    @Override
    public void moveForward() { System.out.println("Swift is cruising forward smoothly."); }
    @Override
    public void moveBackward() { System.out.println("Swift is reversing with rear camera aid."); }
    @Override
    public void moveLeft() { System.out.println("Swift turns left sharply in city traffic."); }
    @Override
    public void moveRight() { System.out.println("Swift turns right."); }
    @Override
    public void applyBreak() { System.out.println("Swift ABS disc brakes applied."); }
}

class Thar implements Car {
    @Override
    public void moveForward() { System.out.println("Thar powering forward across 4x4 terrain."); }
    @Override
    public void moveBackward() { System.out.println("Thar reversing on steep gravel trail."); }
    @Override
    public void moveLeft() { System.out.println("Thar turning left with heavy off-road steering."); }
    @Override
    public void moveRight() { System.out.println("Thar turning right."); }
    @Override
    public void applyBreak() { System.out.println("Thar heavy all-terrain disc brakes engaged."); }
}

public class Program1 {
    public static void main(String[] args) {
        Car c1 = new Swift();
        System.out.println("--- Swift Test Drive ---");
        c1.moveForward();
        c1.moveLeft();
        c1.applyBreak();

        System.out.println("\n--- Thar Test Drive ---");
        Car c2 = new Thar();
        c2.moveForward();
        c2.moveRight();
        c2.applyBreak();
    }
}
