package converterapplication;


	import java.util.Scanner;

	import converterlibrary.currencyconverter;
	import converterlibrary.Distanceconverter;
	import converterlibrary.Timeconverter;
	public class Calcultion1 {


	public static void main(String[] args) {
	// TODO Auto-generated method stub
	double value1,value2;
	int option;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("1. Dollar to INR");
	System.out.println("2. INR To Dollar");
	System.out.println("3. Euro To INR");
	System.out.println("4. INR To Euro");
	System.out.println("5. Yen To INr");
	System.out.println("6. INR To Yen");
	System.out.println("7. Meter To Kilo meter");
	System.out.println("8. Kilo meter To Meter");
	System.out.println("9. Kilometer To Mile");
	System.out.println("10. Mile to Kilo meter");
	System.out.println("11. Hour To minute");
	System.out.println("12. Minute to Hour");
	System.out.println("13. Hour to Seconds");
	System.out.println("14. Seconds to Hour");
	System.out.println("15. Exit");
	System.out.println("Enter your choice");
	option=sc.nextInt();
	switch(option)
	{
	case 1:
	System.out.print("Enter the amount:");
	value1=sc.nextDouble();
	value2=currencyconverter.Dollar_TO_Inr(value1);
	System.out.printf("%.2f Dollar is equal to %.2f INR .\n", value1,value2);
	break;
	case 2:
	System.out.print("Enter the amount:");
	value1=sc.nextDouble();
	value2=currencyconverter.INR_TO_Dollar(value1);
	System.out.printf("%.2f INR is equal to %.2f Dollar .\n", value1,value2);
	break;
	case 3:
	System.out.print("Enter the amount:");
	value1=sc.nextDouble();
	value2=currencyconverter.Euro_To_Inr(value1);
	System.out.printf("%.2f Euro is equal to %.2f INR .\n", value1,value2);
	break;

	case 4:
	System.out.print("Enter the amount:");
	value1=sc.nextDouble();
	value2=currencyconverter.Inr_To_Euro(value1);
	System.out.printf("%.2f Inr is equal to %.2f Euro .\n", value1,value2);
	   break;
	case 5:
	System.out.print("Enter the amount:");
	value1=sc.nextDouble();
	value2=currencyconverter.Yen_To_Inr(value1);
	System.out.printf("%.2f Yen is equal to %.2f INR .\n", value1,value2);
	   break;
	case 6:
	System.out.print("Enter the amount:");
	value1=sc.nextDouble();
	value2=currencyconverter.Inr_To_Yen(value1);
	System.out.printf("%.2f Inr is equal to %.2f Yen .\n", value1,value2);
	break;
	case 7:
	System.out.print("Enter the Distance:");
	value1=sc.nextDouble();
	value2=Distanceconverter.Meter_To_Kilometer(value1);
	System.out.printf("%.2f meter is equal to %.2f Kilometer .\n", value1,value2);
	break;
	case 8:
	System.out.print("Enter the Distance:");
	value1=sc.nextDouble();
	value2=Distanceconverter.kilometer_To_Meter(value1);
	System.out.printf("%.2f kilometer is equal to %.2f meter .\n", value1,value2);
	break;
	case 9:
	System.out.print("Enter the Distance:");
	value1=sc.nextDouble();
	value2=Distanceconverter.Kilometer_To_Mile(value1);
	System.out.printf("%.2f kilometer is equal to %.2f mile .\n", value1,value2);
	break;
	case 10:
	System.out.print("Enter the Distance:");
	value1=sc.nextDouble();
	value2=Distanceconverter.Miles_To_kilometer(value1);
	System.out.printf("%.2f miles is equal to %.2f Kilometer .\n", value1,value2);
	break;
	case 11:
	System.out.print("Enter the time:");
	value1=sc.nextDouble();
	value2=Timeconverter.Hour_To_Minute(value1);
	System.out.printf("%.2f Hour  is equal to %.2f Minute .\n", value1,value2);
	break;
	case 12:
	System.out.print("Enter the time:");
	value1=sc.nextDouble();
	value2=Timeconverter.Minute_To_Hour(value1);
	System.out.printf("%.2f Minute  is equal to %.2f Hour .\n", value1,value2);
	break;

	case 13:
	System.out.print("Enter the time:");
	value1=sc.nextDouble();
	value2=Timeconverter.Hour_To_Seconds(value1);
	System.out.printf("%.2f Hour  is equal to %.2f Seconds .\n", value1,value2);
	break;
	case 14:
	System.out.print("Enter the time:");
	value1=sc.nextDouble();
	value2=Timeconverter.Seconds_To_Hour(value1);
	System.out.printf("%.2f seconds  is equal to %.2f hour .\n", value1,value2);
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


