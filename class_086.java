import java.util.Scanner;
public class class_086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        
        if (username.equals("himanshu")) {
            System.out.print("your username is correct \nEnter your password: ");
            int password = sc.nextInt();
            if (password == 1234) {
                System.out.println("Welcome Himanshu");
            }
            else {
                System.out.println("Incorrect Password");
            }
            
        }
        else {
            System.out.println("Invalid Username");
        }

    }
}
