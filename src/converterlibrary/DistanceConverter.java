/***
 * created by roopesh
 */


package converterlibrary;

public class DistanceConverter {
	public static double MeterToKM(double Meter)
	{
		double KM;
		KM=(Meter/1000)+(Meter%1000);
		return KM;
	}
	public static double KMToMeter(double KM)
	{
	double Meter;
	Meter=KM*1000;
	return Meter;
	
	}
	public static double MilesToKM(double Miles)
	{
		double KM;
		KM=1.609*Miles;
		return KM;
	}
	public static double KMToMiles(double KM)
	{
		double Miles;
		Miles=(KM/1.609)+(KM%1.609);
		return Miles;
				
	}
	

}
