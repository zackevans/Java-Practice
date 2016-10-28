import java.util.Scanner;
import java.util.regex.Pattern;

public class BasicCalc 
{
	public static void main(String[] args) 
	{
		Scanner scanner  = new Scanner(System.in);
		String[] operators  = {"+","-","*","/"};
		
		System.out.print("Enter a basic calculation (ex.5+4): ");
		String userInput = scanner.nextLine();
		
		for(int i = 0; i < operators.length; i++)
		{
			if(userInput.contains(operators[i]))
			{
				String[] inputParts = userInput.split(Pattern.quote(operators[i])); // split the string into two parts based off the operator. (5+4 -> 5 and 4)
				
				// get the integer value of the first number before the operator. 
				//(use .trim() to remove all white space that is not the number) 
				// .trim() enables the user to enter (5+3) and (5 + 3) and still get the same result.
				int n1 = Integer.valueOf(inputParts[0].trim()); 
				int n2 = Integer.parseInt(inputParts[1].trim()); // same as n1 but for integer after the operator.

				System.out.println("Final Val: " + calculateExpression(n1,n2,operators[i])); // print the calculated value of the imputed numbers.
			}
		}
	}
	
	/**
	 * Function: calculateExpression(int num1,int num2,String operator)
	 * 
	 * @param number 1
	 * @param number 2
	 * @param operator (Ex. +,-,*,/)
	 * @return value of imputed numbers after the applied expression.
	 * 
	 * This function takes in two integer values and an operator then returns the integer value of 
	 * the imputed numbers after the applied expression. 
	 */
	
	public static int calculateExpression(int num1,int num2,String operator)
	{
		switch (operator) // switch statement used to identify the operator entered and compute the final value of the imputed values
		{
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				try
				{
					return num1 / num2;
				}
				catch(ArithmeticException e)
				{
					System.err.println("Error: Division by zero");
				}
			default:
				return 0;
		}
	}
}
