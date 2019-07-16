package converterlibrary;
public class TimeConverter {
	public static double hrsTomin(double hrs) 
	{
		double min;
		min=hrs*60;
		return min;
	}
	public static double minTohrs(double min) 
	{
		double hrs;
		hrs=min/60;
		return hrs;
	}
	public static double hrsTosec(double hrs) 
	{
		double sec;
		sec=hrs*3600;
		return sec;
	}
	public static double secTohrs(double sec) 
	{
		double hrs;
		hrs=sec/3600;
		return hrs;
	}
}
