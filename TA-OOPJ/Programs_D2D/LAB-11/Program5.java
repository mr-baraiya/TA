// Write a Java program to create an interface Playable with a method play() that takes no 
// arguments and returns void. Create three classes Football, Volleyball, and Basketball 
// that implement the Playable interface and override the play() method to play the 
// respective sports. [C]

interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball into the goal post!");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball: Serving and spiking the ball over the net!");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribbling and shooting hoops!");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Playable f = new Football();
        Playable v = new Volleyball();
        Playable b = new Basketball();

        f.play();
        v.play();
        b.play();
    }
}
