package lab5;

import java.util.Scanner;

/**
 * A simple geometry calculator program.
 *
 * This program provides a menu allowing the user to perform various calculations
 * such as finding the area or perimeter of a circle, rectangle, and triangle.
 * The program continues to prompt the user for a choice until they decide to exit.
 *
 * Author: Emilio Laurenti
 */
public class geometrycalc {
    /**
     * The main method runs the program, presenting the menu and calling
     * the appropriate methods based on user input.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Scanner object for reading input from the user
        Scanner input = new Scanner(System.in);
        int option; // Variable to store the menu choice
        double result = 0; // Variable to store the result of calculations
        char exitChoice; // Variable to store user's exit choice ('Y' or 'N')

        // The main loop, will keep running until user chooses to exit
        do {
            displayMenu(); // Display the menu options to the user
            option = input.nextInt(); // Get the user's menu selection

            // Perform calculation based on user's choice
            switch (option) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    result = calcCircleArea(input.nextDouble()); // Calculate circle area
                    System.out.println("Circle Area: " + result);
                }
                case 2 -> {
                    System.out.print("Enter length: ");
                    double length = input.nextDouble(); // Get rectangle length
                    System.out.print("Enter width: ");
                    result = calcRectArea(length, input.nextDouble()); // Calculate rectangle area
                    System.out.println("Rectangle Area: " + result);
                }
                case 3 -> {
                    System.out.print("Enter base: ");
                    double base = input.nextDouble(); // Get triangle base
                    System.out.print("Enter height: ");
                    result = calcTriangleArea(base, input.nextDouble()); // Calculate triangle area
                    System.out.println("Triangle Area: " + result);
                }
                case 4 -> {
                    System.out.print("Enter radius: ");
                    result = calcCircleCircumference(input.nextDouble()); // Calculate circle circumference
                    System.out.println("Circle Circumference: " + result);
                }
                case 5 -> {
                    System.out.print("Enter length: ");
                    double length = input.nextDouble(); // Get rectangle length
                    System.out.print("Enter width: ");
                    result = calcRectPerimeter(length, input.nextDouble()); // Calculate rectangle perimeter
                    System.out.println("Rectangle Perimeter: " + result);
                }
                case 6 -> {
                    System.out.print("Enter side 1: ");
                    double s1 = input.nextDouble(); // Get triangle side 1
                    System.out.print("Enter side 2: ");
                    double s2 = input.nextDouble(); // Get triangle side 2
                    System.out.print("Enter side 3: ");
                    result = calcTrianglePerimeter(s1, s2, input.nextDouble()); // Calculate triangle perimeter
                    System.out.println("Triangle Perimeter: " + result);
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }

            // Ask the user if they want to exit the program
            input.nextLine(); // Consume the newline character
            do {
                System.out.print("Exit program? (Y/N): ");
                exitChoice = input.nextLine().trim().toUpperCase().charAt(0); // Trim and convert to uppercase

                if (exitChoice != 'Y' && exitChoice != 'N') {
                    System.out.println("Invalid input. Please enter 'Y' to exit or 'N' to continue.");
                }
            } while (exitChoice != 'Y' && exitChoice != 'N'); // Ensure valid input (Y or N)
            
        } while (exitChoice != 'Y'); // Repeat until user chooses to exit

        input.close(); // Close the Scanner object
    }

    /**
     * Displays the menu of geometric calculation options.
     */
    private static void displayMenu() {
        System.out.println("""
            Geometry Calculator
            1. Circle Area
            2. Rectangle Area
            3. Triangle Area
            4. Circle Circumference
            5. Rectangle Perimeter
            6. Triangle Perimeter
            Enter your choice:""");
    }

    /**
     * Calculates the area of a circle given its radius.
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    private static double calcCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a rectangle given its length and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area of the rectangle
     */
    private static double calcRectArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the area of a triangle given its base and height.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     * @return the area of the triangle
     */
    private static double calcTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * Calculates the circumference of a circle given its radius.
     *
     * @param radius the radius of the circle
     * @return the circumference of the circle
     */
    private static double calcCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the perimeter of a rectangle given its length and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the perimeter of the rectangle
     */
    private static double calcRectPerimeter(double length, double width) {
        return 2 * (length + width);
    }

    /**
     * Calculates the perimeter of a triangle given the lengths of its sides.
     *
     * @param side1 the length of side 1 of the triangle
     * @param side2 the length of side 2 of the triangle
     * @param side3 the length of side 3 of the triangle
     * @return the perimeter of the triangle
     */
    private static double calcTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}