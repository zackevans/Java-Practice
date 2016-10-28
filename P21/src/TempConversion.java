
public class TempConversion 
{
	public static void main(String[] args) 
	{
		double[] fahrenheitTemps = {0,20,40,60,80,100,120,160,180,200};
		
		System.out.println("Fahrenheit        Celsius");
		
		for(int i = 0; i< fahrenheitTemps.length; i++)
		{
			System.out.println(i + "                 " +calculateCelsius(fahrenheitTemps[i]));	
		}
	}
	
	public static double calculateCelsius(double temp)
	{
		return (temp-32)/1.8;
	}
}