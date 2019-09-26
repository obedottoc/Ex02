/*created by kaarthikeyan
 * email:gk81299@gmail.com
 * 
 */
package converterapps;
import java.util.Scanner;
import converterlibrary.CurrencyConveter;
import converterlibrary.DistanceConverter;
import converterlibrary.TimeConverter;
public class Calculation1 {

	public static void main(String[] args) {
		double a1,a2;
		int option;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Doller to INR conversion");
			System.out.println("2. INR to Doller conversion");
			System.out.println("3. Euro to INR conversion");
			System.out.println("4. INR to Euro conversion");
			System.out.println("5. Yen to INR conversion");
			System.out.println("6. INR to Yen conversion");
			System.out.println("7. Meter to Kilometer  conversion");
			System.out.println("8. Kilometer to Meter conversion");
			System.out.println("9. Miles to Kilometer  conversion");
			System.out.println("10. Kilometer to Mile conversion");
			System.out.println("11. Hours to Minute  conversion");
			System.out.println("12. Minute to Hours conversion");
			System.out.println("13. Hour to Second  conversion");
			System.out.println("14. Second to Hour conversion");
			System.out.println("15. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter the Dollers:");
				a1=sc.nextDouble();
				a2=CurrencyConveter.dollorToinr(a1);
				System.out.printf("%.2f INR is equal to %.2f Doller.\n", a1,a2);
				break;
			case 2:
				System.out.print("Enter the INR:");
				a1=sc.nextDouble();
				a2=CurrencyConveter.inrTodollor(a1);
				System.out.printf("%.2f Dollor is equal to %.2f INR.\n", a1,a2);
				break;
			case 3:
				System.out.print("Enter the EURO:");
				a1=sc.nextDouble();
				a2=CurrencyConveter.euroToinr(a1);
				System.out.printf("%.2f INR is equal to %.2f INR.\n", a1,a2);
				break;
			case 4:
				System.out.print("Enter the INR:");
				a1=sc.nextDouble();
				a2=CurrencyConveter.inrToeuro(a1);
				System.out.printf("%.2f EURO is equal to %.2f INR.\n", a1,a2);
				break;
			case 5:
				System.out.print("Enter the YEN:");
				a1=sc.nextDouble();
				a2=CurrencyConveter.yenToinr(a1);
				System.out.printf("%.2f YEN is equal to %.2f INR.\n", a1,a2);
				break;
			case 6:
				System.out.print("Enter the INR:");
				a1=sc.nextDouble();
				a2=CurrencyConveter.inrToyen(a1);
				System.out.printf("%.2f INR is equal to %.2f YEN.\n", a1,a2);
				break;
			case 7:
				System.out.print("Enter the Meter:");
				a1=sc.nextDouble();
				a2=DistanceConverter.mtrTokm(a1);
				System.out.printf("%.2f Meter is equal to %.2f Kilometer.\n", a1,a2);
				break;
			case 8:
				System.out.print("Enter the Kilometer:");
				a1=sc.nextDouble();
				a2=DistanceConverter.kmTomtr(a1);
				System.out.printf("%.2f Kilometer is equal to %.2f8 Meter.\n", a1,a2);
				break;
			case 9:
				System.out.print("Enter the Miles:");
				a1=sc.nextDouble();
				a2=DistanceConverter.mileTokm(a1);
				System.out.printf("%.2f Mile is equal to %.2f Kilometer.\n", a1,a2);
				break;
			case 10:
				System.out.print("Enter the Kilometer:");
				a1=sc.nextDouble();
				a2=DistanceConverter.kmTomile(a1);
				System.out.printf("%.2f Kilometer is equal to %.2f Mile.\n", a1,a2);
				break;
			case 11:
				System.out.print("Enter the Hours:");
				a1=sc.nextDouble();
				a2=TimeConverter.hrsTomin(a1);
				System.out.printf("%.2f Hours is equal to %.2f Minute.\n", a1,a2);
				break;
			case 12:
				System.out.print("Enter the Minute:");
				a1=sc.nextDouble();
				a2=TimeConverter.minTohrs(a1);
				System.out.printf("%.2f Minute is equal to %.2f Hours.\n", a1,a2);
				break;
			case 13:
				System.out.print("Enter the Hours:");
				a1=sc.nextDouble();
				a2=TimeConverter.hrsTosec(a1);
				System.out.printf("%.2f Hours is equal to %.2f Seconds.\n", a1,a2);
				break;
			case 14:
				System.out.print("Enter the Seconds:");
				a1=sc.nextDouble();
				a2=TimeConverter.secTohrs(a1);
				System.out.printf("%.2f Seconds is equal to %.2f Hours.\n", a1,a2);
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


