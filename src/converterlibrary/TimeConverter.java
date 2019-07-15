package converterlibrary;

public class TimeConverter {
	public static double hourstominuites(double hours)
	{
		double minuites;
			minuites=hours*60.0;
		return minuites;
	}
	public static double minuitestohours(double minuites)
	{
		double hours;
			hours=minuites/60.0;
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
