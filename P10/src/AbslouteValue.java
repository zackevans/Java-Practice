import java.util.Scanner;

public class AbslouteValue 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int userInput = scanner.nextInt();

		int absNumber = (userInput < 0) ? -userInput: userInput; // check to see if number is negative if so then invert it
		
		System.out.println("ABS Number: " + absNumber);
	}
}

