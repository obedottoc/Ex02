package converterlibrary;

public class CurrencyConverter 
{
	public static double dollartoINR(double dollar)
	{
		double INR;
		INR = dollar*68.54;
		return INR;
	}
	
	public static double INRtodollar(double INR)
	{
		double dollar;
		dollar = INR/68.54;
		return dollar;
	}
	public static double eurotoINR(double euro)
	{
		double INR;
		INR = euro*77.16;
		return INR;
	}
	public static double INRtoeuro(double INR)
	{
		double euro;
		euro = INR/77.16;
		return INR;
	}
	public static double yentoINR(double yen)
	{
		double INR;
		INR = yen*0.64;
		return INR;
	}
	public static double INRtoyen(double INR)
	{
		double yen;
		yen = INR/0.64;
		return yen;
	}
}
