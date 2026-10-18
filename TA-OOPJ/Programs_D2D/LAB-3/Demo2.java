class NewClass {
 
    public void sumofNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.sumofNumbers(5, 10);
    }
    
}
