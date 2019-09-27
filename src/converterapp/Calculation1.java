/**
 * Application for area and length conversion
 * 
 * developed by Mohan Raj c
 * cvmohanraj3@gmail.com
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
			System.out.println("1. dollar to INR conversion");
			System.out.println("2. INR to dollar conversion");
			System.out.println("3. euro to INR conversion");
			System.out.println("4. INR to euro conversion");
			System.out.println("5. yen to INR conversion");
			System.out.println("6. INR to yen conversion");
			System.out.println("7. meter to km conversion");
			System.out.println("8. km to meter conversion");
			System.out.println("9. miles to km conversion");
			System.out.println("10. km to miles conversion");
			System.out.println("11. hours to mins conversion");
			System.out.println("12. mins to hours conversion");
			System.out.println("13. hours to sec conversion");
			System.out.println("14. sec to hours conversion");
			System.out.println("15. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter currency in dollar:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.dollarToINR(value1);
				System.out.printf("%.2f dollor is equal to %.2f INR.\n", value1,value2);
				break;
			case 2:
				System.out.print("Enter currency in INR:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.INRTodollar(value1);
				System.out.printf("%.2f INR is equal to %.2f dollar.\n", value1,value2);
				break;	
			case 3:
				System.out.print("Enter currency in euro:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.euroToINR(value1);
				System.out.printf("%.2f euro is equal to %.2f INR.\n", value1,value2);
				break;
			case 4:
				System.out.print("Enter currency in INR:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.INRToeuro(value1);
				System.out.printf("%.2f INR is equal to %.2f euro.\n", value1,value2);
				break;
			case 5:
				System.out.print("Enter currency in yen:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.yenToINR(value1);
				System.out.printf("%.2f yen is equal to %.2f INR.\n", value1,value2);
				break;
			case 6:
				System.out.print("Enter currency in INR:");
				value1=sc.nextDouble();
				value2=CurrencyConverter.INRToyen(value1);
				System.out.printf("%.2f INR is equal to %.2f yen.\n", value1,value2);
				break;	
			case 7:
				System.out.print("Enter distance in meter:");
				value1=sc.nextDouble();
				value2=DistanceConverter.meterTokm(value1);
				System.out.printf("%.2f meter is equal to %.2f km.\n", value1,value2);
				break;
			case 8:
				System.out.print("Enter distance in km:");
				value1=sc.nextDouble();
				value2=DistanceConverter.kmTometer(value1);
				System.out.printf("%.2f km is equal to %.2f meter.\n", value1,value2);
				break;	
			case 9:
				System.out.print("Enter distance in mile:");
				value1=sc.nextDouble();
				value2=DistanceConverter.mileTokm(value1);
				System.out.printf("%.2f mile is equal to %.2f km.\n", value1,value2);
				break;	
			case 10:
				System.out.print("Enter distance in km:");
				value1=sc.nextDouble();
				value2=DistanceConverter.kmTomile(value1);
				System.out.printf("%.2f km is equal to %.2f mile.\n", value1,value2);
				break;	
			case 11:
				System.out.print("Enter time in hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.hoursTomins(value1);
				System.out.printf("%.2f hours is equal to %.2f mins.\n", value1,value2);
				break;
			case 12:
				System.out.print("Enter time in mins:");
				value1=sc.nextDouble();
				value2=TimeConverter.minsTohours(value1);
				System.out.printf("%.2f km is equal to %.2f meter.\n", value1,value2);
				break;	
			case 13:
				System.out.print("Enter time in hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.hoursTosec(value1);
				System.out.printf("%.2f hours is equal to %.2f sec.\n", value1,value2);
				break;	
			case 14:
				System.out.print("Enter time in sec:");
				value1=sc.nextDouble();
				value2=TimeConverter.secTohours(value1);
				System.out.printf("%.2f sec is equal to %.2f hours.\n", value1,value2);
				break;	
			case 15:
				System.out.println("Thankyou for using converter application !!!");
				break;
			default:
				System.out.print("Please enter a valid number !!!");
			}
			
			if(option==5)
			{		
				break;
			}
		}

	}

}
