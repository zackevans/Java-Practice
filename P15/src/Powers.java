import java.util.Scanner;

public class Powers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter the base: ");
		int base = scanner.nextInt();
		System.out.print("Enter the power: ");
		int power = scanner.nextInt();
		
		System.out.println("Answer: " + power(base,power));
	}
	
	/**
	 * Function: power(double base, int exponent) 
	 * @param base
	 * @param exponent
	 * @return The correct exponential value
	 * 
	 * This function takes in a base and a exponent value and uses multiplication to calculate the value.
	 */
	
	public static double power(double base, int exponent) 
	{
	    double ans = 1;  // create object to return the final answer.
	    
	    if (exponent != 0) 
	    {
	        int absExponent = exponent > 0 ? exponent : (-1) * exponent; // if exponent if negative then change the sign.
	        
	        for (int i = 1; i <= absExponent; i++)   
	        {
	            ans *= base;
	        }

	        if (exponent < 0)
	        {
	            ans = 1.0 / ans;
	        }
	    } 
	    
	    else // exponent is 0
	    {
	        ans = 1;
	    }

	    return ans;
	}
}