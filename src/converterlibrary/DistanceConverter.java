package converterlibrary;

public class DistanceConverter {

			
			public static double meterToKM(double meter)
			{
				double KM;
				
					KM=meter*1000.0;
				return KM;
			}
			
			public static double KMTometer(double KM)
			{
				double meter;
				
					meter=KM/1000.0;
				return meter;
			}

			public static double milesToKM(double miles)
			{
				double KM;
				
					KM=miles*1.609;
				return KM;
			}
			public static double KMTomiles(double KM)
			{
				double miles;
				
					miles=KM/1.609;
				return miles;
			}
}
