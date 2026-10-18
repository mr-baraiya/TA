// Dominant Number in an Array: frequency strictly greater than count of unique elements present in that array.[C]

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        int uniqueCount = freqMap.size();
        System.out.println("Unique elements count = " + uniqueCount);

        List<Integer> dominantNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > uniqueCount) {
                dominantNumbers.add(entry.getKey());
            }
        }

        if (!dominantNumbers.isEmpty()) {
            System.out.print("Dominant Numbers: ");
            for (int i = 0; i < dominantNumbers.size(); i++) {
                System.out.print(dominantNumbers.get(i) + (i < dominantNumbers.size() - 1 ? ", " : ""));
            }
            System.out.println();
        } else {
            System.out.println("No dominant numbers found in the array.");
        }
        sc.close();
    }
}
