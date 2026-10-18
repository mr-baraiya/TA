// Create interface EventListener with performEvent() method. Create MouseListener 
// interface which inherits EventListener along with mouseClicked(), mousePressed(), 
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
// WAP to create EventDemo class which implements MouseListener and KeyListener and 
// demonstrate all the methods of the interfaces. [A]

interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {
    @Override
    public void performEvent() {
        System.out.println("Event performed.");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse Clicked.");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse Pressed.");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse Released.");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse Moved.");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse Dragged.");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key Pressed.");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key Released.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        System.out.println("--- EventListener & MouseListener ---");
        demo.performEvent();
        demo.mouseClicked();
        demo.mousePressed();
        demo.mouseReleased();
        demo.mouseMoved();
        demo.mouseDragged();

        System.out.println("\n--- KeyListener ---");
        demo.keyPressed();
        demo.keyReleased();
    }
}