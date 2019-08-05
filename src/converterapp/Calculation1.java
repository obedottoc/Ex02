package converterapp;
import converterlibrary.CurrencyConverters;
import converterlibrary.DistanceConverters;
import converterlibrary.TimeConverters;
import java.util.Scanner;
public class Calculation1 {

	public static void main(String[] args) {
		double x1,x2;
		int option;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Inr to Dollar conversion");
			System.out.println("2. Dollar to Inr conversion");
			System.out.println("3. Inr to Euro conversion");
			System.out.println("4. Euro to Inr conversion");
			System.out.println("5. Inr to Yen conversion");
			System.out.println("6. Yen to Inr conversion");
			System.out.println("7. Meter to Kilometer conversion");
			System.out.println("8. Kilometer to Meter conversion");
			System.out.println("9. Miless to Kilometer conversion");
			System.out.println("10. Kilometer to Miless conversion");
			System.out.println("11. Min to Hours conversion");
			System.out.println("12. Hours to Min conversion");
			System.out.println("13. Sec to Hours conversion");
			System.out.println("14. Hours to Sec conversion");			
			System.out.println("15. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter currency in INR:");
				x1=sc.nextDouble();
				x2=CurrencyConverters.InrToDollar(x1);
				System.out.printf("%.2f inr is equal to %.2f dollar.\n", x1,x2);
				break;
			case 2:
				System.out.print("Enter the Dollar:");
				x1=sc.nextDouble();
				x2=CurrencyConverters.DollarToInr(x1);
				System.out.printf("%.2f Dollor is equal to %.2f INR.\n", x1,x2);
				break;
			case 3:
				System.out.print("Enter the EURO:");
				x1=sc.nextDouble();
				x2=CurrencyConverters.EuroToInr(x1);
				System.out.printf("%.2f INR is equal to %.2f INR.\n", x1,x2);
				break;
			case 4:
				System.out.print("Enter the INR:");
				x1=sc.nextDouble();
				x2=CurrencyConverters.InrToEuro(x1);
				System.out.printf("%.2f EURO is equal to %.2f INR.\n", x1,x2);
				break;
			case 5:
				System.out.print("Enter the YEN:");
				x1=sc.nextDouble();
				x2=CurrencyConverters.YenToInr(x1);
				System.out.printf("%.2f YEN is equal to %.2f INR.\n", x1,x2);
				break;
			case 6:
				System.out.print("Enter the INR:");
				x1=sc.nextDouble();
				x2=CurrencyConverters.InrToYen(x1);
				System.out.printf("%.2f INR is equal to %.2f YEN.\n", x1,x2);
				break;
			case 7:
				System.out.print("Enter the Meter:");
				x1=sc.nextDouble();
				x2=DistanceConverters.MeterToKilometer(x1);
				System.out.printf("%.2f Meter is equal to %.2f Kilometer.\n", x1,x2);
				break;
			case 8:
				System.out.print("Enter the Kilometer:");
				x1=sc.nextDouble();
				x2=DistanceConverters.KilometerToMeter(x1);
				System.out.printf("%.2f Kilometer is equal to %.2f Meter.\n", x1,x2);
				break;
			case 9:
				System.out.print("Enter the Miless:");
				x1=sc.nextDouble();
				x2=DistanceConverters.MilesToKilometer(x1);
				System.out.printf("%.2f Miles is equal to %.2f Kilometer.\n", x1,x2);
				break;
			case 10:
				System.out.print("Enter the Kilometer:");
				x1=sc.nextDouble();
				x2=DistanceConverters.KilometerToMiles(x1);
				System.out.printf("%.2f Kilometer is equal to %.2f Miles.\n", x1,x2);
				break;
			case 11:
				System.out.print("Enter the Hours:");
				x1=sc.nextDouble();
				x2=TimeConverters.HoursToMins(x1);
				System.out.printf("%.2f Hours is equal to %.2f Minute.\n", x1,x2);
				break;
			case 12:
				System.out.print("Enter the Minute:");
				x1=sc.nextDouble();
				x2=TimeConverters.MinsToHours(x1);
				System.out.printf("%.2f Minute is equal to %.2f Hours.\n", x1,x2);
				break;
			case 13:
				System.out.print("Enter the Hours:");
				x1=sc.nextDouble();
				x2=TimeConverters.HoursToSec(x1);
				System.out.printf("%.2f Hours is equal to %.2f Seconds.\n", x1,x2);
				break;
			case 14:
				System.out.print("Enter the Seconds:");
				x1=sc.nextDouble();
				x2=TimeConverters.SecToHours(x1);
				System.out.printf("%.2f Seconds is equal to %.2f Hours.\n", x1,x2);
				break;
			case 15:
				System.out.println("Thankyou for using Converters application !!!");
				break;
			default:
				System.out.print("Please enter a valid number !!!");
			}
			if(option==15)
			{		
				break;
			}
		}
	}
}
