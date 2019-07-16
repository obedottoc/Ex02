package converterlibrary;

public class TimeConverter {
	public static double hoursToMinutes (double hours)
	{double Minutes;
	 Minutes=60*hours;
	 return Minutes;
	}
	public static double minsToHours (double mins)
	{double Hours;
	 Hours=(mins/60);
	 return Hours;
	}
	public static double hoursToSeconds (double hours)
	{double Seconds;
	 Seconds=3600*hours;
	 return Seconds;
	}
	public static double secsToHours (double secs)
	{double Hours;
	 Hours=(secs/3600);
	 return Hours;
	}
}
