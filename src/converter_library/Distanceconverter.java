package converter_library;
/***
 * 
 * @author sumanth
 *to create distance converter
 */
public class Distanceconverter {
	public static double Meter_To_Kilometer(double Meter)
	{
	double kilometer;
	kilometer=Meter*1000;
	return kilometer;

	}
	public static double kilometer_To_Meter(double Kilometer)
	{
	double Meter;
	Meter=Kilometer/1000;
	return Meter;

	}
	public static double Kilometer_To_Mile(double Kilometer)
	{
	double Miles;
	Miles=Kilometer/1.609;
	return Miles;

	}
	public static double Miles_To_kilometer(double Miles)
	{
	double Kilometer;
	Kilometer=Miles*1.609;
	return Kilometer;
	}



	}



