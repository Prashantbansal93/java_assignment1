import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        int total = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;

        if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || mathPhysicsTotal >= 150) {
            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }
    }
}
