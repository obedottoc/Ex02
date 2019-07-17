package ConvertorLibrary;

public class TimeConvertor {
	public static double HourstoMinutes(double Minutes)
	{
		double Hours;
			Hours=Minutes*60.0;
		return Hours;
	}
	public static double MinutestoHours(double Hours)
	{
		double Minutes;
			Minutes=Hours/60.0;
		return Minutes;
	}
	public static double HourstoSeconds(double Seconds)
	{
		double Hours;
			Hours=Seconds*3600;
		return Hours;
	}
	public static double SecondstoHours(double Hours)
	{
		double Seconds;
			Seconds=Hours/3600;
		return Seconds;
	}

}
