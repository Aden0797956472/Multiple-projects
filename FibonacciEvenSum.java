package sequences;

public class FibonacciEvenSum {

    // ✅ Method to calculate the sum of even Fibonacci numbers up to 4 million
    public static int sumEvenFibonacci() {
        int sum = 0;
        int a = 1; // First Fibonacci number
        int b = 2; // Second Fibonacci number

        while (b <= 4000000) {
            if (b % 2 == 0) {
                sum += b; // Add to sum if even
            }

            // Generate next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }

    // ✅ Main method
    public static void main(String[] args) {
        int result = sumEvenFibonacci();
        System.out.println("Sum of even Fibonacci numbers up to 4 million: " + result);
    }
}
