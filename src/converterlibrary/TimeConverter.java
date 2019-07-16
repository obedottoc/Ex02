package converterlibrary;

public class TimeConverter {
	
	public static double HoursToMins(double hours)
	{
		double min;
			min=hours*60;
		return min;
	}
	public static double MinsToHours(double min)
	{
		double hours;
			hours=min/60;
		return hours;
	}
	public static double HoursToSec(double hours)
	{
		double sec;
			sec=hours*3600;
		return sec;
	}
	public static double SecToHours(double sec)
	{
		double hours;
			hours=sec/3600;
		return hours;
	}
}
