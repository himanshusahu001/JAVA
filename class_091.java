public class class_091 {
    public static void main(String[] args) {
        // for each loop
        // print the elements of an array
        int[] arr = {10, 20, 30, 40};
        int sum = 0;
        for (int i : arr) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }
}
