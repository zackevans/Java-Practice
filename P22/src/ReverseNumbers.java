import java.util.Scanner;

public class ReverseNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		String number = scanner.next();
		
		String finalNumber = "";
		
		for(int i = number.length() -1 ; i >=0 ; i--)
		{
			finalNumber = finalNumber + number.charAt(i);
		}
		
		System.out.println("Final number: " + finalNumber);	
	}
}
