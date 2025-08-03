package methods; // only if you created a package named 'methods'

public class Demo {

    // Instance variable
    String name;

    // ✅ Constructor
    public Demo() {
        System.out.println("Constructor called. Object created.");
        name = "Java Example";
    }

    // ✅ Static Method 1
    public static void greet() {
        System.out.println("Welcome to the Java Program!");
    }

    // ✅ Static Method 2
    public static void displayAuthor() {
        System.out.println("This program was written by Adan.");
    }

    // ✅ Non-static Method
    public void showName() {
        System.out.println("The name is: " + name);
    }

    // ✅ Main Method (starts the program)
    public static void main(String[] args) {
        // Calling static methods directly
        greet();
        displayAuthor();

        // Creating an object to access constructor and non-static method
        Demo obj = new Demo(); // constructor is called here
        obj.showName();        // non-static method
    }
}

