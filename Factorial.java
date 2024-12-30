import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int result=findfactorial(n);
		System.out.println("Factorial of number " +n+ " is: " +result);

	}
	public static int findfactorial(int num) 
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
		
	}

}
