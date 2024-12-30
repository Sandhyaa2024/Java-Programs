// Imports the Scanner class to read user input.
import java.util.Scanner;
public class Factorial {
// The main method, which is the entry point of the program.
	public static void main(String[] args) {
		// Creates a Scanner object  sc to read input from the user.
		Scanner sc=new Scanner(System.in);
		// Displays a prompt asking the user to enter a number.
        System.out.print("Enter a number: ");
		// Reads the integer input entered by the user and stores it in variable n.
		int n=sc.nextInt();
		// Calls the findfactorial method to compute the factorial of n and stores the result
		int result=findfactorial(n);
		// Prints the result, showing the factorial of the entered number.
		System.out.println("Factorial of number " +n+ " is: " +result);
	}
	// Defines a method to calculate the factorial of a given number.
	public static int findfactorial(int num) 
	{
		// Initializes a variable fact to store the result of the factorial calculation.
		int fact=1;
		// Loops as long as num is greater than 0.
		while(num>0)
		{
			// Multiplies fact by num in each iteration.
			fact=fact*num;
			// Decreases the value of num by 1 after each iteration.
			num--;
		}
		// Returns the calculated factorial to the main method.
		return fact;
		
	}

}
