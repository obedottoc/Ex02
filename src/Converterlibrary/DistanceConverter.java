package Converterlibrary;

public class DistanceConverter {
	public static double metertoKM(double meter)
	{
		double KM;
		KM=(meter/1000)+(meter%1000);
		return KM;
	}
	public static double KMtometer(double KM)
	{
		double meter;
		meter=KM*1000;
		return meter;
	}
	public static double milestoKM(double miles)
	{
		double KM;
		KM=1.609*miles;
		return KM;
	}
	public static double KMtomiles(double KM)
	{
		double miles;
		miles=(KM/1.609)+(KM%1.609);
		return miles;
		
	}

}
