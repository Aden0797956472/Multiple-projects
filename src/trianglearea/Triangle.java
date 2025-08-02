package trianglearea;

import java.util.Scanner;

public class Triangle {
    double base;
    double height;
    double area;

    // 1. Method to get user input
    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = input.nextDouble();
    }

    // 2. Method to calculate area
    public void calculateArea() {
        area = 0.5 * base * height;
    }

    // 3. Method to display result
    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Triangle t = new Triangle();  // create object of Triangle class
        t.getInput();                 // call method to get input
        t.calculateArea();           // call method to compute area
        t.displayArea();             // call method to display result
    }
}

