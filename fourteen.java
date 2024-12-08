import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the interval: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the interval: ");
        int end = sc.nextInt();

        System.out.println("Multiples of 10 in the given interval:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}