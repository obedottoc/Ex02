package converterlibrary;

public class Distanceconverter {
	public static double milesToKM(double miles)
	{
			double KM;
			KM=miles/1.69;
			return KM;
	}
	public static double KMtomiles(double KM)
	{
		double miles;
	   miles=KM*1.69;
	   return miles;
	} 
	public static double metertoKM(double meter)
	{
		double KM;
		KM=meter/1000.0;
		return KM;
	}
	public static double KMtometer (double KM)
	{
		double meter;
		meter=KM*1000.0;
		return meter;
	}
	
}
