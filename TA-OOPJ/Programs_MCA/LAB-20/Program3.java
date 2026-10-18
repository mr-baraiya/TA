// Transport interface declares deliver(). Abstract Animal. Subclasses Tiger, Camel, Deer, Donkey.[B]

interface Transport {
    void deliver();
}

abstract class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public abstract void sound();
}

class Tiger extends Animal {
    public Tiger() { super("Tiger"); }
    @Override
    public void sound() { System.out.println(name + " roars: Grrrr!"); }
}

class Deer extends Animal {
    public Deer() { super("Deer"); }
    @Override
    public void sound() { System.out.println(name + " makes gentle bleat."); }
}

class Camel extends Animal implements Transport {
    public Camel() { super("Camel"); }
    @Override
    public void sound() { System.out.println(name + " grunts in the desert."); }

    @Override
    public void deliver() {
        System.out.println(name + " is transporting goods across desert terrains.");
    }
}

class Donkey extends Animal implements Transport {
    public Donkey() { super("Donkey"); }
    @Override
    public void sound() { System.out.println(name + " brays: Hee-haw!"); }

    @Override
    public void deliver() {
        System.out.println(name + " is delivering heavy cargo loads up mountain paths.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Animal[] animals = { new Tiger(), new Deer(), new Camel(), new Donkey() };

        for (Animal a : animals) {
            a.sound();
            if (a instanceof Transport) {
                ((Transport) a).deliver();
            }
            System.out.println();
        }
    }
}
