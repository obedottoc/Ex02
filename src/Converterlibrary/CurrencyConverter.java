package Converterlibrary;

import javax.tools.Tool;

public class CurrencyConverter {
	public static double dollartoINR(double dollar)
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
	public static double eurotoINR(double euro)
	{
		double INR;
		INR=77.16*euro;
		return INR;
	}
	public static double INRtoeuro(double INR)
	{
		double euro;
		euro=(INR%77.16)+(INR%77.16);
		return euro;
	}
	public static double yentoINR(double yen)
	{
		double INR;
		INR=0.63*yen;
		return INR;
	}
	public static double INRtoyen(double INR)
	{
		double yen;
		yen=(INR/0.62)+(INR%0.63);
		return yen;
	}
}
		
		
	
	


