package converterlibrary;

public class DistanceConverter {
	public static double MetertoKm(double Meter)
	{
		double Km;
			Km=Meter/1000;
		return Km;
	}
	
	public static double KmtoMeter(double Km)
	{
		double Meter;
			Meter=Km*1000;
		return Meter;
	}
	public static double MilestoKm(double Miles)
	{
		double Km;
			Km=Miles*1.609;
		return Km;
		
	}
	public static double KmtoMiles(double Km)
	{
		double Miles;
			Miles=Km/1.609;
		return Miles;
	}
}

