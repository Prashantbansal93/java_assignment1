
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner cel = new Scanner(System.in);
        Scanner far = new Scanner ( System.in);
         
        System.out.println("enter the value of celcius : ");

        double celcius = cel.nextDouble();

        double farhenite = (celcius * 9/5 ) + 32 ;

        System.err.println("value of farhenite = " + farhenite);



        System.err.println("enter the value of farhenite : ");

        double farenhite = far.nextDouble();

        double celciuss = (farenhite - 32) * 5/9 ; 

        System.out.println("value of celcius is : " + celciuss);

    }
}
