public class deBug {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array to sum
        int sum = 0;

        // Intentional error: Accessing element outside array bounds
        for (int i = 0; (i < numbers.length); i++) { // Loop iterates one extra time
            sum += numbers[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
