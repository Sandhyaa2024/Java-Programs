import java.util.Scanner;
public class Fibonacci_series{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Reads the integer input entered by the user and stores it in variable n.
		int n=sc.nextInt();
		// Loops from 0 to n-1 to print the Fibonacci series up to the nth term.
		for(int i=0;i<n;i++) {
			// Calls the fibonacii method to calculate and print the Fibonacci number at index i.
			System.out.print(fibonacii(i)+" ");
		}
	}
	
	public static int fibonacii(int n)
	{
		//  If n is 0, return 0.
		if(n==0) {
			return 0;
		}
		//If n is 1, return 1.
		else if(n==1)
		{
			return 1;
		}
		else
		{
			// Recursive case: Return the sum of the two previous Fibonacci numbers.
			return fibonacii(n-1) + fibonacii(n-2);
		}
	}
}
