import java.util.Scanner; // Import the Scanner class for user input

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int n = sc.nextInt(); // Read the integer input

        // Call the armStrong method to calculate the sum of the digits raised to their power count
        int sum = armStrong(n);

        // Compare the input number with the calculated sum
        if (n == sum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        sc.close(); // Close the scanner to free resources
    }

    // Method to count the number of digits in the given number
    public static int count(int n) {
        int c = 0; // Initialize a counter variable
        int rem = 0; // Variable to store the remainder

        // Loop to count the number of digits
        while (n > 0) {
            rem = n % 10; // Extract the last digit (remainder)
            c++;          // Increment the counter
            n = n / 10;   // Remove the last digit from the number
        }

        return c; // Return the count of digits
    }

    // Method to calculate the Armstrong sum of the given number
    public static int armStrong(int n) {
        int sum = 0; // Initialize the sum variable
        int rem = 0; // Variable to store the remainder

        // Get the number of digits in the number
        int d = count(n);

        // Calculate the sum of each digit raised to the power of the digit count
        while (n > 0) {
            rem = n % 10; // Extract the last digit (remainder)
            sum = sum + (int) Math.pow(rem, d); // Add the digit raised to the power of the count to the sum
            n = n / 10;   // Remove the last digit from the number
        }

        return sum; // Return the calculated sum
    }
}
