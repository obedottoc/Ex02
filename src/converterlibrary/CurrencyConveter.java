/*created by kaarthikeyan
 * email:gk81299@gmail.com
 * 
 */
package converterlibrary;
public class CurrencyConveter
{
	public static double dollorToinr(double dollor)
	{
		double inr;
		inr=dollor*65.3;
		return inr;
	}
	public static double inrTodollor(double inr) 
	{
		double dollor;
		dollor=inr/65.3;
		return dollor;
		}
	public static double euroToinr(double euro)
	{
		double inr;
		inr=euro*77.21;
		return inr;
	}
	public static double inrToeuro(double inr)
	{
		double euro;
		euro=inr/77.21;
		return euro;
	}
	public static double yenToinr(double yen) 
	{
		double inr;
		inr=yen*0.63;
		return inr;
	}
	public static double inrToyen(double inr)
	{
		double yen;
		yen=inr/0.63;
		return yen;
	}

}
