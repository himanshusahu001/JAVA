import java.util.*;
public class class_087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int salary = sc.nextInt();
        int craditScore = sc.nextInt();
        if (age >= 21 && age <=60 && salary >= 30000 && craditScore >= 7000){
            System.out.println("aprove");
        }
        else {
            System.out.println("not aprove");
        }

    }
}
