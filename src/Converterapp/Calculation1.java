package Converterapp;

import java.util.Scanner;

import converterlibrary.*;

public class Calculation1{

	public static void main(String[] args) {
		double value1,value2;
		int option;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. DollartoInr conversion");
			System.out.println("2. InrtoDollar conversion");
			System.out.println("3. EurotoInr conversion");
			System.out.println("4. InrtoEuro conversion");
			System.out.println("5. YentoInr conversion");
			System.out.println("6. InrtoYen conversion");
			System.out.println("7. MetertoKm conversion");
			System.out.println("8. KmtoMeter conversion");
			System.out.println("9. MilestoKm conversion");
			System.out.println("10. KmtoMiles conversion");
			System.out.println("11. HourstoMinutes conversion");
			System.out.println("12. MinutestoHours conversion");
			System.out.println("13. HourstoSeconds conversion");
			System.out.println("14. SecondstoHours conversion");
			System.out.println("15. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter currency in Dollar:");
				value1=sc.nextDouble();
				value2=MoneyConverter.DollartoInr(value1);
				System.out.printf("%.2f Dollar is equal to %.2f Inr.\n", value1,value2);
				break;
			case 2:
				System.out.print("Enter currency in Inr:");
				value1=sc.nextDouble();
				value2=MoneyConverter.InrtoDollar(value1);
				System.out.printf("%.2f Inr is equal to %.2f Dollar.\n", value1,value2);
				break;
			case 3:
				System.out.print("Enter Currency in Euro:");
				value1=sc.nextDouble();
				value2=MoneyConverter.EurotoInr(value1);
				System.out.printf("%.2f Euro is equal to %.2f Inr.\n", value1,value2);
				break;
			case 4:
				System.out.print("Enter Currency in Inr:");
				value1=sc.nextDouble();
				value2=MoneyConverter.InrtoEuro(value1);
				System.out.printf("%.2f Inr is equal to %.2f Euro.\n", value1,value2);
				break;
			case 5:
				System.out.print("Enter Currency in Yen:");
				value1=sc.nextDouble();
				value2=MoneyConverter.YentoInr(value1);
				System.out.printf("%.2f Yen is equal to %.2f Inr.\n", value1,value2);
				break;
			case 6:
				System.out.print("Enter Currency in Inr:");
				value1=sc.nextDouble();
				value2=MoneyConverter.InrtoYen(value1);
				System.out.printf("%.2f Inr is equal to %.2f Yen.\n", value1,value2);
				break;
			case 7:
				System.out.print("Enter Distance in Meter:");
				value1=sc.nextDouble();
				value2=DistanceConverter.MetertoKm(value1);
				System.out.printf("%.2f Meter is equal to %.2f Km.\n", value1,value2);
				break;
			case 8:
				System.out.print("Enter Distance in Km:");
				value1=sc.nextDouble();
				value2=DistanceConverter.KmtoMeter(value1);
				System.out.printf("%.2f Km is equal to %.2f Meter.\n", value1,value2);
				break;
			case 9:
				System.out.print("Enter Distance in Miles:");
				value1=sc.nextDouble();
				value2=DistanceConverter.MilestoKm(value1);
				System.out.printf("%.2f Miles is equal to %.2f Km.\n", value1,value2);
				break;	
			case 10:
				System.out.print("Enter Distance in Km:");
				value1=sc.nextDouble();
				value2=DistanceConverter.KmtoMiles(value1);
				System.out.printf("%.2f Km is equal to %.2f Miles.\n", value1,value2);
				break;
			case 11:
				System.out.print("Enter Time in Hours :");
				value1=sc.nextDouble();
				value2=TimeConverter.HourstoMinutes(value1);
				System.out.printf("%.2f Hours is equal to %.2f Minutes.\n", value1,value2);
				break;
			case 12:
				System.out.print("Enter Timein Minutes:");
				value1=sc.nextDouble();
				value2=TimeConverter.MinutestoHours(value1);
				System.out.printf("%.2f Minutes is equal to %.2f Hours.\n", value1,value2);
				break;
			case 13:
				System.out.print("Enter Time in Hours:");
				value1=sc.nextDouble();
				value2=TimeConverter.HourstoSeconds(value1);
				System.out.printf("%.2f Hours is equal to %.2f Seconds.\n", value1,value2);
				break;
			case 14:
				System.out.print("Enter Time in Seconds:");
				value1=sc.nextDouble();
				value2=TimeConverter.SecondstoHours(value1);
				System.out.printf("%.2f Seconds is equal to %.2f Hours.\n", value1,value2);
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