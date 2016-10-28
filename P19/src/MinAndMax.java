import java.util.ArrayList;
import java.util.Scanner;

public class MinAndMax 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> inputValues = new ArrayList<Integer>();
		
		System.out.println("Please enter a list of positive numbers. Signal the end of the list with -1.");
		
		int t = 1;
		while(t !=0)
		{
			System.out.print("Please enter a number: ");
			int userInput = scanner.nextInt();
			
			if(userInput != -1)
			{
				inputValues.add(userInput);
			}
			
			else t = 0;
		}
		
		int max = inputValues.get(0);
		int min = inputValues.get(0);
		
		for (int i = 0; i < inputValues.size(); i++)
		{
			if(inputValues.get(i) < min)
			{
				min = inputValues.get(i);
			}
			
			if(inputValues.get(i) > max)
			{
				max = inputValues.get(i);
			}		
		}
		
		System.out.println("The min is: " + min + ". The max is: " + max);
	}
}