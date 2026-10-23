import java.util.Scanner;
class class_080 {
    public static void main(String[] args) {
        
        // question 1
        System.out.println(7<<2);
        System.out.println(28>>2);
        System.out.println(7<<2 & 28>>2);

        // question 2
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(((a & 1) == 0) ? "even" : "odd");
        
        sc.close();

       

    }
}