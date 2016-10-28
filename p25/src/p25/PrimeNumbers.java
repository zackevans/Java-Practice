package p25;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.print("The prime numbers between 50 and 100 are: ");

		for(int i = 50; i <= 100; i++)
		{		
			if(isPrime(i))
			{
				System.out.print(i + " ");
			}	
		}
	}
	
	public static boolean isPrime(int userInput)
	{
		if(userInput%2 == 0)
		{
			return false;
		}
		
		else
		{
			for(int i = 3; i <= 7; i+=2)
			{
				if(userInput%i == 0)
				{
					return false;
				}
			}
		}
		
		return true;
	}
}
