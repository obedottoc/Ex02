/*created by: G. Sanjai Kumar
 * email: gsanjaik@gmail.com
 */
package converterlibrary;

public class DistanceConverter {
	public static double meterToKM (double meter)
	{double KM;
	 KM=(meter/1000)+(meter%1000);
	 return KM;
	}
	public static double kmToMETER (double km)
	{double METER;
	 METER=km*1000;
	 return METER;
	}
	public static double milesToKM (double miles)
	{double KM;
	 KM=1.609*miles;
	 return KM;
	}
	public static double kmToMILES(double km)
	{double MILES;
	 MILES=(km/1.609)+(km%1.609);
	 return MILES;
	}
}
