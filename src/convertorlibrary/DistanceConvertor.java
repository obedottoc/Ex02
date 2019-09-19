/****
 *Developed By Avinash Raja

 *Reg n0:212217105009
 *exp n0:2
 *EEE-A
 */
package convertorlibrary;

public class DistanceConvertor 
{
	public static double metertokm(double meter)
	{
		double km;
		km=(meter/1000)+(meter%1000);
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
		miles=(km/1.609)+(km%1.609);
		return miles;
	}
}
	
	
