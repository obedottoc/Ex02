package converterlibrary;

public class DistanceConverter
{
	public static double metertokilometer1(double meter)
	{
		double kilometer;
		kilometer = meter/1000;
		return kilometer;
	}
	public static double kilometertometer(double kilometer)
	{
		double meter;
		meter = kilometer*1000;
		return meter;
	}
	public static double metertokilometer(double meter)
	{
		double kilometer;
		kilometer = meter/1000;
		return kilometer;
	}
	public static double miletokilometer(double mile)
	{
		double kilometer;
		kilometer = mile*1.609;
		return kilometer;
	}
	public static double kilometertomile(double kilometer)
	{
		double mile;
		mile = kilometer/1.609;
		return mile;
	}
	
	

}
