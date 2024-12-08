import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of natural numbers up to " + n + ": " + sum);
    }
}