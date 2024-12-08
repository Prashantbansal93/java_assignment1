
import java.util.Scanner;

public class three {
    public static void main(String[] args) {

      System.out.print("tell the size : ");
      Scanner input = new Scanner(System.in);
      int  size = input.nextInt();

      int arr[] = new int[size];

      

      for(int i=0;i<size;i++){
         arr[i] = input.nextInt();
      }

      int n = Integer.MIN_VALUE;

      

      for(int i=0;i<size;i++){
        if(arr[i]>n){
          n = arr[i];
        }
      }
      System.out.println("maximum number is " + n);


        
    }


}
