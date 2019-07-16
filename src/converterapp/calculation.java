package converterapp;
import java.util.Scanner;
import converterlibrary;
import converterlibrary.CurrencyConverter;
public class calculation {
	public static void main (string[]args) {
		double a,b;
		int option;
		Scanner sc=new Scanner(system.in);
		while(true)
		{System.out.println("1.dollartoinr");
		System.out.println("2.inrtodollar");
		System.out.println("3.eurotoinr");
		System.out.println("4.inrtoeuro");
		System.out.println("5.yentoinr");
		System.out.println("6.inrtoyen");
		System.out.println("7.metertokm");
		System.out.println("8.kmtometer");
		System.out.println("9.milestokm");
		System.out.println("10.kmtomiles");
		System.out.println("11.hrstomins");
		System.out.println("12.minstohrs");
		System.out.println("13.hrstoecs");
		System.out.println("14.secstohrs");
		System.out.println("15.exit!");
		System.out.println("enter your choice:");
		
		option=sc.nextInt();
        switch(option) {
        case 1:
	    System.out.print("Enter dollars:");
		a=sc.nextdouble();
		b=CurrencyConverter.dollartoinr(a);
		System.out.printf("%2fdollars=%2frupees\n",a,b);
		break;
		
		case 2:
			System.out.print("inr?");
				a=sc.nextdouble();
				b=CurrencyConverter.inrtodollar(a);
				System.out.printf("%2frupees=%2fdollars\n",a,b);
				break;
		
		case 3:
       		System.out.print("euro?");
				a=sc.nextdouble();
				b=CurrencyConverter.eurotoinr(a);
				System.out.printf("%2feuros=%2fdollars\n",a,b);
				break;
				
		case 4:
		  		System.out.print("inr?");
				a=sc.nextdouble();
				b=CurrencyConverter.inrotoeuro(a);
	     		System.out.printf("%2fdollars=%2feuro\n",a,b);
				break;		
						
		case 5:
		       	System.out.print("yen?");
				a=sc.nextdouble();
				b=CurrencyConverter.yentoinr(a);
				System.out.printf("%2fyen=%2fdollars\n",a,b);
				break;
		
		case 6:
				System.out.print("inr?");
				a=sc.nextdouble();
				b=CurrencyConverter.inrtoyen(a);
				System.out.printf("%2fdollars=%2fyen\n",a,b);
     			break;
								
     	case 7:
				System.out.print("meter?");
				a=sc.nextdouble();
				b=CurrencyConverter.metertokm(a);
				System.out.printf("%2fmeter=%2fkm\n",a,b);
				break;
					
		case 8:
			    System.out.print("km?");
				a=sc.nextdouble();
				b=CurrencyConverter.kmtometer(a);
				System.out.printf("%2fkm=%2fmeters\n",a,b);
				break;
				
		case 9:
		 		System.out.print("mile?");
     			a=sc.nextdouble();
				b=CurrencyConverter.milestokm(a);
				System.out.printf("%2fmiles=%2fkm\n",a,b);
				break;
		        switch (option)								
		case 10:
				System.out.print("km?");
				a=sc.nextdouble();
				b=CurrencyConverter.kmtomiles(a);
				System.out.printf("%2fkm=%2fmiles\n",a,b);
				break;
				
		case 11:
	         	System.out.print("hrs?");
				a=sc.nextdouble();
		    	b=CurrencyConverter.hrstomins(a);
				System.out.printf("%2fhrs=%2fmins\n",a,b);
				break;
	
		case 12:
		  		System.out.print("mins?");
				a=sc.nextdouble();
	        	b=CurrencyConverter.minstohrs(a);
				System.out.printf("%2fmins=%2fhrs\n",a,b);
				break;
		
		case 13:
	    		System.out.print("hrs?");
				a=sc.nextdouble();
				b=CurrencyConverter.hrstosecs(a);
				System.out.printf("%2fhrs=%2fsecs\n",a,b);
				break;
				
		case 14:
		   		System.out.print("secs?");
				a=sc.nextdouble();
				b=CurrencyConverter.secstohrs(a);
				System.out.printf("%2fsecs=%2fhrs\n",a,b);
				break;
				
		case 15:
				break;
				default:
					System.out.println("please enter a valid number:");
				
					
			}
		
	    }

	}
}
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
