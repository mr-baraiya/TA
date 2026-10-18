// WAP that counts the number of objects created using static. [A] 

class Demo {
    static int count = 0;

    public Demo() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Program2 {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();
        Demo obj4 = new Demo();

        Demo.displayCount();
    }
}