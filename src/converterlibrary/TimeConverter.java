
// * created by roopesh
//** This program is written to convert time


package converterlibrary;

public class TimeConverter {
	public static double hoursTominutes(double hours)
	{
		double minutes;
		minutes=60*hours;
		return minutes;
	}
	public static double minutesTohours(double minutes) 
	{
	double hours;
	hours=(minutes/60)+(minutes%60);
	return hours;
	}
	public static double hoursToseconds(double hours)
	{
		double seconds;
		seconds=3600*hours;
		return seconds;
	}
	public static double secondsTohours(double seconds)
	{
		double hours;
		hours=(seconds/3600)+(seconds%3600);
		return hours;
		
	}

}
