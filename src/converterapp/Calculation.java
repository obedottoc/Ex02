/**
 * Application for currency distance and time conversion
 * 
 * developed by
 * karthikbhaskar2000@gmail.com
 * 
 * 
 */
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
			System.out.println("1.  dollar to INR conversion");
			System.out.println("2.  INR to dollar conversion");
			System.out.println("3.  EURO to INR conversion");
			System.out.println("4.  INR to EURO conversion");
			System.out.println("5.  yen to INR");
			System.out.println("6.  INR to yen");
			System.out.println("7.  meter to kilometer");
			System.out.println("8.  kilometer to meter");
			System.out.println("9.  miles to kilometer");
			System.out.println("10. kilometer to miles");
			System.out.println("11. hours to minutes");
			System.out.println("12. minutes to hours");
			System.out.println("13. hours to seconds");
			System.out.println("14. seconds to hours");
			System.out.println("15. exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter the number of dollars to convert to INR :");
				value1=sc.nextDouble();
				value2=CurrencyConverter.dollartoINR(value1);
				System.out.printf("%.2f dollar(s) is equal to %.2f INR.\n", value1,value2);
				break;
			case 2:
				System.out.print("Enter the INR to convert to dollar:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.INRtodollar(value1);
				System.out.printf("%.2f INR is equal to %.2f dollar(s).\n", value1,value2);
				break;	
			case 3:
				System.out.print("Enter the number of EURO to convert to INR:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.EUROtoINR(value1);
				System.out.printf("%.2f EURO is equal to %.2f INR.\n", value1,value2);			
				break;
			case 4:
				System.out.print("Enter the INR to convert to EURO:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.INRtoEURO(value1);
				System.out.printf("%.2f   INR is equal to %.2f EURO.\n", value1,value2);			
				break;
			case 5:
				System.out.print("Enter the number of yen to convert to INR:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.yentoINR(value1);
				System.out.printf("%.2f yen is equal to %.2f INR.\n", value1,value2);			
				break;
			case 6:
				System.out.print("Enter the INR to convert to yen:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.INRtoyen(value1);
				System.out.printf("%.2f  INR is equal to %.2f yen.\n", value1,value2);
			case 7:
				System.out.print("Enter the number of meters to convert to kilometer:");
				value1=sc.nextDouble();
				value2=DistanceConverter.metertokilometer(value1);
				System.out.printf("%.2f  meter(s) is equal to %.2f kilometers.\n", value1,value2);			
				break;
			case 8:
				System.out.print("Enter the number of kilometers to convert to meter:");
				value1=sc.nextDouble();
				value2=DistanceConverter.kilometertometer(value1);
				System.out.printf("%.2f  kilometer(s) is equal to %.2f meters.\n", value1,value2);			
				break;
			case 9:
				System.out.print("Enter the number of miles to convert to kilometer:");
				value1=sc.nextDouble();
				value2=DistanceConverter.milestokilometer(value1);
				System.out.printf("%.2f  mile(s) is equal to %.2f kilometers.\n", value1,value2);			
				break;
			case 10:
				System.out.print("Enter the number of kilometers to convert to miles:");
				value1=sc.nextDouble();
				value2=DistanceConverter.kilometertomiles(value1);
				System.out.printf("%.2f kilometer(s) is equal to %.2f miles.\n", value1,value2);			
				break;
			case 11:
				System.out.print("Enter the number of hours to convert to minutes:");
				value1=sc.nextDouble();
				value2=TimeConverter.hourstominutes(value1);
				System.out.printf("%.2f  hour(s) is equal to %.2f minutes.\n", value1,value2);			
				break;
			case 12:
				System.out.print("Enter the number of minutes to hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.minutestohours(value1);
				System.out.printf("%.2f  minute(s) is equal to %.2f hours.\n", value1,value2);			
				break;
			case 13:
				System.out.print("Enter the number of hours to convert to seconds:");
				value1=sc.nextDouble();
				value2=TimeConverter.hourstoseconds(value1);
				System.out.printf("%.2f hour(s) is equal to %.2f seconds .\n", value1,value2);			
				break;
			case 14:
				System.out.print("Enter the number of seconds to convert to hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.secondstohours(value1);
				System.out.printf("%.2f second(s) is equal to %.2f hours.\n", value1,value2);			
				break;
			case 15:
				System.out.println("Thankyou for using converter application !!!");
				break;
			default:
				System.out.print("Please enter a valid number !!! ");
			}
			
			if(option==15)
			{		
				break;
			}
		}

	}

}
