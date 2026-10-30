public class class_095 {
    public static void main(String[] args) {
        // reverse a number using for loop
        int num = 1234;
        int[] numbers = {num};
        for (int number : numbers) {
            int reversed = 0;
            while (number != 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }
            System.out.println("Reversed number: " + reversed);
        }
    }
}
