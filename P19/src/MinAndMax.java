import java.util.ArrayList;
import java.util.Scanner;

public class MinAndMax 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> inputValues = new ArrayList<Integer>();
		
		System.out.println("Please enter a list of positive numbers. Signal the end of the list with -1.");
		
		System.out.print("Please enter a number: ");
		int userInput = scanner.nextInt();
		
		int min = userInput;
		int max = userInput;
		
		int t = 1;
		while(t != 0)
		{
			System.out.print("Please enter a number: ");
			int userIn = scanner.nextInt();
			
			if(userIn != -1)
			{
				if(userIn > max)
				{
					max = userIn;
				}
				
				if(userIn < min)
				{
					min = userIn;
				}
			}
			
			else
			{
				t = 0;
			}
		}
		
		System.out.println("The min is: " + min + ". The max is: " + max);
	}
}