package converterapp;
import java.util.Scanner;
import converterlibrary.*;
public class Calculation1 
{
	public static void main(String[]args)
	{
		double get1,get2;
		int select;
		Scanner x=new Scanner(System.in);
		do
		{
		

		System.out.println("1.dollar-INR conversion");
		System.out.println("2.INR-dollar conversion");
		System.out.println("3.euro-INR conversion");
		System.out.println("4.INR-euro conversion");
		System.out.println("5.yen-INR conversion");
		System.out.println("6.INR-yen conversion");
		System.out.println("7.meter-kilometer conversion");
		System.out.println("8.kilometer-meter conversion");
		System.out.println("9.miles-kilometer conversion");
		System.out.println("10.kilometer-miles conversion");
		System.out.println("11.hours-minutes conversion");
		System.out.println("12.minutes-hours conversion");
		System.out.println("13.hours-seconds conversion");
		System.out.println("14.seconds-hours conversion");
		System.out.println("ENTER THE REQUIRED CONVERSION OPTION ");
		
		select=x.nextInt();
		if(select==1)
		{
			System.out.println("enter the dollar value");
			get1=x.nextFloat();
			get2=CurrencyConverter.dollartoINR(get1);
			System.out.println("INR equals to :"+get2);
		}
		if(select==2)
		{
			System.out.println("enter the INR value");
			get1=x.nextFloat();
			get2=CurrencyConverter.INRtodollar(get1);
			System.out.println("dollar equals to :"+get2);
		}
		if(select==3)
		{
			System.out.println("enter the euro value");
			get1=x.nextFloat();
			get2=CurrencyConverter.eurotoINR(get1);
			System.out.println("INR equals to :"+get2);
		}
		if(select==4)
		{
			System.out.println("enter the INR value");
			get1=x.nextFloat();
			get2=CurrencyConverter.INRtoeuro(get1);
			System.out.println("euro equals to :"+get2);
		}
		if(select==5)
		{
			System.out.println("enter the yen value");
			get1=x.nextFloat();
			get2=CurrencyConverter.yentoINR(get1);
			System.out.println("INR equals to :"+get2);
		}
		if(select==6)
		{
			System.out.println("enter the INR value");
			get1=x.nextFloat();
			get2=CurrencyConverter.INRtoyen(get1);
			System.out.println("yen equals to :"+get2);
		}
		if(select==7)
		{
			System.out.println("enter the meter value");
			get1=x.nextFloat();
			get2=DistanceConverter.metertokilometer(get1);
			System.out.println("kilometer equals to :"+get2);
		}
		if(select==8)
		{
			System.out.println("enter the kilometer value");
			get1=x.nextFloat();
			get2=DistanceConverter.kilometertometer(get1);
			System.out.println("meter equals to :"+get2);
		}
		if(select==9)
		{
			System.out.println("enter the miles value");
			get1=x.nextFloat();
			get2=DistanceConverter.miletokilometer(get1);
			System.out.println("kilometer equals to :"+get2);
		}
		if(select==10)
		{
			System.out.println("enter the kilometer value");
			get1=x.nextFloat();
			get2=DistanceConverter.kilometertomile(get1);
			System.out.println("mile equals to :"+get2);
		}
		if(select==11)
		{
			System.out.println("enter the hours value");
			get1=x.nextFloat();
			get2=TimeConverter.hourstominutes(get1);
			System.out.println("minutes equals to :"+get2);
		}
		if(select==12)
		{
			System.out.println("enter the minutes value");
			get1=x.nextFloat();
			get2=TimeConverter.minutestohours(get1);
			System.out.println("hours equals to :"+get2);
		}
		if(select==13)
		{
			System.out.println("enter the hours value");
			get1=x.nextFloat();
			get2=TimeConverter.hourstoseconds(get1);
			System.out.println("seconds equals to :"+get2);
		}
		if(select==14)
		{
			System.out.println("enter the seconds value");
			get1=x.nextFloat();
			get2=TimeConverter.secondstohours(get1);
			System.out.println("hours equals to :"+get2);
		}
	
		}while(select!=0);
	
	}	
}

