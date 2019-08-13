package Converterapp;

import java.util.Scanner;

import Converterlibrary.*;

public class Calculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b;
int option;
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("1.dollartoINR");
	System.out.println("2.INRtodollar");
	System.out.println("3.eurotoINR");
	System.out.println("4.INRtoeuro");
	System.out.println("5.yentoINR");
	System.out.println("6.INRtoyen");
	System.out.println("7.metertoKM");
	System.out.println("8.KMtometer");
	System.out.println("9.milestoKM");
	System.out.println("10.KMtomiles");
	System.out.println("11.hourstominutes");
	System.out.println("12.minutestohours");
	System.out.println("13.hourstoseconds");
	System.out.println("14.secondstohours");
	System.out.println("15.Exit");
	System.out.print("Enter your choice:");
	option=sc.nextInt();
	switch(option)
	{
		case 1:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 2:
			System.out.print("INR?");
			a=sc.nextDouble();
			b=CurrencyConverter.INRtodollar(a);
			System.out.printf("%2f rupees=%2f$/n",a,b);
			break;
		case 3:
			System.out.print("euro?");
			a=sc.nextDouble();
			b=CurrencyConverter.eurotoINR(a);
			System.out.printf("%2f euro=%2fRS/n",a,b);
			break;
		case 4:
			System.out.print("INR?");
			a=sc.nextDouble();
			b=CurrencyConverter.INRtoeuro(a);
			System.out.printf("%2fRs=%2feuros,/n",a,b);
			break;
		case 5:
			System.out.print("yen");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 6:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 7:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 8:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 9:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 10:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 11:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 12:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 13:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
		case 14:
			System.out.print("Enter dollars:");
			a=sc.nextDouble();
			b=CurrencyConverter.dollartoINR(a);
			System.out.printf("7.2f dollars=%2fRupees,/n",a,b);
			break;
	
	
	}
}

	}

}
