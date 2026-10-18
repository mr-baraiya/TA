// Insert Employee name using ArrayList interface.[A]

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>();

        employeeNames.add("Kunal Verma");
        employeeNames.add("Ritu Sharma");
        employeeNames.add("Aditya Joshi");
        employeeNames.add("Pooja Nair");

        System.out.println("=== Employee Names (ArrayList) ===");
        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.println((i + 1) + ". " + employeeNames.get(i));
        }
    }
}
