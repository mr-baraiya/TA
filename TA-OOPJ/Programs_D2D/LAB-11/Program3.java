// The Transport interface declares a deliver () method. The abstract class Animal is the 
// super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
// implemented by the Camel and Donkey classes. Write a test program that initialize an 
// array of four Animal objects. If the object implements the Transport interface, the 
// deliver () method is invoked. [B]

interface Transport {
    void deliver();
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {
    public Tiger() {
        super("Tiger");
    }
}

class Camel extends Animal implements Transport {
    public Camel() {
        super("Camel");
    }

    @Override
    public void deliver() {
        System.out.println(name + " is delivering goods across the desert.");
    }
}

class Deer extends Animal {
    public Deer() {
        super("Deer");
    }
}

class Donkey extends Animal implements Transport {
    public Donkey() {
        super("Donkey");
    }

    @Override
    public void deliver() {
        System.out.println(name + " is delivering heavy load on mountain paths.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        System.out.println("Processing animals array:");
        for (Animal a : animals) {
            System.out.println("Animal: " + a.name);
            if (a instanceof Transport) {
                ((Transport) a).deliver();
            } else {
                System.out.println(a.name + " does not implement Transport interface.");
            }
            System.out.println();
        }
    }
}
