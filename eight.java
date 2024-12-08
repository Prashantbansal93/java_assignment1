
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int first = one.nextInt();
        Scanner two = new Scanner(System.in);
        int second = one.nextInt();

        if( first%second == 0){
            System.out.println("yes it is divisible");
        }
else{
    System.out.println("no it is not divisible");
}

       
    }
    
}
