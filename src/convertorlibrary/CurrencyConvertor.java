/***
 * developed by lokesh j
 * lokeshwarn2000@gmail.com
 * exp2
 */
package convertorlibrary;

public class CurrencyConvertor {
	public static double dollarTOINR(double dollar)
	{
	double INR;
	INR=68.52*dollar;
	return INR;
	}
	
	public static double INRTOdollar(double INR)
	{
		double dollar;
		dollar=(INR/68.52)+(INR%68.52);
		return dollar;
		
	}
	public static double euroTOINR(double euro)
	{
		double INR;
		INR=77.23*euro;
		return INR;
	}
	public static double INRTOeuro(double INR)
		{  double euro;
		euro=(INR/77.23)+(INR*77.23);
		return euro;
		}
    public static double yenTOINR(double yen)
    {  double INR;
       INR=0.63*yen;
         return INR;
         }
    public static double INRTOyen(double INR)
    { double yen;
	yen=(INR/0.63)+(INR*0.63);
	return yen;
    }

		
	
    
}
