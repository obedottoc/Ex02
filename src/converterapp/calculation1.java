package converterapp;

	import java.util.Scanner;
	import converterlibrary.currencyconverter;
	import converterlibrary.distanceconverter;
	import converterlibrary.timeconverter;
		public class calculation1{
		public static void main (String[]args) {
			double a,b;
			int option;
			Scanner sc=new Scanner(System.in);
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
a=sc.nextDouble();
b=currencyconverter.dollarToinr(a);
System.out.printf("%2fdollars=%2frupees\n",a,b);
break;

case 2:
System.out.print("inr?");
a=sc.nextDouble();
b=currencyconverter.inrTodollar(a);
System.out.printf("%2finr=%2fdollars\n",a,b);
break;

case 3:
System.out.print("euro?");
a=sc.nextDouble();
b=currencyconverter.euroToinr(a);
System.out.printf("%2feuros=%2finr\n",a,b);
break;

case 4:
System.out.print("inr?");
a=sc.nextDouble();
b=currencyconverter.inrToeuro(a);
System.out.printf("%2finr=%2feuro\n",a,b);
break;		

case 5:
System.out.print("yen?");
a=sc.nextDouble();
b=currencyconverter.euroToinr(a);
System.out.printf("%2fyen=%2finr\n",a,b);
break;

case 6:
System.out.print("inr?");
a=sc.nextDouble();
b=currencyconverter.inrToeuro(a);
System.out.printf("%2finr=%2fyen\n",a,b);
break;

case 7:
System.out.print("meter?");
a=sc.nextDouble();
b=distanceconverter.meterTokm(a);
System.out.printf("%2fmeter=%2fkm\n",a,b);
break;

case 8:
System.out.print("km?");
a=sc.nextDouble();
b=distanceconverter.kmTometer(a);
System.out.printf("%2fkm=%2fmeters\n",a,b);
break;

case 9:
System.out.print("mile?");
a=sc.nextDouble();
b=distanceconverter.milesTokm(a);
System.out.printf("%2fmiles=%2fkm\n",a,b);
break;

case 10:
System.out.print("km?");
a=sc.nextDouble();
b=distanceconverter.kmTomiles(a);
System.out.printf("%2fkm=%2fmiles\n",a,b);
break;

case 11:
System.out.print("hrs?");
a=sc.nextDouble();
b=timeconverter.hoursTomins(a);
System.out.printf("%2fhrs=%2fmins\n",a,b);
break;

case 12:
System.out.print("mins?");
a=sc.nextDouble();
b=timeconverter.minsTohours(a);
System.out.printf("%2fmins=%2fhrs\n",a,b);
break;

case 13:
System.out.print("hrs?");
a=sc.nextDouble();
b=timeconverter.secondsTohours(a);
System.out.printf("%2fhrs=%2fsecs\n",a,b);
break;

case 14:
System.out.print("secs?");
a=sc.nextDouble();
b=timeconverter.hoursToseconds(a);
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



