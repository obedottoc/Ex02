/*
 *Program to perform TimeConverter 
 *By Faizul
 *faizulsmart10@gmail.com
 */

package converterlibrary;

public class TimeConverter {
	
	public static double hrstomins (double hrs)
	{double mins;
	mins=60*hrs;
	return mins;
	}
	
	public static double minstohrs (double mins)
	{double hrs;
	hrs=(mins/60)+(mins%60);
	return hrs;
	}
	
	public static double hrstosecs (double hrs)
	{double secs;
	secs=60*60*hrs;
	return secs;
	}
	public static double secstohrs (double secs)
	{double hrs;
	hrs=(secs/3600)+(secs%3600);
	return hrs;
	}
}
