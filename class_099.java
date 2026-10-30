public class class_099 {
    public static void main(String[] args) {
        // factorial of a number using for loop
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

        // palindrome of a number using for loop
        int num = 121;
        int original = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        // prime number or not
        int primeCandidate = 29;
        boolean isPrime = true;
        if (primeCandidate <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primeCandidate); i++) {
                if (primeCandidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(primeCandidate + " is a prime number.");
        } else {
            System.out.println(primeCandidate + " is not a prime number.");
        }

        
        // count how many even odd digits are present in a number
        int countEven = 0;
        int countOdd = 0;
        int number = 12345;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            number /= 10;
        }
        System.out.println("Even digits: " + countEven);
        System.out.println("Odd digits: " + countOdd);  

    }
}
