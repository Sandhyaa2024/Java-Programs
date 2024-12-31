import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
        // Create a Scanner object for input
		Scanner sc=new Scanner(System.in);
        // Read the input number
		int n=sc.nextInt();
		int rem=0,rev=0;
        // Loop to reverse the digits of the number
		while(n>0)
		{
            // Extract the last digit of the number
			rem=n%10;
            // Build the reversed number
			rev=rev*10+rem;
             // Remove the last digit from the number
			n=n/10;
		}
        // Print the reversed number
		System.out.println(rev);
        sc.close();

	}

}
