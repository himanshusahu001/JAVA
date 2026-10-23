import java.util.Scanner;
public class class_060 {
    public static void main ( String[] args ) {
        Scanner Sc = new Scanner(System.in);
        int age = Sc.nextInt();
        String v = 18 <= age? "t ": "f";
        System.out.println(v);
    }
}
