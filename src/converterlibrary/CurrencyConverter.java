package converterlibrary;

public class CurrencyConverter {
	public static double dollarToINR(double dollar)
	{ double INR;
	  INR=68.52*dollar;
	  return INR;		
	}
	public static double inrToDOLLAR(double inr)
	{ double DOLLAR;
	  DOLLAR=(inr/68.52);;
	  return DOLLAR;		
	}
	public static double euroToINR (double euro)
	{ double INR;
	  INR=77.16*euro;
	  return INR;		
	}
	public static double inrToEURO(double inr)
	{ double EURO;
	  EURO=(inr/77.16);
	  return EURO;		
	}
	public static double yenToINR (double yen)
	{ double INR;
	  INR=0.63*yen;
	  return INR;		
	}
	public static double inrToYEN(double inr)
	{ double YEN;
	  YEN=(inr/0.63);
	  return YEN;		
	}
}