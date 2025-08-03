import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Declare and input 15 integers
        int[] numbers = new int[15];
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // a) Print the array
        System.out.println("\nThe values stored in the array are:");
        for (int i = 0; i < 15; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // b) Search for a number in the array
        System.out.print("\nEnter a number to search: ");
        int searchValue = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (numbers[i] == searchValue) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // c) Reverse array
        int[] reversed = new int[15];
        for (int i = 0; i < 15; i++) {
            reversed[i] = numbers[14 - i];
        }

        // Print the reversed array
        System.out.println("\nReversed array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        // d) Sum and product
        int sum = 0;
        long product = 1;
        for (int i = 0; i < 15; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }

        System.out.println("\nSum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}
