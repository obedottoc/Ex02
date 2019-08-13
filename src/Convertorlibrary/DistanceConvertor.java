package Convertorlibrary;

public class DistanceConvertor {
	public static double meterToKM(double meter)
	{
		double KM;
		KM=(meter/1000)+(meter%1000);
		return KM;		
	}
	public static double KMTometer(double KM)
	{double meter;
	meter=KM*1000;
	return meter;
	}
	public static double milesToKM(double miles)
	{
		double KM;
		KM=1.609*miles;
		return KM;
	}
    public static double KMTomiles(double KM)
    {
    	double miles;
    	miles=(KM/1.609)+(KM%1.609);
    	return miles;
    }
}
