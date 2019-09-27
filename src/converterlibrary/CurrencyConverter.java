/*****
 * Developed by
 * D. Sarathi Raj
 * 212217105054
 * sarathiraj852000@gmail.com
 */
package converterlibrary;
	public class CurrencyConverter {
		
		public static double dollarToINR(double dollar)
		{
			double INR;
			
				INR=dollar*68.56;
			return INR;
		}
		
		public static double INRTodollar(double INR)
		{
			double dollar;
			
				dollar=INR/68.56;
			return dollar;
		}

		public static double EUROToINR(double EURO)
		{
			double INR;
			
				INR=EURO*77.39;
			return INR;
		}
		public static double INRToEURO(double INR)
		{
			double EURO;
			
				EURO=INR/77.39;
			return EURO;
		}
		public static double YenToINR(double Yen)
		{
			double INR;
			
				INR=Yen*0.62;
			return INR;
		}
		public static double INRToYen(double INR)
		{
			double Yen;
			
				Yen=INR/0.62;
			return Yen;

		}
	}

