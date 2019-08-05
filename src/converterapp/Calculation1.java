/**
 * Application for currency distance and time converter
 * 
 * developed by sandhiya
 * sandhiyasandhiya123@gmail.com
 * 
 * 
 */
package converterapp;

import java.util.Scanner;
import Converterlibrary.*;

public class Calculation1 {

	public static void main(String[] args) {
		double value1,value2;
		int option;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. doiiar to INR conversion");
			System.out.println("2. INR to dollar conversion");
			System.out.println("3. EURO to INR conversion");
			System.out.println("4. INR to EURO conversion");
			System.out.println("5. Yen to INR conversion");
			System.out.println("6. INR to Yenconversion");
			System.out.println("7. meter to kilometer conversion");
			System.out.println("8. kilometer to meter conversion");
			System.out.println("9. kilometer to miles conversion");
			System.out.println("10. miles to kilometer conversion");
			System.out.println("11. hours to minutes conversion");
			System.out.println("12. minutes to hours conversion");
			System.out.println("13. hours to second conversion");
			System.out.println("14. seconds to hours conversion");
			System.out.println("15. exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter number of dollars to convert to INR:");
				value1=sc.nextDouble();
				value2=Currencyconverter.dollartoINR(value1);
				System.out.printf("%.2f dollar(s) is equal to %.2f INR.\n", value1,value2);
				break;
			case 2:
				System.out.print("Enter number of INR to convert to dollar:");
				value1=sc.nextDouble();
				value2=Currencyconverter.INRtodollar(value1);
				System.out.printf("%.2f INR is equal to %.2f dollar.\n", value1,value2);
				break;
			case 3:
				System.out.print("Enter number of EURO to convert to INR:");
				value1=sc.nextDouble();
				value2=Currencyconverter.EUROtoINR(value1);
				System.out.printf("%.2f EURO is equal to %.2f INR.\n", value1,value2);
				break;
			case 4:
				System.out.print("Enter number of INR to convert to EURO:");
				value1=sc.nextDouble();
				value2=Currencyconverter.INRtoEURO(value1);
				System.out.printf("%.2f INR is equal to %.2f EURO.\n", value1,value2);
				break;
			case 5:
				System.out.print("Enter number of Yen to convert to INR:");
				value1=sc.nextDouble();
				value2=Currencyconverter.YentoINR(value1);
				System.out.printf("%.2f Yen is equal to %.2f INR.\n", value1,value2);
				break;
			case 6:
				System.out.print("Enter number of INR to convert to Yen:");
				value1=sc.nextDouble();
				value2=Currencyconverter.INRtoYen(value1);
				System.out.printf("%.2f INR is equal to %.2f Yen.\n", value1,value2);
				break;
			case 7:
				System.out.print("Enter number of meters to convert to kilometer:");
				value1=sc.nextDouble();
				value2=Distanceconverter.metertokilometer(value1);
				System.out.printf("%.2f meter is equal to %.2f kilometer.\n", value1,value2);
				break;
			case 8:
				System.out.print("Enter number of kilometer to convert to meter:");
				value1=sc.nextDouble();
				value2=Distanceconverter.kilometertometer(value1);
				System.out.printf("%.2f kilmeter is equal to %.2f meter.\n", value1,value2);
				break;
			case 9:
				System.out.print("Enter number of kilometer to convert to miles:");
				value1=sc.nextDouble();
				value2=Distanceconverter.kilometertomiles(value1);
				System.out.printf("%.2f kilometer is equal to %.2f miles.\n", value1,value2);
				break;
			case 10:
				System.out.print("Enter number of miles to convert to kilometer:");
				value1=sc.nextDouble();
				value2=Distanceconverter.milestokilometer(value1);
				System.out.printf("%.2f mile(s) is equal to %.2f kilometer.\n", value1,value2);
				break;
			case 11:
				System.out.print("Enter number of minutes to convert to hours:");
				value1=sc.nextDouble();
				value2=Timeconverter.minutestohours(value1);
				System.out.printf("%.2f minute(s) is equal to %.2f hour.\n", value1,value2);
				break;
			case 12:
				System.out.print("Enter number of minute to convert to hours:");
				value1=sc.nextDouble();
				value2=Timeconverter.minutestohours(value1);
				System.out.printf("%.2f   minute(s) is equal to %.2f hours.\n", value1,value2);
				break;
			case 13:
				System.out.print("Enter number of hours to convert to seconds:");
				value1=sc.nextDouble();
				value2=Timeconverter.hourstoseconds(value1);
				System.out.printf("%.2f   hour(s) is equal to %.2f seconds.\n", value1,value2);
				break;
			case 14:
				System.out.print("Enter number of seconds to convert to hours:");
				value1=sc.nextDouble();
				value2=Timeconverter.secondstohours(value1);
				System.out.printf("%.2f second(s) is equal to %.2f hours.\n", value1,value2);
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