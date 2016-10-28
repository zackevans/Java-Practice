import java.util.Scanner;

public class SmallestNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int n1 = scanner.nextInt();
		System.out.print("Enter a second Number: ");
		int n2 = scanner.nextInt();
		System.out.print("Enter a third Number: ");
		int n3 = scanner.nextInt();
		
		System.out.print("Lowest: ");
		if(n1 < n2)
		{
			if(n1 < n3)
			{
				System.out.print(n1);
			}
		}
		
		else if(n2 < n3)
		{
			System.out.print(n2);
		}
		
		else
		{
			System.out.print(n3);
		}
	}
}

