/*****
 * Converter library 
 * developed by
 * M.Upendra
 * upendravarma1234@gmail.com
 */

package converterlibrary;

public class currencyconverter {


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
	public static double EUROtoINR(double EURO)
	{
		double INR;	
	         INR=EURO*77.39;
		return INR;
	}

	public static double INRtoEURO(double INR)
	{
		double EURO;
			EURO=INR/77.39;
		return EURO;
	}
	public static double YentoINR(double Yen)
	{
		double INR;	
		         INR=Yen/0.64;
		return INR;
	}

	public static double INRtoYen(double INR)
	{
		double Yen;
			Yen=INR*0.64;
		return Yen;
	}
}
