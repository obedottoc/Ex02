package Convertorlibrary;

public class CurrencyConvertor {
	public static double dollarToINR(double dollar)
	{
		double INR;
		INR=68.52*dollar;
		return INR;
	}
	public static double INRtodollar(double INR)
	{
		double dollar;
		dollar=(INR/68.52)+(INR%68.52);
		return dollar;
	}
	public static double euroToINR(double euro)
	{
		double INR;
		INR=77.16*euro;
		return INR;
	}
	public static double INRToeuro(double INR)
	{ 
		double euro;
		euro=(INR/77.16);
		return euro;
	}
	public static double yenTOINR(double yen)
	{
		double INR;
		INR=0.63*yen;
		return INR;
	}
	public static double INRToyen(double INR)
	{
		double yen;
		yen=(INR/0.63)+(INR%0.63);
		return yen;
		
	}
	

}
