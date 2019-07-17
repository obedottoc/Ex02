package converterapp;


	import java.util.Scanner;
	import converterlibrary.*;

	public class Calculation {

		public static void main(String[] args) {
			double value1,value2;
			int option;
			Scanner sc=new Scanner(System.in);
			
			while(true)
			{
				System.out.println("1. dollar to INR");
				System.out.println("2. INR to dollar");
				System.out.println("3. EURO to INR");
				System.out.println("4. INR to EURO");
				System.out.println("5. Yen to INR ");
				System.out.println("6. INR to Yen");
				System.out.println("7. meter to KM");
				System.out.println("8. KM to meter");
				System.out.println("9. miles to KM");
				System.out.println("10. KM to miles");
				System.out.println("11. hours to Minutes");
				System.out.println("12. Minutesb to hours");
				System.out.println("13. hours to Seconds");
				System.out.println("14. Seconds to hours");
				System.out.println("15. Exit");
				System.out.print("Enter the choice");
				
				
				option=sc.nextInt();
				switch(option)
				{
				case 1:
					System.out.print("Enter money in dollar:");
					value1=sc.nextDouble();
					value2=CurrencyConverter.dollarToINR(value1);
					System.out.printf("%.2f dollar is equal to %.2f INR.\n", value1,value2);
					break;
				case 2:
					System.out.print("Enter money in INR:");
					value1=sc.nextDouble();
					value2=CurrencyConverter.INRTodollar(value1);
					System.out.printf("%.2f INR is equal to %.2f dollar.\n", value1,value2);
					break;	
				case 3:
					System.out.print("Enter money in EURO:");
					value1=sc.nextDouble();
					value2=CurrencyConverter.EUROToINR(value1);
					System.out.printf("%.2f EURO is equal to %.2f INR.\n", value1,value2);
					break;	
				case 4:
					System.out.print("Enter money in INR:");
					value1=sc.nextDouble();
					value2=CurrencyConverter.INRToEURO(value1);
					System.out.printf("%.2f INR is equal to %.2f EURO.\n", value1,value2);
					break;	
				case 5:
					System.out.print("Enter money in Yen:");
					value1=sc.nextDouble();
					value2=CurrencyConverter.YenToINR(value1);
					System.out.printf("%.2f Yen is equal to %.2f INR.\n", value1,value2);
					break;	
				case 6:
					System.out.print("Enter money in INR:");
					value1=sc.nextDouble();
					value2=CurrencyConverter.INRToYen(value1);
					System.out.printf("%.2f INR is equal to %.2f Yen.\n", value1,value2);
					break;	
				case 7:
					System.out.print("Enter distance in meter:");
					value1=sc.nextDouble();
					value2=DistanceConverter.meterToKM(value1);
					System.out.printf("%.2f meter is equal to %.2f KM.\n", value1,value2);
					break;	
				case 8:
					System.out.print("Enter distance in KM:");
					value1=sc.nextDouble();
					value2=DistanceConverter.KMTometer(value1);
					System.out.printf("%.2f KM is equal to %.2f meter.\n", value1,value2);
					break;	
				case 9:
					System.out.print("Enter distance in miles:");
					value1=sc.nextDouble();
					value2=DistanceConverter.milesToKM(value1);
					System.out.printf("%.2f miles is equal to %.2f KM.\n", value1,value2);
					break;
				case 10:
					System.out.print("Enter distance in KM:");
					value1=sc.nextDouble();
					value2=DistanceConverter.KMTomiles(value1);
					System.out.printf("%.2f KM is equal to %.2f miles.\n", value1,value2);
					break;
				case 11:
					System.out.print("Enter time in hours:");
					value1=sc.nextDouble();
					value2=TimeConverter.hoursToMinutes(value1);
					System.out.printf("%.2f hours is equal to %.2f Minutes.\n", value1,value2);
					break;
				case 12:
					System.out.print("Enter time in Minutes:");
					value1=sc.nextDouble();
					value2=TimeConverter.MinutesTohours(value1);
					System.out.printf("%.2f Minutes is equal to %.2f hours.\n", value1,value2);
					break;
				case 13:
					System.out.print("Enter time in hours:");
					value1=sc.nextDouble();
					value2=TimeConverter.hoursToSeconds(value1);
					System.out.printf("%.2f hours is equal to %.2f Seconds.\n", value1,value2);
					break;
				case 14:
					System.out.print("Enter time in Seconds:");
					value1=sc.nextDouble();
					value2=TimeConverter.SecondsTohours(value1);
					System.out.printf("%.2f Seconds is equal to %.2f hours.\n", value1,value2);
					break;
				case 15:
					System.out.println("Thank you for using Converter Application!!!");
					break;
			
				default:
					System.out.print("Please enter a valid number");
				}
				if (option==15)
				{
				break;
				}
			}
		}
	}