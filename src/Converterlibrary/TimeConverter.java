/**
 * Ahamed meeran
 * ahamedmeeran23@gmail.com
 * EX02
 */

package Converterlibrary;

public class TimeConverter {
public static double hoursTominutes(double hours)
{
double minutes;
minutes=60*hours;
return minutes;
}
public static double minutestohours(double minutes)
{
double hours;
hours=(minutes/60)+(minutes%60);
return hours;
}
public static double hourstoseconds(double hours)
{
double seconds;
seconds=60*60*hours;
return seconds;
}
public static double secondstohours(double seconds)
{
double hours;
hours=(seconds/3600)+(seconds%3600);
return hours;
}
}
	
