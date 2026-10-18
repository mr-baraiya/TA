// Write an interactive program to print a string entered in a pyramid form. For instance, 
// the string "stream" has to be displayed as follows:[B] 
 
// s 
// st 
// str 
// stre 
// strea 
// stream

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
        sc.close();
    }
}
