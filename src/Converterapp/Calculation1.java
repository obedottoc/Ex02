/**
1 * Application for area and length conversion
 * 
 * developed by suriyakumar
 * sksuri01@gmail.com
 * 212217105057

 */
package Converterapp;

import java.util.Scanner;
import converterlibrary.*;
public class Calculation1 {

	public static void main(String[] args) {
		double value1,value2;
		int option;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. dollar to inr");
			System.out.println("2. inr to dollar");
			System.out.println("3. euro to inr");
			System.out.println("4. inr to euro ");
			System.out.println("5. yen to inr");
			System.out.println("6. inr to yen");
			System.out.println("7. meter to km");
			System.out.println("8. km to meter ");
			System.out.println("9. miles to km");
			System.out.println("10.km to miles");
			System.out.println("11. hours to mins");
			System.out.println("12. mins to hours");
			System.out.println("13.hours to sec ");
			System.out.println("14. sec to hours");
			System.out.println("15. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter moneyin doller:");
				value1=sc.nextDouble();
				value2=MoneyConverter.dollarToinr(value1);
				System.out.printf("%.2f dolleris equal to %.2f inr.\n", value1,value2);
				break;
			case 2:
				System.out.print("Enter money  in inr:");
				value1=sc.nextDouble();
				value2=MoneyConverter.inrTodollar(value1);
				System.out.printf("%.2f inr is equal to %.2f dollar.\n", value1,value2);
				break;	
			case 3:
				System.out.print("Enter money  in euro:");
				value1=sc.nextDouble();
				value2=MoneyConverter.euroToinr(value1);
				System.out.printf("%.2f eurois equal to %.2f inr.\n", value1,value2);
				break;
			case 4:
				System.out.print("Enter money  in inr:");
				value1=sc.nextDouble();
				value2=MoneyConverter.inrToeuro(value1);
				System.out.printf("%.2f inris equal to %.2f euro.\n", value1,value2);
				break;
			case 5:
				System.out.print("Enter money  in yen:");
				value1=sc.nextDouble();
				value2=MoneyConverter.yenToinr(value1);
				System.out.printf("%.2f yenis equal to %.2f inr.\n", value1,value2);
				break;
			case 6:
				System.out.print("Enter money  in inr:");
				value1=sc.nextDouble();
				value2=MoneyConverter.inrToyen(value1);
				System.out.printf("%.2f inris equal to %.2f yen.\n", value1,value2);
				break;
			case 7:
				System.out.print("Enter distance in meter:");
				value1=sc.nextDouble();
				value2=DistanceConverter.kmTometer(value1);
				System.out.printf("%.2f meteris equal to %.2f km.\n", value1,value2);
				break;
			case 8:
				System.out.print("Enter distance in km:");
				value1=sc.nextDouble();
				value2=DistanceConverter.meterTokm(value1);
				System.out.printf("%.2f kmis equal to %.2f meter.\n", value1,value2);
				break;
			case 9:
				System.out.print("Enter distance in miles:");
				value1=sc.nextDouble();
				value2=DistanceConverter.milesTokm(value1);
				System.out.printf("%.2f milesis equal to %.2f km.\n", value1,value2);
				break;
			case 10:
				System.out.print("Enter distance in km:");
				value1=sc.nextDouble();
				value2=DistanceConverter.kmTomiles(value1);
				System.out.printf("%.2f kmis equal to %.2f miles.\n", value1,value2);
				break;
			case 11:
				System.out.print("Enter time in hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.hoursTomins(value1);
				System.out.printf("%.2f hoursis equal to %.2f mins.\n", value1,value2);
				break;
			case 12:
				System.out.print("Enter time in mins:");
				value1=sc.nextDouble();
				value2=TimeConverter.minsTohours(value1);
				System.out.printf("%.2f minsis equal to %.2f hours.\n", value1,value2);
				break;
			case 13:
				System.out.print("Enter time in hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.hoursTosec(value1);
				System.out.printf("%.2f hoursis equal to %.2f sec.\n", value1,value2);
				break;
			case 14:
				System.out.print("Enter time in sec:");
				value1=sc.nextDouble();
				value2=TimeConverter.secTohours(value1);
				System.out.printf("%.2f secis equal to %.2f hours.\n", value1,value2);
				break;
            case 15:
				System.out.println("Thankyou for using converter application !!!");
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
