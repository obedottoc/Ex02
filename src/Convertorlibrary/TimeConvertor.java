package Convertorlibrary;

public class TimeConvertor {
	public static double hoursToMinutes(double hours)
	{
		double Minutes;
		Minutes=60*hours;
		return Minutes;
	}
	public static double Minutestohours(double Minutes)
	{
		double hours;
		hours=(Minutes/60)+(Minutes%60);
		return hours;
	}
	public static double hoursToseconds(double hours)
	{
		double seconds;
		seconds=60*60*hours;
		return seconds;
	}
	public static double secondsTohours(double seconds)
	{
		double hours;
		hours=(seconds/3600)+(seconds%3600);
		return hours;
	}
}
