package converterlibrary;

public class TimeConverters {
	
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
	public static double HoursToseconds(double hours)
	{
		double seconds;
			seconds=hours*3600;
		return hours;
	}
	public static double secondsToHours(double seconds)
	{
		double hours;
			hours=seconds/3600;
		return seconds;
	}
}
