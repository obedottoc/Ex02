/*created by Abhijith.S
abhijithabhi524@gmail.com
*/


package converterlibrary;

public class Distanceconverter{ 
public static double metertokm(double meter)
	{
	double km;
	km=(meter/1000);
	return km;
}
public static double kmtometer(double km)
{
	double meter;
meter=km*1000;
return meter;
}
public static double milestokm(double miles)
{
	double km;
	km=1.609*miles;
	return km;
}
public static double kmtomiles(double km)
{
	double miles;
	miles=(km/1.609);
	return miles;
}
}