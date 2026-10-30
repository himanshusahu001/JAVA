import java.util.Scanner;
public class class_102 {
    static void add(int a , int b){
        
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int a = sc.nextInt();
        System.out.println("Enter no.");
         int b = sc.nextInt();
         add(a,b);
         

    }
}
