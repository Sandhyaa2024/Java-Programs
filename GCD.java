import java.util.Scanner; // Import the Scanner class for user input

public class GCD {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter a 1st number:");
        int n1 = sc.nextInt(); // Read the first integer input

        // Prompt the user to enter the second number
        System.out.print("Enter a 2nd number:");
        int n2 = sc.nextInt(); // Read the second integer input

        // Call the findGCD method and print the result
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + findGCD(n1, n2));

        sc.close(); // Close the Scanner object to free resources
    }

    // Method to find the Greatest Common Divisor (GCD) of two numbers
    public static int findGCD(int n1, int n2) {
        int max = 0, min = 0; // Variables to store the larger and smaller numbers

        // Determine which number is larger and which is smaller
        if (n1 > n2) {
            max = n1;
            min = n2;
        } else {
            max = n2;
            min = n1;
        }

        int rem = 0; // Variable to store the remainder

        // Loop to calculate the GCD using the Euclidean algorithm
        while (max > min) {
            if (max % min == 0) { // If max is divisible by min
                return min; // Return min as the GCD
            } else {
                rem = max % min; // Calculate the remainder
                max = min; // Update max to the current min
                min = rem; // Update min to the current remainder
            }
        }

        return min; // Return the GCD
    }
}

