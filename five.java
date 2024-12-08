
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();

        double km = miles*1.609344;

        System.out.println("kilometer is euqals to : " + km);
        

    }
    
}

