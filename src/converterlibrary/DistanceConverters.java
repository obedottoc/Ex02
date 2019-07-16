
package converterlibrary;

public class DistanceConverters {
	
	public static double MeterToKilometer(double meter) 
	{
		double kilometer;
			kilometer=meter*1000;
		return kilometer;
	}
	public static double KilometerToMeter(double kilometer )
	{
		double meter;
			meter=kilometer/1000;
		return meter;
	}
	public static double MilesToKilometer(double miles)
	{
		double kilometer;
			kilometer=miles*1.609;
		return kilometer;
	}
	public static double KilometerToMiles(double kilometer)
	{
		double miles;
			miles=kilometer/1.609;
		return miles;
	}
}
