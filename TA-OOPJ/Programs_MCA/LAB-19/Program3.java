// Food Delivery System: Restaurant categories demonstrating Dynamic Method Dispatch.[B]

class RestaurantCategory {
    public void prepareFood() {
        System.out.println("Preparing food order.");
    }
}

class FastFood extends RestaurantCategory {
    @Override
    public void prepareFood() {
        System.out.println("Fast Food Restaurant: Quick prep - Burgers and fries ready in 10 mins.");
    }
}

class FineDining extends RestaurantCategory {
    @Override
    public void prepareFood() {
        System.out.println("Fine Dining Restaurant: Chef curated gourmet multi-course meal preparation.");
    }
}

class Cafe extends RestaurantCategory {
    @Override
    public void prepareFood() {
        System.out.println("Cafe: Brewing artisanal espresso coffee and baking fresh pastries.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        RestaurantCategory r;

        r = new FastFood();
        r.prepareFood();

        r = new FineDining();
        r.prepareFood();

        r = new Cafe();
        r.prepareFood();
    }
}
