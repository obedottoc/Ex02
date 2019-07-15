package converterlibrary;
public class TimeConverter {

	public static double hoursTomins(double hours)
	{
		double mins;
		mins=hours*60.0;
		return mins;
	}
	public static double minsTohours(double mins)
	{
		double hours;
		hours=mins/160;
		return hours;
	}
	public static double hoursTosec(double hours)
	{
		double sec;
		sec=hours*3600;
		return sec;
	}
	public static double secTohours(double sec)
	{
		double hours;
		hours=sec/3600;
		return hours;
	}
}


