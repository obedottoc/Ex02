//*created by Akhshy Ganesh B
// currency converter , time converter, distance converter
// G.Mail : akhshyganeshb@gmail.com

package converterapp;

import java.util.Scanner;

import converterlibrary.CurrencyConverter;
import converterlibrary.DistanceConverter;
import converterlibrary.TimeConverter;

public class calculation1 {

	public static void main(String[] args) {
		double value1,value2;
		int option;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Dollar to Inr: ");
			System.out.println("2.Inr to Dollar: ");
			System.out.println("3.Euro to Inr: ");
			System.out.println("4.Inr to euro: ");
			System.out.println("5.Yen to Inr: ");
			System.out.println("6.Inr to Yen: ");
			System.out.println("7.Meter to Km: ");
			System.out.println("8.Km to Meter: ");
			System.out.println("9.Miles to Km: ");
			System.out.println("10.Km to miles: ");
			System.out.println("11.Hours to Minutes: ");
			System.out.println("12.Minutes to Hours: ");
			System.out.println("13.Hours to Seconds: ");
			System.out.println("14.Seconds to Hours: ");
			System.out.println("15.EXIT!!!!!!!!!");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{ case 1:
				System.out.print("Enter Dollar: ");
				value1=sc.nextDouble();
				value2=CurrencyConverter.dollartoInr(value1);
				System.out.printf("%.2fDollar =%.2fRupees \n" , value1,value2);
				break;
			case 2:
				System.out.printf("Enter Inr: ");
				value1=sc.nextDouble();
				value2=CurrencyConverter.Inrtodollar(value1);
				System.out.printf("%.2fRupee= %.2fDollar \n" , value1,value2);
				break;
			case 3:
				System.out.printf("Enter Euro: ");
				value1=sc.nextDouble();
				value2=CurrencyConverter.eurotoInr(value1);
				System.out.printf("%.2feuro= %.2fRupee \n" , value1,value2);
				break;
			case 4:
				System.out.printf("Enter Inr: ");
				value1=sc.nextDouble();
				value2=CurrencyConverter.Inrtoeuro(value1);
				System.out.printf("%.2fRupee= %.2feuro \n" , value1,value2);
				break;
			case 5:
				System.out.printf("Enter yen: ");
				value1=sc.nextDouble();
				value2=CurrencyConverter.yentoInr(value1);
				System.out.printf("%.2fyen= %.2frupee \n" , value1,value2);
				break;
			case 6:
				System.out.printf("Enter Inr: ");
				value1=sc.nextDouble();
				value2=CurrencyConverter.Inrtoyen(value1);
				System.out.printf("%.2fRupee= %.2fyen \n" , value1,value2);
				break;
			case 7:
				System.out.printf("Enter Meter: ");
				value1=sc.nextDouble();
				value2=DistanceConverter.metertokm(value1);
				System.out.printf("%.2fMeter= %.2fKm \n" , value1,value2);
				break;
			case 8:
				System.out.printf("Enter Km: ");
				value1=sc.nextDouble();
				value2=DistanceConverter.kmtometer(value1);
				System.out.printf("%.2fKm=%.2fMeter  \n" , value1,value2);
				break;
			case 9:
				System.out.printf("Enter miles: ");
				value1=sc.nextDouble();
				value2=DistanceConverter.milestokm(value1);
				System.out.printf("%.2fmiles= %.2fKm \n" , value1,value2);
				break;
			case 10:
				System.out.printf("Enter Km: ");
				value1=sc.nextDouble();
				value2=DistanceConverter.kmtomiles(value1);
				System.out.printf("%.2fKm= %.2fmiles \n" , value1,value2);
				break;
			case 11:
				System.out.printf("Enter Hours: ");
				value1=sc.nextDouble();
				value2=TimeConverter.hourstominutes(value1);
				System.out.printf("%.2fHours= %.2fminutes \n" , value1,value2);
				break;
			case 12:
				System.out.printf("Enter Minute: ");
				value1=sc.nextDouble();
				value2=TimeConverter.minutestohours(value1);
				System.out.printf("%.2feuro= %.2fRupee \n" , value1,value2);
				break;
			case 13:
				System.out.printf("Enter Hours: ");
				value1=sc.nextDouble();
				value2=TimeConverter.hourstoseconds(value1);
				System.out.printf("%.2fhours= %.2fsecond \n" , value1,value2);
				break;
			case 14:
				System.out.printf("Enter Seconds: ");
				value1=sc.nextDouble();
				value2=TimeConverter.secondstohours(value1);
				System.out.printf("%.2fSeconds= %.2fHours \n" , value1,value2);
				break;
			case 15:
				break;
				default:
					System.out.println("please Enter a valid number: ");
			}
			if(option==15)
				break;
		}
	}
}

