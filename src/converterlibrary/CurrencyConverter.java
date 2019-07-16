package converterlibrary;

public class CurrencyConverter {
	
	public static double InrToDollar(double inr)
	{
		double dollar;
			dollar=inr/61.06;
		return dollar;
	}
	public static double DollarToInr(double dollar)
	{
		double inr;
			inr=dollar*61.06;
		return inr;
	}
	public static double InrToEuro(double inr)
	{
		double euro;
			euro=inr/77.21;
		return euro;
	}
	public static double EuroToInr(double euro)
	{
		double inr;
			inr=euro*77.21;
		return inr;
	}
	public static double InrToYen(double inr)
	{
		double yen;
			yen=inr/0.63;
		return yen;
	}
	public static double YenToInr(double yen)
	{
		double inr;
			inr=yen*0.63;
		return inr;
	}
}