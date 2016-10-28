import java.util.Scanner;

public class MeasurementConverstion 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter a leghth (ft): ");
		int ft = scanner.nextInt();
		System.out.print("Enter a leghth (in): ");
		int in = scanner.nextInt();
		
		double totalInches = (ft*12) + in; 
		double total = (totalInches*2.54); 
	
		System.out.println(ft + " feet and " + in + " inches = " + total + "cm"); 
	}
}



