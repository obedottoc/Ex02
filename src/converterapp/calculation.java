


/**
 * Application for area and length conversion
 * 
 * developed by
 * tamilfreakz002@gmail.com
 * saveetha engineering college 
 * tamilfreakz002@gmail.com
 * 
 */
package converterapp;

import java.util.Scanner;
import converterlibrary.*;

public class calculation {

	public static void main(String[] args) {
		double value1,value2;
		int option;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. DOLLAR to INR conversion");
			System.out.println("2. INR to DOLLAR conversion");
			System.out.println("3. EURO to INR conversion");
			System.out.println("4. INR to EURO conversion");
			System.out.println("5. meter to KM conversion");
			System.out.println("6. KM to meter conversion");
			System.out.println("7. hours to minutes conversion");
			System.out.println("8. minutes to hours conversion");
			System.out.println("9. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter amount in dollar:");
				value1=sc.nextDouble();
				value2=currencyconverter.dollartoINR(value1);
				System.out.printf("%.2f dollar amount is equal to %.2f INR.\n", value1,value2);
				break;
			case 2:
				System.out.print("Enter amount in INR:");
				value1=sc.nextDouble();
				value2=currencyconverter.INRtodollar(value1);
				System.out.printf("%.2f INR amount is equal to %.2f dollar.\n", value1,value2);
				break;	
			case 3:
				System.out.print("Enter amount in EURO:");
				value1=sc.nextDouble();
				value2=currencyconverter.EUROtoINR(value1);
				System.out.printf("%.2f EURO amount is equal to %.2f INR.\n", value1,value2);
				break;
			case 4:
				System.out.print("Enter amount in INR:");
				value1=sc.nextDouble();
				value2=currencyconverter.INRtoEURO(value1);
				System.out.printf("%.2f INR amount is equal to %.2f EURO.\n", value1,value2);
				break;
			case 5:
				System.out.print("Enter length in meter:");
				value1=sc.nextDouble();
				value2=lengthconverter.metertoKM(value1);
				System.out.printf("%.2f  meter is equal to %.2f KM.\n", value1,value2);
				break;
			case 6 :
				System.out.print("Enter length in KM:");
				value1=sc.nextDouble();
				value2=lengthconverter.KMtometer(value1);
				System.out.printf("%.2f  KM is equal to %.2f meter.\n", value1,value2);
				break;
			case 7:
				System.out.print("Enter time in hours:");
				value1=sc.nextDouble();
				value2=timeconverter.hourstominutes(value1);
				System.out.printf("%.2f  hours is equal to %.2f minutes.\n", value1,value2);
				break;
			case 8:
				System.out.print("Enter time in minutes:");
				value1=sc.nextDouble();
				value2=timeconverter.minutestohours(value1);
				System.out.printf("%.2f  minutes is equal to %.2f hours.\n", value1,value2);
				break;
						
			case 9:	
				System.out.println("Thankyou for using converter application !!!");
				break;
			default:
				System.out.print("Please enter a valid number !!!");
			}
			
			if(option==9)
			{		
				break;
			}
		}

	}

}

