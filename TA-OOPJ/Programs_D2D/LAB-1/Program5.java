// Print the following Patterns: [B]

public class Program5 {
    public static void main(String[] args) {
        System.out.println("--- Pattern 1 ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 2 ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 3 ---");
        String str = "darshan";
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }

        System.out.println("\n--- Pattern 4 ---");
        String[] symbols = {"*****", "####", "***", "##", "*"};
        for (String sym : symbols) {
            System.out.println(sym);
        }
    }
}
