import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class twentynine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(numbers[i], frequencyMap.getOrDefault(numbers[i], 0) + 1);
        }
        System.out.println("Duplicate elements and their frequency:");
        boolean foundDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
                foundDuplicate = true;
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
