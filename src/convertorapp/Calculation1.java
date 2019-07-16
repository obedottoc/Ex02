package convertorapp;
import java.util.Scanner;
import convertorlibrary.*;
public class Calculation1 {
	public static void main(String[]args) {
		double a,b;
		int option;
		Scanner sc=new Scanner(System.in);
		while(true)
		{ 
			System.out.println("1.dollarTOINR");
			System.out.println("2.INRTOdollar");
			System.out.println("3.euroTOINR");
			System.out.println("4.INRTOeuro");
			System.out.println("5.yenTOINR");
			System.out.println("6.INRTOyen");
			System.out.println("7.metertokm");
			System.out.println("8.kmtometer");
			System.out.println("9.milestokm");
			System.out.println("10.kmtomiles");
			System.out.println("11.hrstomins");
			System.out.println("12.minstohrs");
			System.out.println("13.hrstosec");
			System.out.println("14.sectohrs");
			System.out.println("15.Exit");
			System.out.println("Enter your choice:");
			option=sc.nextInt();
			switch (option)
			{
				case 1:
					System.out.print("enter dollar");
					a=sc.nextDouble();
					b=CurrencyConvertor.dollarTOINR(a);
					System.out.printf("%.2f dollar=%.2f Rupees\n",a,b);
					break;
				case 2:
					System.out.print("INR");
					a=sc.nextDouble();
					b=CurrencyConvertor.INRTOdollar(a);
					System.out.printf("%2f Rupees=%2f$\n",a,b);
					break;
				case 3:
					System.out.print("euro");
					a=sc.nextDouble();
					b=CurrencyConvertor.euroTOINR(a);
					System.out.printf("%.2f euro=%.2f Rupees\n",a,b);
					break;
				case 4:
					System.out.print("INR");
					a=sc.nextDouble();
					b=CurrencyConvertor.INRTOeuro(a);
					System.out.printf("%.2f Rupees=%.2f euro\n",a,b);
					break;
				case 5:
					System.out.print("yen");
					a=sc.nextDouble();
					b=CurrencyConvertor.yenTOINR(a);
					System.out.printf("%.2f yen=%.2f Rupees\n",a,b);
					break;	
				case 6:
					System.out.print("INR");
					a=sc.nextDouble();
					b=CurrencyConvertor.INRTOyen(a);
					System.out.printf("%.2f Rupees=%.2f yen\n",a,b);
					break;	
				case 7:
					System.out.print("meter");
					a=sc.nextDouble();
					b=DistanceConvertor.metertokm(a);
					System.out.printf("%.2f meter=%.2f km\n",a,b);
					break;	
				case 8:
					System.out.print("km");
					a=sc.nextDouble();
					b=DistanceConvertor.kmtometer(a);
					System.out.printf("%.2f km=%.2f meter\n",a,b);
					break;
				case 9:
					System.out.print("miles");
					a=sc.nextDouble();
					b=DistanceConvertor.milestokm(a);
					System.out.printf("%.2f miles=%.2f km\n",a,b);
					break;
				case 10:
					System.out.print("km");
					a=sc.nextDouble();
					b=DistanceConvertor.kmtomiles(a);
					System.out.printf("%.2f km=%.2f miles\n",a,b);
					break;
					
				case 11:
					System.out.print("hrs");
					a=sc.nextDouble();
					b=TimeConvertor.hrstomins(a);
					System.out.printf("%.2f hrs=%.2f mins\n",a,b);
					break;
					
				case 12:
					System.out.print("mins");
					a=sc.nextDouble();
					b=TimeConvertor.minstohrs(a);
					System.out.printf("%.2f mins=%.2f hrs\n",a,b);
					break;
					
				case 13:
					System.out.print("hrs");
					a=sc.nextDouble();
					b=TimeConvertor.hrstosec(a);
					System.out.printf("%.2f hrs=%.2f sec\n",a,b);
					break;
					
					
				case 14:
					System.out.print("sec");
					a=sc.nextDouble();
					b=TimeConvertor.sectohrs(a);
					System.out.printf("%.2f sec=%.2f hrs\n",a,b);
					break;
				case 15:
					break;
					default:
						System.out.println("please enter a vaild number");
			}
					

				if(option==15)
					break;
				}
				
				
			}
			
		}
		
		
	


