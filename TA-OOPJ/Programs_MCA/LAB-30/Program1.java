// Food Ordering System: Abstract FoodItem, Pizza and Burger classes, polymorphism, static order count.[A]

abstract class FoodItem {
    protected String name;
    protected double basePrice;
    private static int totalOrdersPlaced = 0;

    public FoodItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        totalOrdersPlaced++;
    }

    public static int getTotalOrdersPlaced() {
        return totalOrdersPlaced;
    }

    public abstract double calculatePrice();

    public void displayItem() {
        System.out.printf("%-20s | Final Price: Rs %.2f%n", name, calculatePrice());
    }
}

class Pizza extends FoodItem {
    private String size; // Medium, Large
    private boolean extraCheese;

    public Pizza(String size, boolean extraCheese) {
        super(size + " Cheese Pizza", size.equalsIgnoreCase("Large") ? 350.0 : 250.0);
        this.size = size;
        this.extraCheese = extraCheese;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (extraCheese ? 50.0 : 0.0);
    }
}

class Burger extends FoodItem {
    private boolean doublePatty;

    public Burger(String name, double basePrice, boolean doublePatty) {
        super(name, basePrice);
        this.doublePatty = doublePatty;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (doublePatty ? 40.0 : 0.0);
    }
}

public class Program1 {
    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===");
        FoodItem[] order = {
            new Pizza("Medium", true),
            new Burger("Crispy Veg Burger", 120.0, false),
            new Pizza("Large", false),
            new Burger("Paneer Supreme Burger", 180.0, true)
        };

        double grandTotal = 0;
        for (FoodItem item : order) {
            item.displayItem();
            grandTotal += item.calculatePrice();
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Total Amount Payable : Rs %.2f%n", grandTotal);
        System.out.println("Total Orders Placed  : " + FoodItem.getTotalOrdersPlaced());
    }
}
