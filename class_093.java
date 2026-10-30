public class class_093 {
    // sum of even numbers from 1 to 1000
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("Sum of even numbers from 1 to 1000: " + sum);

        // count digit in a number
        int number = 123456789;
        int count = 0;
        number = Math.abs(number); // Ensure the number is positive for counting digits
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}