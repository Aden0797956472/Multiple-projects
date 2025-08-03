package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeGUI extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    // Constructor
    public PalindromeGUI() {
        // Set the window title
        setTitle("Palindrome Number Checker");

        // Set size of the window
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input field
        inputField = new JTextField(15);

        // Button
        checkButton = new JButton("Check");

        // Result label
        resultLabel = new JLabel("");

        // Add components to the window
        add(new JLabel("Enter a number:"));
        add(inputField);
        add(checkButton);
        add(resultLabel);

        // Add action to the button
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();

                // Check if input is a number
                if (!text.matches("\\d+")) {
                    resultLabel.setText("Please enter a valid number.");
                    return;
                }

                int number = Integer.parseInt(text);

                if (isPalindrome(number)) {
                    resultLabel.setText(number + " is a Palindrome.");
                } else {
                    resultLabel.setText(number + " is NOT a Palindrome.");
                }
            }
        });

        // Make the window visible
        setVisible(true);
    }

    // Method to check if number is a palindrome
    private boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    // Main method
    public static void main(String[] args) {
        new PalindromeGUI(); // Run the GUI
    }
}
