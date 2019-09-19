/*created by Abhijith.S
abhijithabhi524@gmail.com
*/

package converterlibrary;

public class Timeconverter {
	public static double hourstominutes(double hours)
	{
		double minutes;
		minutes=60*hours;
		return minutes;
	}
	public static double minstohours(double mins)
	{
		double hours;
		hours=(mins/60);
		return hours;
	}
	public static double hourstoseconds(double hours)
	{
		double seconds;
		seconds=60*60*hours;
		return seconds;
		}
	public static double secondstohourse(double secs)
	{
		double hours;
		hours=(secs/3600);
		return hours;
	}
}
