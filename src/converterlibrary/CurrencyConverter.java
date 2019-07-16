package converterlibrary;

import java.util.Scanner;

public class CurrencyConverter {
	public static double dollartoInr(double dollar)
	{double Inr;
	Inr=68*dollar;
	return Inr;
	}
	public static double Inrtodollar(double Inr)
	{double dollar;
	dollar=Inr/68;
	return dollar;
	}
	public static double eurotoInr(double euro)
	{double Inr;
	Inr=euro/77;
	return Inr;
	}
	public static double Inrtoeuro(double Inr)
	{double euro;
	euro=Inr*77;
	return euro;
	}
	public static double yentoInr(double yen)
	{double Inr;
	Inr=0.64*yen;
	return Inr;
	}
	public static double Inrtoyen(double Inr)
	{double yen;
	yen=Inr/0.64;
	return yen;
	}
}

	