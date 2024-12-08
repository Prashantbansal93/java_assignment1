import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        
        if(num%4==0){
            System.out.println("yes it is a leap year");
        }
        else{
            System.err.println("it is not a leap year");
        }
    }
}
