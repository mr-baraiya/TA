// Insert Product price using LinkedList Interface.[B]

import java.util.LinkedList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Double> productPrices = new LinkedList<>();

        productPrices.add(499.99);
        productPrices.add(1249.50);
        productPrices.add(799.00);
        productPrices.add(2499.00);

        System.out.println("=== Product Prices (LinkedList) ===");
        double total = 0;
        for (Double price : productPrices) {
            System.out.println("Rs " + price);
            total += price;
        }
        System.out.printf("Total Cart Value: Rs %.2f%n", total);
    }
}
