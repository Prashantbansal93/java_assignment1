import java.util.Scanner;

public class seven {public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter student's percentage: ");
 double per=sc.nextDouble();
 if(per>=90 && per<=100){
 System.out.println("Grade A");
 }
 else if(per>=80){
 System.out.println("Grade B");
 }
 else if(per>=70){

 System.out.println("Grade C");
 }
 else if(per>=60){
 System.out.println("Grade D");
 }
 else if(per>=40){
 System.out.println("Grade E");
 }
 else if(per<40 && per>=0){
 System.out.println("Grade F");
 }
 else{
 System.out.println("Invalid input");
 }
 }
}
    

