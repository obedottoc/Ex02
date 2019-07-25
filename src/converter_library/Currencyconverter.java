package converter_library;
/***
 * 
 * @author sumanth
 * to crate a currency converter
 */
public class Currencyconverter {
	public static double Dollar_TO_Inr(double Dollar)
	{
	double Inr;
	Inr=Dollar*68.56;
	return Inr;

	}
	public static double INR_TO_Dollar(double Inr)
	{
	double Dollar;
	Dollar=Inr/68.56;
	return Dollar;
	}
	public static double Euro_To_Inr(double Euro)
	{
	double Inr;
	Inr=Euro*77.39;
	return Inr;
	}
	public static double Inr_To_Euro(double Inr)
	{
	double Euro;
	Euro=Inr/77.39;
	return Euro;
	}
	public static double Yen_To_Inr(double Yen)
	{
	double Inr;
	Inr=Yen*0.64;
	return Inr;
	}
	public static double Inr_To_Yen(double Inr)
	{
	double Yen;
	Yen=Inr/0.64;
	return Yen;
	}

	}


