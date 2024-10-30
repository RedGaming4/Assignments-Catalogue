import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
* This class reads numbers from a file, calculates the
* mean and standard deviation, and writes the results
* to a file.
*/
public class StatsDemo {
   // Add the throws clause
   public static void main(String[] args) throws FileNotFoundException {
       double sum = 0; // The sum of the numbers
       int count = 0; // The number of numbers added
       double mean = 0; // The average of the numbers
       double stdDev = 0; // The standard deviation

       // Create an object of type Scanner
       Scanner keyboard = new Scanner(System.in);
       String filename; // The user input file name

       // Prompt the user and read in the file name
       System.out.println("This program calculates statistics on a file containing a series of numbers");
       System.out.print("Enter the file name: ");
       filename = keyboard.nextLine();

       // Create a Scanner object passing it a File object
       Scanner fileScanner = new Scanner(new File(filename));

       // Loop until you are at the end of the file
       while (fileScanner.hasNextDouble()) {
           double value = fileScanner.nextDouble(); // Read a double value from the file
           sum += value; // Add the value to sum
           count++; // Increment the counter
       }
       fileScanner.close(); // Close the input file

       // Store the calculated mean in the mean variable
       if (count > 0) {
           mean = sum / count;
       }

       // Reinitialize sum to 0 and count to 0 for standard deviation calculation
       sum = 0;
       count = 0;

       // Create a new Scanner object for the same file
       fileScanner = new Scanner(new File(filename));

       // Loop until you are at the end of the file for standard deviation
       while (fileScanner.hasNextDouble()) {
           double value = fileScanner.nextDouble(); // Read a double value from the file
           double difference = value - mean; // subtract the mean from the value
           sum += difference * difference; // Add the square of the difference to the sum
           count++; // Increment the counter
       }
       fileScanner.close(); // Close the input file

       // Store the calculated standard deviation in stdDev
       if (count > 0) {
           stdDev = Math.sqrt(sum / count);
       }

       // Create a PrintWriter object using "Results.txt"
       PrintWriter outputFile = new PrintWriter("Results.txt");

       // Print the results to the output file
       outputFile.printf("mean = %.3f%n", mean);
       outputFile.printf("standard deviation = %.3f%n", stdDev);

       outputFile.close(); // Close the output file
   }
}