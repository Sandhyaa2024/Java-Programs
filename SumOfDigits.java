import java.util.Scanner;
public class SumOfDigits{

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		// Read the integer input from the user
		int n=sc.nextInt();
		// Call the digit method to calculate the sum of digits and print the result
		System.out.println("Sum of the digits("+n+") are: " +digit(n));
	}

	// Method to calculate the sum of digits of a given number
	public static int digit(int num)
	{
		int t,sum=0;
		// Loop to extract each digit of the number
		while(num != 0)
		{
			// Get the last digit of the number
			t = num % 10;
			// Remove the last digit from the number
			num = num / 10;
			// Add the extracted digit to the sum
			sum = sum + t;
		}
		// Return the total sum of digits
		return sum;
	}
}
