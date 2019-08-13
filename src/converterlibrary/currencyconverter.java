package converterlibrary;

public class currencyconverter {
	public static double dollarToinr(double dollar)
	{double inr;
	inr=68.52*dollar;
	return inr;
	}
	public static double inrTodollar(double inr)
	{double dollar;
	dollar=(inr/68.52);
	return dollar;
	}
	public static double euroToinr (double euro)
	{double inr;
	inr=77.16*euro;
	return inr;
	}
	public static double inrToeuro (double inr)
	{double euro;
	euro=(inr/77.16)+(inr%77.16);
	return euro;
	}
	public static double yenToinr (double yen)
	{double inr;
	inr=0.63*yen;
	return inr;
	}
	public static double inrToyen(double inr)
	{double yen;
	yen=(inr/0.63)+(inr%0.63);
	return yen;
	}
}
