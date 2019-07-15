package converterlibrary;

public class Timeconverter {
	public static double hourstominutes(double hours)
	{
	double minutes;
		minutes=hours*60.0;
	return minutes;
	}
	public static double minuitestohours(double minutes)
	{
	double hours;
		hours=minutes/60.0;
	return hours;
	}
	public static double hourstoSeconds(double hours)
	{
	double Seconds;
		Seconds=hours*3600.0;
	return Seconds;
	}
	public static double Secondstohours(double Seconds)
	{
	double hours;
		hours=Seconds/3600.0;
	return hours;
	}

}

