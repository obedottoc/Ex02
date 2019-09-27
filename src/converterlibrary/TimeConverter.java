/*****
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package converterlibrary;
	public class TimeConverter {
			
			public static double hoursToMinutes(double hours)
			{
				double Minutes;
				
					Minutes=hours/60.0;
				return Minutes;
			}
			
			public static double MinutesTohours(double Minutes)
			{
				double hours;
				
					hours=Minutes/60.0;
				return hours;
			}

			public static double hoursToSeconds(double hours)
			{
				double Seconds;
				
					Seconds=hours*3600.0;
				return Seconds;
			}
			public static double SecondsTohours(double Seconds)
			{
				double hours;
				
					hours=Seconds/3600.0;
				return hours;
			}
}
