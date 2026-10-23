import java.util.Scanner;
class class_02 {
    public static void main(String[] args) {
/*Q.1 */
        //  int x = 10;
        //  int sum = x + 5;
        //  int m = sum * 2 ;
        //  System.out.println(m);


/*Q.2 */                                                       // import java.util.Scanner;
        // Scanner Sc = new Scanner(System.in);

        // String name = Sc.next();
        // System.out.println("name " + name);

        // int roll = Sc.nextInt();
        // System.out.println("roll no. " + roll);
        
        // float marks = Sc.nextFloat();
        // System.out.println("marks " + marks);

        // String address = Sc.nextLine();
        // System.out.println("address " + address);

        // char grade = Sc.next().charAt(0);
        // System.out.println("grade " + grade);

        // System.out.println("name " + name);
        // System.out.println("roll no. " + roll);
        // System.out.println("marks " + marks);
        // System.out.println("address " + address);
        // System.out.println("grade " + grade);


/*Q.3 */
                                                                 // import java.util.Scanner;
        // Scanner Sc = new Scanner(System.in);
        // float price = Sc.nextFloat();
        // System.out.println("price " + price);
        // int quantity = Sc.nextInt();
        // System.out.println("quantity " + quantity);
        // float total = price * quantity;
        // System.out.println("total " + total);


// H.W
        Scanner Sc = new Scanner(System.in);
        float celsius = Sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);




        int maths = Sc.nextInt() ;
        System.out.println("maths " + maths);
        int science = Sc.nextInt() ;
        System.out.println("science " + science);
        int english = Sc.nextInt() ;
        System.out.println("english " + english);
        int hindi = Sc.nextInt() ;
        System.out.println("hindi " + hindi);
        int social = Sc.nextInt() ;
        System.out.println("social" + social);
        
        int t = (social + hindi + english + science + maths)/5;
        System.out.println("Average: " + t);

    }
}