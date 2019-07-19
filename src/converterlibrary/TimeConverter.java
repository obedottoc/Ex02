/*****
 * Converter library 
 * developed by
 * N.pavithra.
 * npavithra1405@gmail.com
 */

package converterlibrary;

public class TimeConverter {
	
	public static double hourstominutes(double hours)
	{
		double minutes;	
		         minutes=hours*60;
		return minutes;
	}
	
	public static double minutestohours(double minutes)
	{
		double hours;
			hours=minutes/60;
		return hours;
	}
	public static double hourstoseconds(double hours)
	{
		double seconds;	
	         seconds=hours*3600;
		return seconds;
	}
	
	public static double secondstohours(double seconds)
	{
		double hours;
			hours=seconds/3600;
		return hours;
	}
	
}
