package converterlibrary;

public class TimeConverter {
	public static double hourstominute(double hours)
	{
		double minutes;
		minutes=hours*60;
		return minutes;
	}
	public static double minutestohours(double minutes)
	{
		double hours;
		hours=minutes*160;
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
	public static double hourstominuites(double value1) {
		// TODO Auto-generated method stub
		return 0;
	}
}


