package converterapp;
import java.util.Scanner;
import converterlibrary.*;
import converterlibrary.currencyconverter;
public class calculation1 {
	public static void main(String[]args) {
		double a,b;
		int option;
		Scanner sc=new Scanner(System.in);
				while(true)
				{
			System.out.println("1.dollartoinr");		
			System.out.println("2.inrtodollar");
			System.out.println("3.eurotoinr");
		    System.out.println("4.inrtoeuro");
		    System.out.println("5.yentoinr");
		    System.out.println("6.inrtoyen");
		    System.out.println("7.metertokm");
		    System.out.println("8.kmtometer");
		    System.out.println("9.milestokm");
		    System.out.println("10.kmtomiles");
		    System.out.println("11.hourstominutes");
		    System.out.println("12.minutestohours");
		    System.out.println("13.hourstoseconds");
		    System.out.println("14.secondstohours");
		    System.out.println("15.exit");
		    System.out.println("Enter your choice:");
		    option=sc.nextInt();
		    switch(option)
		    {
		    case 1:
		          System.out.print("Enter dollars:");
		          a=sc.nextDouble();
		          b=currencyconverter.dollartoinr(a);
		           System.out.printf("%2fdollars=%2frupees\n",a,b);
		    break;
		    case 2:
		        System.out.print("inr?");
		        a=sc.nextDouble();
		        b=currencyconverter.inrToDollar(a);
		        System.out.printf("%2frupees=%2frupees\n",a,b);
		    break;
		    case 3:
			    System.out.print("euro?:");
			    a=sc.nextDouble();
			    b=currencyconverter.eurotoinr(a);
			    System.out.printf("%2feuro=%2frupees\n",a,b);
			    break;
			case 4:
			    System.out.print("inr?");
			    a=sc.nextDouble();
			    b=currencyconverter.inrtoeuro(a);
			    System.out.printf("%2frupees=%2feuro\n",a,b);
			    break;
			case 5:
			    System.out.print("yen?");
			    a=sc.nextDouble();
			    b=currencyconverter.yentoinr(a);
			    System.out.printf("%2fyen=%2finr\n",a,b);
			    break;
			case 6:
			    System.out.print("inr?");
			    a=sc.nextDouble();
			    b=currencyconverter.inrtoyen(a);
			    System.out.printf("%2frupees=%2fyen\n",a,b);
			    break;
			case 7:
			    System.out.print("meters?");
			    a=sc.nextDouble();
			    b=Distanceconverter.metertokm(a);
			    System.out.printf("%2fmeter=%2fkm\n",a,b);
			    break;
			case 8:
			    System.out.print("km?");
			    a=sc.nextDouble();
			    b=Distanceconverter.kmtometer(a);
			    System.out.printf("%2fkm=%2fmeter\n",a,b);
			    break;
			case 9:
			    System.out.print("miles?");
			    a=sc.nextDouble();
			    b=Distanceconverter.milestokm(a);
			    System.out.printf("%2fmiles=%2fkm\n",a,b);
			    break;
			case 10:
			    System.out.print("km?");
			    a=sc.nextDouble();
			    b=Distanceconverter.kmtomiles(a);
			    System.out.printf("%2fkm=%2fmiles\n",a,b);
			    break;
			case 11:
			    System.out.print("hours?");
			    a=sc.nextDouble();
			    b=Timeconverter.hourstominutes(a);
			    System.out.printf("%2fhours=%2fminutes\n",a,b);
			    break;
			case 12:
			    System.out.print("minutes?");
			    a=sc.nextDouble();
			    b=Timeconverter.minstohours(a);
			    System.out.printf("%2fminutes=%2fhours\n",a,b);
			    break;    
			case 13:
			    System.out.print("hours?");
			    a=sc.nextDouble();
			    b=Timeconverter.hourstoseconds(a);
			    System.out.printf("%2fhours=%2fseconds\n",a,b);
			    break;    
			case 14:
			    System.out.print("seconds?");
			    a=sc.nextDouble();
			    b=Timeconverter.secondstohourse(a);
			    System.out.printf("%2fseconds=%2fhours\n",a,b);
			    break;    
			case 15:
			    break;
			default:
			 System.out.println("please enter a valid number.");
		    }
		    if(option==15)
		    	break;
		    }
		    
				}
	}


