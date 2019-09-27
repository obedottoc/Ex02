
/****
 * Program for electricity bills
 * devloped by Mari bhagavathi.T
 * mari36mars@gmail.com
 */
package converterapp;

import java.util.Scanner;

import converterlibrary.*;

public class Calculation1 {
public static void main (String [] args) {
double value1,value2;
int option;
Scanner sc=new Scanner(System.in);
while (true)
{
System.out.println("1.dollar to INR conversion");
System.out.println("2.INR to dollar conversion");
System.out.println("3.eURO to INR conversion");
System.out.println("4.INR to eURO conversion");
System.out.println("5.yen to INR conversion");
System.out.println("6.INR to yen conversion");
System.out.println("7.meter yo KM conversion");
System.out.println("8.KM to meter conversion");
System.out.println("9.miles to KM conversion");
System.out.println("10.KM to miles conversion");
System.out.println("11.hours to minuites conversion");
System.out.println("12.minuites to hours conversion");
System.out.println("13.hours to Seconds conversion");
System.out.println("14.Seconds to hours conversion");
System.out.println("15.Exit");
System.out.println("Enter your choice");
option=sc.nextInt();
switch (option)
{
case 1:
System.out.print("Enter currency in dollar");
value1=sc.nextDouble();
value2=CurrencyConverter.dollartoINR(value1);
System.out.printf("%.2f dollar is equal to %.2f INR ./n",value1,value2);
break;
case 2: 
System.out.print("Enter currency in INR");
value1=sc.nextDouble();
value2=CurrencyConverter.INRtodollar(value1);
System.out.printf("%.2f INR is equal to %.2f dollar ./n",value1,value2);
break;
case 3:
System.out.print("Enter currency in eURo");
value1=sc.nextDouble();
value2=CurrencyConverter.eUROtoINR(value1);
System.out.printf("%.2f eURO is equal to %.2f INR ./n",value1,value2);
break;
case 4:
System.out.print("Enter currency in INR");
value1=sc.nextDouble();
value2=CurrencyConverter.INRtoeURO(value1);
System.out.printf("%.2f INR is equal to %.2f eURO ./n",value1,value2);
break;
case 5:
System.out.print("Enter currency in yen");
value1=sc.nextDouble();
value2=CurrencyConverter.yentoINR(value1);
System.out.printf("%.2f yen is equal to %.2f INR ./n",value1,value2);
break;
case 6:
System.out.print("Enter currency in INR");
value1=sc.nextDouble();
value2=CurrencyConverter.INRtoyen(value1);
System.out.printf("%.2f INR is equal to %.2f yen ./n",value1,value2);
break;
case 7:
System.out.print("Enter distance in meter");
value1=sc.nextDouble();
value2=DistanceConverter.metertoKM(value1);
System.out.printf("%.2f meter is equal to %.2f KM ./n",value1,value2);
break;
case 8:
System.out.print("Enter distance in KM");
value1=sc.nextDouble();
value2=DistanceConverter.KMtometer(value1);
System.out.printf("%.2f KM is equal to %.2f meter ./n",value1,value2);
break;
case 9:
System.out.print("Enter distance in miles");
value1=sc.nextDouble();
value2=DistanceConverter.milestoKM(value1);
System.out.printf("%.2f miles is equal to %.2f KM ./n",value1,value2);
break;
case 10:
System.out.print("Enter distance in KM");
value1=sc.nextDouble();
value2=DistanceConverter.KMtomiles(value1);
System.out.printf("%.2f KM is equal to %.2f miles ./n",value1,value2);
break;
case 11:
System.out.print("Enter time in hours");
value1=sc.nextDouble();
value2=TimeConverter.hourstominuites(value1);
System.out.printf("%.2f hours is equal to %.2f minuites ./n",value1,value2);
break;
case 12:
System.out.print("Enter time in minuites");
value1=sc.nextDouble();
value2=TimeConverter.minuitestohours(value1);
System.out.printf("%.2f minuites is equal to %.2f hours ./n",value1,value2);
break;
case 13:
System.out.print("Enter time in hours");
value1=sc.nextDouble();
value2=TimeConverter.hourstoSeconds(value1);
System.out.printf("%.2f hours is equal to %.2f Seconds ./n",value1,value2);
break;
case 14:
System.out.print("Enter time in Seconds");
value1=sc.nextDouble();
value2=TimeConverter.Secondstohours(value1);
System.out.printf("%.2f Seconds is equal to %.2f hours ./n",value1,value2);
break;
case 15:
System.out.print("Thankyou for using Converter application!!");
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

