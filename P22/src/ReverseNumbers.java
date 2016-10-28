import java.util.Scanner;

public class ReverseNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int rev = 0;
		
		while(number !=0)
		{
			rev = rev*10; // push all digits left.
			rev = rev + number%10; // get last int
			number = number/10; // remove last int
		}
		
		System.out.println("Final number: " + rev);	
	}
}
