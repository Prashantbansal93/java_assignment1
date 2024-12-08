
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int first = one.nextInt();
        Scanner two = new Scanner(System.in);
        int second = one.nextInt();

        int m = first;

        first = second;
        second = m;

        System.out.println("a is equals to : " + first + " , b is equals to : " + second);
    }
    
}
