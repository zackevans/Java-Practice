
public class Factorial 
{	
	public static void main(String[] args) 
	{
		int[] facBases= {0,1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 1; i< facBases.length; i++)
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
