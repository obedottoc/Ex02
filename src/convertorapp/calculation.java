package convertorapp;
import java.util.Scanner;
import convertorlibrary.*;
public class calculation {
	public static void main (String[]args) {
		double a,b;
		int option;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.DollarTOINR");
			System.out.println("2.INRTODollar");
			System.out.println("3.EuroTOINR");
			System.out.println("4.INRTOEuro");
			System.out.println("5.YenTOINR");
			System.out.println("6.INRTOYen");
			System.out.println("7.metertokm");
			System.out.println("8.kmtometer");
			System.out.println("9.milestokm");
			System.out.println("10.kmtomiles");
			System.out.println("11.hrstomin");
			System.out.println("12.mintohrs");
			System.out.println("13.hrstosec");
			System.out.println("14.sectohrs");
			System.out.println("15.Exit!");
			System.out.print("Enter Your Choice");
			option=sc.nextInt();
			switch(option)
			{	case 1:
				System.out.printf("Enter Dollars");
				a=sc.nextDouble();
				b=CurrencyConvertor.dollarTOINR(a);
				System.out.printf("%.2f dollars=%.2f rupees\n",a,b);
				break;
			case 2:
				System.out.printf("Enter INR");
			a=sc.nextDouble();
			b=CurrencyConvertor.INRTOdollar(a);
			System.out.printf("%.2f rupees=%.2f dollar\n",a,b);
			break;
			case 3:
				System.out.printf("Enter Euro");
			a=sc.nextDouble();
			b=CurrencyConvertor.euroTOINR(a);
			System.out.printf("%.2f euro=%.2f\n",a,b);
			break;
			case 4:
				System.out.printf("Enter INR");
				a=sc.nextDouble();
				b=CurrencyConvertor.INRTOEURO(a);
				System.out.printf("%.2f=%.2feuro\n",a,b);
				break;
			case 5:
				System.out.printf("Enter yen");
				a=sc.nextDouble();
				b=CurrencyConvertor.yenTOINR(a);
				System.out.printf("%.2f yen=%.2f\n",a,b);
				break;
			case 6:
				System.out.printf("Enter INR");
				a=sc.nextDouble();
				b=CurrencyConvertor.INRTOYEN(a);
				System.out.printf("%.2f=%.2fyen\n",a,b);
				break;
			case 7:
				System.out.printf("Enter meter");
				a=sc.nextDouble();
				b=DistanceConvertor.metertokm(a);
				System.out.printf("%.2f meter=%.2fkm\n",a,b);
				break;
			case 8:
				System.out.printf("Enter km");
				a=sc.nextDouble();
				b=DistanceConvertor.kmtometer(a);
				System.out.printf("%.2f km=%.2fmeter\n",a,b);
				break;
			case 9:
				System.out.printf("Enter miles");
				a=sc.nextDouble();
				b=DistanceConvertor.milestokm(a);
				System.out.printf("%.2f miles=%.2fkm\n",a,b);
				break;
			case 10:
				System.out.printf("Enter km");
				a=sc.nextDouble();
				b=DistanceConvertor.kmtomiles(a);
				System.out.printf("%.2f km=%.2fmiles\n",a,b);
				break;
			case 11:
				System.out.printf("Enter hrs");
				a=sc.nextDouble();
				b=TimeConvertor.hrstomin(a);
				System.out.printf("%.2f hrs=%.2fmin\n",a,b);
				break;
			case 12:
				System.out.printf("Enter min");
				a=sc.nextDouble();
				b=TimeConvertor.mintohrs(a);
				System.out.printf("%.2f min=%.2fhrs\n",a,b);
				break;
			case 13:
				System.out.printf("Enter hrs");
				a=sc.nextDouble();
				b=TimeConvertor.hrstosec(a);
				System.out.printf("%.2f hrs=%.2fsec\n",a,b);
				break;
			case 14:
				System.out.printf("Enter sec");
				a=sc.nextDouble();
				b=TimeConvertor.sectohrs(a);
				System.out.printf("%.2f sec=%.2fhrs\n",a,b);
				break;
			case 15:
				break;
				default:
					System.out.println("Enter The Number");
			}
			if(option==15)
				break;
		}
	}
}
				