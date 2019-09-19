/*created by: G. Sanjai Kumar
 * email: gsanjaik@gmail.com
 */
package converterapp;

import java.util.Scanner;
import converterlibrary.*;

public class Calculation1 {
	public static void main(String[] args) {
		double a,b;
		int option;
		Scanner sc= new Scanner(System.in);
		while(true)
		{	System.out.println("1.Dollar to INR");
			System.out.println("2.INR to Dollar");
			System.out.println("3.Euro to INR");
			System.out.println("4.INR to Euro");
			System.out.println("5.Yen to INR");
			System.out.println("6. INR to Yen");
			System.out.println("7.Meter to KM");
			System.out.println("8.KM to Meter");
			System.out.println("9.Miles to KM");
			System.out.println("10.KM to Miles");
			System.out.println("11.Hours to Mins");
			System.out.println("12.Mins to Hours");
			System.out.println("13.Hours to Secs");
			System.out.println("14.Secs to Hours");
			System.out.println("15. EXIT");
			System.out.print("Enter your choice: ");
			option=sc.nextInt();
			switch(option)
			{	case 1:
					System.out.print("Enter Dollars: ");
					a=sc.nextDouble();
					b=CurrencyConverter.dollarToINR(a);
					System.out.printf("%.2f$=%.2fRs \n" , a,b);
					break;
			  	case 2:
			  		System.out.print("Enter INR: ");
			  		a=sc.nextDouble();
			  		b=CurrencyConverter.inrToDOLLAR(a);
			  		System.out.printf("%.2fRs=%.2f$ \n" , a,b);
			  		break;
				case 3:
					System.out.print("Enter Euro: ");
					a=sc.nextDouble();
					b=CurrencyConverter.euroToINR(a);
					System.out.printf("%.2f euros=%.2fRs \n" , a,b);
					break;
				case 4:
					System.out.print("Enter INR: ");
					a=sc.nextDouble();
					b=CurrencyConverter.inrToEURO(a);
					System.out.printf("%.2fRs=%.2f euros \n" , a,b);
					break;
				case 5:
					System.out.print("Enter Yen: ");
					a=sc.nextDouble();
					b=CurrencyConverter.yenToINR(a);
					System.out.printf("%.2fyen=%.2fRs \n" , a,b);
					break;
				case 6:
					System.out.print("Enter INR: ");
					a=sc.nextDouble();
					b=CurrencyConverter.inrToYEN(a);
					System.out.printf("%.2fRs=%.2fyen \n" , a,b);
					break;
				case 7:
					System.out.print("Enter Meters: ");
					a=sc.nextDouble();
					b=DistanceConverter.meterToKM(a);
					System.out.printf("%.2fm=%.2f kms \n" , a,b);
					break;
				case 8:
					System.out.print("Enter KM: ");
					a=sc.nextDouble();
					b=DistanceConverter.kmToMETER(a);
					System.out.printf("%.2fkms=%.2fm \n" , a,b);
					break;
				case 9:
					System.out.print("Enter MILES: ");
					a=sc.nextDouble();
					b=DistanceConverter.milesToKM(a);
					System.out.printf("%.2fmiles=%.2fkms \n" , a,b);
					break;
				case 10:
					System.out.print("Enter KM: ");
					a=sc.nextDouble();
					b=DistanceConverter.kmToMILES(a);
					System.out.printf("%.2fkms=%.2fmiles \n" , a,b);
					break;
				case 11:
					System.out.print("Enter Hours: ");
					a=sc.nextDouble();
					b=TimeConverter.hoursToMinutes(a);
					System.out.printf("%.2fhes=%.2fmins \n" , a,b);
					break;
				case 12:
					System.out.print("Enter Minutes: ");
					a=sc.nextDouble();
					b=TimeConverter.minsToHours(a);
					System.out.printf("%.2fmins=%.2fhrs \n" , a,b);
					break;
				case 13:
					System.out.print("Enter Hours: ");
					a=sc.nextDouble();
					b=TimeConverter.hoursToSeconds(a);
					System.out.printf("%.2fhrs=%.2fsecs \n" , a,b);
					break;
				case 14:
					System.out.print("Enter Seconds: ");
					a=sc.nextDouble();
					b=TimeConverter.secsToHours(a);
					System.out.printf("%.2fsecs=%.2fhrs \n" , a,b);
					break;
				case 15:
					break;
				default:
					System.out.println("Please enter a valid number!!!:)");
			}
			if(option==15)
				break;
		}
	}
}