package converterlibrary;

public class timeconverter {
	public static double hoursTomins (double hours)
	{double mins;
	mins=60*hours;
	return mins;
	}
	public static double minsTohours(double mins)
	{double hours;
	hours=(mins/60)+(mins%60);
	return hours;
	}
	public static double hoursToseconds(double hours)
	{double seconds;
	seconds=60*60*hours;
	return seconds;
	}
	public static double  secondsTohours(double seconds)
	{double hours;
	hours=(seconds/3600)+(seconds%3600);
	return hours;
	}
	


}

