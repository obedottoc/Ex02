package convertorlibrary;

public class TimeConvertor 
{
	public static double hrstomin(double hrs)
	{
		double min;
		min=60*hrs;
		return min;
	}
	public static double mintohrs(double min)
	{
		double hrs;
		hrs=(min/60)+(min%60);
		return hrs;
	}
	public static double hrstosec(double hrs)
	{
		double sec;
		sec=60*60*hrs;
		return sec;
	}
	public static double sectohrs(double sec)
	{
		double hrs;
		hrs=(sec/3600)+(sec%3600);
		return hrs;
	}
}
