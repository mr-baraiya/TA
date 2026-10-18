// Write a java program that counts the number of objects created using static.[A]

class Item {
    private static int count = 0;
    private int id;

    public Item() {
        count++;
        this.id = count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Initial object count: " + Item.getCount());
        Item i1 = new Item();
        Item i2 = new Item();
        Item i3 = new Item();

        System.out.println("Total objects created: " + Item.getCount());
    }
}
