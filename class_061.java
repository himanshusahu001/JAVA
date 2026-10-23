import java.util.Scanner;

public class class_061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int side = i + j + k;

        String triangle = side == 180 && i > 0 && j > 0 && k > 0 ? "Valid" : "Invalid";
        String triangleType = i == 90 || j == 90 || k == 90 ? "Right Angle" : "Not Right Angle";

        System.out.println(triangle);
        System.out.println(triangleType);
    }
    }