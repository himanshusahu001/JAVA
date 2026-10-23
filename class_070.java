// Bitwise 
public class class_070 {
    public static void main (String[] args){
        int a = 2;
        int b = 3;
        int c = 16;
        char d = 'c';
        System.out.println((a^b) + " xor");
        System.out.println((a%b) + " modulus and");
        System.out.println((a|b) + " or");

        System.out.println((~c) + " not");
        System.out.println((~'A') + " not");
        System.out.println((~d) + " not");


        int x = 10;
        System.out.println((x<<2) + " left shift");   // 10*2^2 = 10*4 = 40
        System.out.println((x>>2) + " right shift");  // 10/2^2 = 10/4 = 2


    }
} 
 