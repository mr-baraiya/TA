// Interface Playable with method play(). Classes Football, Volleyball, and Basketball implement Playable.[B]

interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football: 11 players on each team kicking the ball into the goal.");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball: 6 players per side hitting the ball over the net.");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball: 5 players dribbling and shooting the ball into the hoop.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Playable[] sports = { new Football(), new Volleyball(), new Basketball() };

        for (Playable s : sports) {
            s.play();
        }
    }
}
