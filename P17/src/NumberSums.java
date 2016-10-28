import java.util.Scanner;

public class NumberSums 
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
		
		System.out.println("The sum of the numbers between " + (lowNumber+ 1) + " and " + highNumber + " is: " +  sumBetweenNumbers(num1,num2));
		System.out.println("The sum of the even numbers between " + (lowNumber+ 1) + " and " + highNumber + " is: " + sumBetweenEvenNumbers(lowNumber, highNumber));
	}
	
	public static int sumBetweenNumbers(int lowNum, int highNum)
	{
		int sum = 0;
		
		for(int i = (lowNum+1); i <= highNum; i++) // add 1 to num1 to not include the first number
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static int sumBetweenEvenNumbers(int lowNum, int highNum)
	{
		int sum = 0;
		int startingNumber = lowNum;
		
		if((lowNum %2) != 0) // if num is odd then start on next even
		{
			startingNumber++;
		}
		
		for(int i = startingNumber; i <= lowNum; i+=2)
		{
			sum += i;
		}
		
		return sum;
	}
}