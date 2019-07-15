package converterlibrary;

public class DistanceConverter {

	public static double meterTokm(double meter)
	{
		double km;
		km=meter*1000;
		return km;
	}
	public static double kmTometer(double km)
	{
		double meter;
		meter=km/1000;
		return meter;
	}
	public static double milesTokm(double miles)
	{
		double km;
		km=miles*1.609;
		return km;
	}
	public static double kmTomiles(double km)
	{
		double miles;
		miles=km/1.609;
		return miles;
	}
}


