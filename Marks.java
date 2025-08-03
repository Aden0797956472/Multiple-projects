package unit_results;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        // Call the method to get marks and calculate average
        calculateAverage();
    }

    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        // Input marks from lecturer
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        // Calculate average
        double average = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Output the results
        System.out.println("\nmarks for java programming is: " + javaMarks);
        System.out.println("marks for networking is: " + networkingMarks);
        System.out.println("marks for maths is: " + mathsMarks);
        System.out.println("the average is: " + average);
    }
}
