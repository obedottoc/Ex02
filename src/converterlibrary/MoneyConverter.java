package converterlibrary;

public class MoneyConverter  {
	
	public static double DollartoInr(double Dollar)
	{
		double Inr;
			Inr=Dollar*68.56;
		return Inr;
	}
	
	public static double InrtoDollar(double Inr)
	{
		double Dollar;
			Dollar=Inr/68.56;
		return Dollar;
	}

	public static double EurotoInr(double Euro)
	{
		double Inr;
			Inr=Euro*77.39;
		return Inr;
	}
	
	public static double InrtoEuro(double Inr)
	{
		double Euro;
			Euro=Inr/77.39;
		return Euro;
	}
	
	public static double YentoInr(double Yen)
	{
		double Inr;
			Inr=Yen*0.62;
		return Inr;		
	}
	public static double InrtoYen(double Inr)
	{
		double Yen;
			Yen=Inr/0.62;
		return Yen;
	}
}