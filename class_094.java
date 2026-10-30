public class class_094 {
    // print all numbers divisible by 5 and 10 between 1 to 1000 and sum also 
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0 && i % 10 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
