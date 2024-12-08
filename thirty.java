import java.util.Scanner;
public class thirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}

