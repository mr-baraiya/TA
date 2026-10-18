// Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.[A]

public class Program2 {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45};
        int sum = 0;

        System.out.print("Array elements: ");
        for (int val : arr) {
            System.out.print(val + " ");
            sum += val;
        }

        double avg = sum / (double) arr.length;
        System.out.println("\nAverage of values: " + avg);
    }
}
