/***
 * created by G.Nikhil
 * EEE A
 */



package converterapp;
import java.util.Scanner;
import converterlibrary.*;
public class Calculation1 {
	public static void main(String[]arg){
		double a,b;
		int option;
		Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("1.dollar to INR");
		System.out.println("2.INR to dollar");
		System.out.println("3.euro to inr");
		System.out.println("4.inr to euro");
		System.out.println("5.yen to inr");
		System.out.println("6.inr to yen");
		System.out.println("7.meter to km");
		System.out.println("8.km to meter");
		System.out.println("9.miles to km");
		System.out.println("10.km to nmiles");
		System.out.println("11.hours to minutes");
		System.out.println("12.minutes to hours");
		System.out.println("13.hours to seconds");
		System.out.println("14.seconds to hours");
		System.out.println("exit");
		System.out.print("enter your choice");
		option=sc.nextInt();
		switch(option)
		{	case 1:
				System.out.print("Enter Dollars:");
				a=sc.nextDouble();
				b=CurrencyConverter.dollarToINR(a);
				System.out.printf("%.2f$=%.2fRs \n" , a,b);
				break;
		  	case 2:
		  		System.out.print("Enter INR: ");
		  		a=sc.nextDouble();
		  		b=CurrencyConverter.INRTodollar(a);
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
				b=CurrencyConverter.INRToeuro(a);
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
				b=CurrencyConverter.INRToyen(a);
				System.out.printf("%.2fRs=%.2fyen \n" , a,b);
				break;
			case 7:
				System.out.print("Enter Meters: ");
				a=sc.nextDouble();
				b=DistanceConverter.MeterToKM(a);
				System.out.printf("%.2fm=%.2f kms \n" , a,b);
				break;
			case 8:
				System.out.print("Enter KM: ");
				a=sc.nextDouble();
				b=DistanceConverter.KMToMeter(a);
				System.out.printf("%.2fkms=%.2fm \n" , a,b);
				break;
			case 9:
				System.out.print("Enter MILES: ");
				a=sc.nextDouble();
				b=DistanceConverter.MilesToKM(a);
				System.out.printf("%.2fmiles=%.2fkms \n" , a,b);
				break;
			case 10:
				System.out.print("Enter KM: ");
				a=sc.nextDouble();
				b=DistanceConverter.KMToMiles(a);
				System.out.printf("%.2fkms=%.2fmiles \n" , a,b);
				break;
			case 11:
				System.out.print("Enter Hours: ");
				a=sc.nextDouble();
				b=TimeConverter.hoursTominutes(a);
				System.out.printf("%.2fhes=%.2fmins \n" , a,b);
				break;
			case 12:
				System.out.print("Enter Minutes: ");
				a=sc.nextDouble();
				b=TimeConverter.minutesTohours(a);
				System.out.printf("%.2fmins=%.2fhrs \n" , a,b);
				break;
			case 13:
				System.out.print("Enter Hours: ");
				a=sc.nextDouble();
				b=TimeConverter.hoursToseconds(a);
				System.out.printf("%.2fhrs=%.2fsecs \n" , a,b);
				break;
			case 14:
				System.out.print("Enter Seconds: ");
				a=sc.nextDouble();
				b=TimeConverter.secondsTohours(a);
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