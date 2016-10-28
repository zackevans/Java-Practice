
public class Factorial 
{	
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + " " + factoralCalculator(i));
		}
	}
	
	public static int factoralCalculator(int n)
	{
		int rtnVal = 1;
		
		for(int i = 2; i <= n; i++)
		{
			rtnVal *= i;
		}
		
		return rtnVal;
	}
}
