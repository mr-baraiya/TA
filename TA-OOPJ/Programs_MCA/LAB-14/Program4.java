// Time class with AddSeconds and SubtractSeconds methods.[C]

class AdjustableTime {
    int hours;
    int minutes;
    int seconds;

    public AdjustableTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    private void normalize() {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        if (totalSeconds < 0) totalSeconds = 0;
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    public void addSeconds(int sec) {
        this.seconds += sec;
        normalize();
    }

    public void subtractSeconds(int sec) {
        this.seconds -= sec;
        normalize();
    }

    public void display() {
        System.out.printf("%02d : %02d : %02d%n", hours, minutes, seconds);
    }
}

public class Program4 {
    public static void main(String[] args) {
        AdjustableTime t = new AdjustableTime(2, 30, 45);
        System.out.print("Initial Time: "); t.display();

        t.addSeconds(50);
        System.out.print("After adding 50 seconds: "); t.display();

        t.subtractSeconds(30);
        System.out.print("After subtracting 30 seconds: "); t.display();
    }
}
