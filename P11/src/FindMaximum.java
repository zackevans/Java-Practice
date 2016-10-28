import java.util.Scanner;

public class FindMaximum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		if(num1 > num2)
		{
			System.out.println("The larger number is: " + num1);
		}
		
		else if(num1 == num2)
		{
			System.out.println("Both numbers are equal");
		}
		
		else 
		{
			System.out.println("The larger number is: " + num2);
		}
	}
}

