// Write a program in Java to create an interface Car with moveForward, moveBackward, 
// moveLeft, moveRight, applyBreak methods, create a class named Swift and Thar which 
// implement the Car interface. [B]

interface Car {
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}

class Swift implements Car {
    @Override
    public void moveForward() {
        System.out.println("Swift is moving forward smoothly.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Swift is moving backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Swift turns left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Swift turns right.");
    }

    @Override
    public void applyBreak() {
        System.out.println("Swift applies disc brakes.");
    }
}

class Thar implements Car {
    @Override
    public void moveForward() {
        System.out.println("Thar is driving forward off-road.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Thar is reversing.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Thar turns left sharply.");
    }

    @Override
    public void moveRight() {
        System.out.println("Thar turns right sharply.");
    }

    @Override
    public void applyBreak() {
        System.out.println("Thar applies heavy ABS brakes.");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Car swift = new Swift();
        Car thar = new Thar();

        System.out.println("--- Testing Swift ---");
        swift.moveForward();
        swift.moveLeft();
        swift.moveRight();
        swift.moveBackward();
        swift.applyBreak();

        System.out.println("\n--- Testing Thar ---");
        thar.moveForward();
        thar.moveLeft();
        thar.moveRight();
        thar.moveBackward();
        thar.applyBreak();
    }
}
