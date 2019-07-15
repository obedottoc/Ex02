package converterlibrary;
public class MoneyConverter {

	public static double dollarToinr(double dollar)
	{
		double inr;
		inr=dollar*68.56;
		return inr;
	}
	public static double inrTodollar(double inr)
	{
		double dollar;
		dollar=inr/68.56;
		return dollar;
	}
	public static double euroToinr(double euro)
	{
		double inr;
		inr=euro*17.39;
		return inr;
	}
	public static double inrToeuro(double inr)
	{
		double euro;
		euro=inr/17.39;
		return euro;
	}
	public static double yenToinr(double yen)
	{
		double inr;
		inr=yen*0.62;
		return inr;
	}
	public static double inrToyen(double inr)
	{
		double yen;
		yen=inr/0.62;
		return yen;
	}
}



