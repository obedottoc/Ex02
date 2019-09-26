/*
 *Program to perform CurrencyConverter 
 *By Faizul
 *faizulsmart10@gmail.com
 */

package converterlibrary;

import java.util.Scanner;

public class CurrencyConverter {
	
	public static double dollartoinr(double dollar)
	{double inr;
	inr=68.52*dollar;
	return inr;
	}
	
	public static double inrtodollar(double inr)
	{double dollar;
	dollar=(inr/68.52)+(inr%68.52);
	return dollar;
	}
	
	public static double eurotoinr(double euro)
	{double inr;
	inr=77.16*euro;
	return inr;
	}
	
	public static double inrtoeuro(double inr)
	{double euro;;
	euro=(inr/77.16)+(inr%77.16);
	return euro;
	}
	
	public static double yentoinr(double yen)
	{double inr;
	inr=0.63*yen;;
	return inr;
	}
	
	public static double inrtoyen(double inr)
	{double yen;
	yen=(inr/0.63)+(inr%0.63);
	return yen;
	}
	
}
