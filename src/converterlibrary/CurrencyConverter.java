package converterlibrary;

public class CurrencyConverter {
	public static double dollartoINR(double dollar) 
	{
		double INR;
			INR=dollar*68.56;
		return INR;
		
	}
	public static double INRtodollar(double INR)
	{
		double dollar;
			dollar=INR/68.56;
	return dollar;
	}
	public static double eUROtoINR(double eURO)
	{
		double INR;
			INR=eURO*77.39;
		return INR;
				
	}
	public static double INRtoeURO(double INR)
	{
		double eURO;
			eURO=INR/77.39;
		return eURO;
				
	}
	public static double yentoINR(double yen)
	{
		double INR;
			INR=yen*0.62;
		return INR;
				
	}
	public static double INRtoyen(double INR)
	{
		double yen;
			yen=INR/0.62;
		return yen;
				
	}
	
	
	
	
}
