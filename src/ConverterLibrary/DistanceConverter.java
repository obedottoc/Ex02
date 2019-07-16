package ConverterLibrary;
/****
 * Program for distance conversion
 * @author G.vishnu
 *  guntikavishnu@gmail.com
 */
public class DistanceConverter {
	public static double metertokilometer(double meter)
	{
		double kilometer;
			kilometer=meter*1000;
		return kilometer;
	}

	public static double kilometertometer(double kilometer)
	{
		double meter;
			meter=kilometer/1000;
		return meter;
	}
	public static double milestokilometer(double miles)
	{
		double kilometer;
		     kilometer=miles/1.609;
		return kilometer;     
	}
	public static double kilometertomiles(double kilometer)
	{
		double miles;
		     miles=kilometer*1.609;
		 return miles;    
	}
}



