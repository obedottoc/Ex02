
/*created by kaarthikeyan
 * email:gk81299@gmail.com
 * 
 */
package converterlibrary;
public class DistanceConverter {
	public static double mtrTokm(double mtr) 
	{
		double km;
		km=mtr/1000;
		return km;
	}
	public static double kmTomtr(double km) 
	{
		double mtr;
		mtr=km*1000;
		return mtr;
	}
	public static double mileTokm(double mile) 
	{
		double km;
		km=mile/0.62137;
		return km;
	}
	public static double kmTomile(double km) 
	{
		double mile;
		mile=km*0.62137;
		return mile;
	}
}
