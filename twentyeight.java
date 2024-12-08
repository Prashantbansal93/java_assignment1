import java.util.Scanner;
public class twentyeight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of odd numbers in the array: " + sum);
    }
}
