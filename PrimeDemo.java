package numbers; // This line declares the package

public class PrimeDemo {

    // ✅ Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // ✅ Main method to display prime numbers from 1 to 500
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 500:");

        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

