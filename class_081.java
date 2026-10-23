
import java.util.Scanner;

public class class_081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int marks = sc.nextInt();
        
        if(marks <= 33){
            System.out.println("fail");
        }

        else if (marks <= 40){
            System.out.println("pass");
        }
        else if (marks <= 70){
            System.out.println("B");
        }

         else if (marks <= 80){
            System.out.println("A");
         }
         else if (marks <= 100){
            System.out.println("A+");
         
        }
        }
        }
    