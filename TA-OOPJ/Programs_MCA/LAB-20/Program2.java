// EventListener interface with performEvent(), MouseListener and KeyListener extending it.[A]

interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();
}

interface KeyListener extends EventListener {
    void keyPressed();
}

class EventDemo implements MouseListener, KeyListener {
    @Override
    public void performEvent() {
        System.out.println("General event processed.");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse Click Event Handled at (x, y).");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key Press Event Handled (Key code registered).");
    }
}

public class Program2 {
    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        demo.performEvent();
        demo.mouseClicked();
        demo.keyPressed();
    }
}
