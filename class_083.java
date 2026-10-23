import java.util.Scanner;
public class class_083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizenship = sc.nextBoolean();
        if (age >=18)
        {
            // System.out.print("you are eligible to vote");

            if (isCitizenship == true)
            {
                System.out.println("you are eligible to vote");
            }
            else
            {
                System.out.println("you are not eligible to vote");
            }
        }

    }
}
