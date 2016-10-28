import java.util.Scanner;

public class SumOfCubes 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter a second number: ");
		int num2 = scanner.nextInt();
		
		int lowNumber = Math.min(num1,num2);
		int highNumber = Math.max(num1, num2);

		System.out.println("The sum of the cubes of the even numbers between " + lowNumber + " and " + highNumber + " is: " + sumOfEvenCubes(lowNumber, highNumber));
	}
	
	public static int sumOfEvenCubes(int num1, int num2)
	{
		int sum = 0;
		int startingNumber = num1;
		
		if((num1 %2) != 0) // if num is odd then start on next even
		{
			startingNumber++;
		}
		
		for(int i = startingNumber; i <= num2; i+=2)
		{
			sum += (Math.pow(i, 3));
		}
		
		return sum;
	}
}
