import java.util.Scanner;

public class NumberClassifier 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Please enter an integer number: ");
		int userinput = scanner.nextInt();
		
		System.out.print("The number " + userinput);
		
		if(userinput > 0) 
			System.out.print(" is positive"); 
		else if (userinput < 0) 
			System.out.print(" is negative"); 
		else 
			System.out.print(" is zero"); 
		
		System.out.println(" and its absolute value is: " + abs(userinput)); 
	}
	
	public static int abs(int val)
	{
		return (val < 0) ? -val: val;	
	}
}