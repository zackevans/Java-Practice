import java.util.Scanner;

public class DecimalRounder 
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter a number: ");
		Double numberInput = scanner.nextDouble();
		
		int rounded = (int)numberInput.longValue();
		
		
		double us = numberInput - numberInput%1;
		System.out.println(us);
		
		System.out.println("Rounded Number: " + rounded);
	}
}


