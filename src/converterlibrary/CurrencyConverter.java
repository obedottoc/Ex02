/****
 * Program for Currency Converter
 * @author Pavan Kalyan
 *  npkr.nvrr@outlook.com
 */
package converterlibrary;
import java.util.*;
public class CurrencyConverter{
	double inr,usd;
	double euro,yen;
	Scanner in=new Scanner(System.in);
	public void dollartorupee()
	{
		System.out.println("Enter dollars to convert into Rupees:");
		usd=in.nextInt();
		inr=usd*67;
		System.out.println("Dollar="+usd+"equal to INR="+inr);
	}
	public void rupeetodollar()
	{
		System.out.println("Enter Rupee to convert into Dollars:");
		inr=in.nextInt();
		usd=inr/67;
		System.out.println("rupee="+inr+"equal to dollars="+usd);
	}
	public void eurotorupee()
	{
		System.out.println("enter euro to convert into rupee:");
		euro=in.nextInt();
		inr=euro*79.50;
		System.out.println("Euro="+euro+"equal to INR="+inr);
	}
	public void rupeetoeuro()
	{
		System.out.println("enter rupees to convert into euro:");
		inr=in.nextInt();
		euro=(inr/79.50);
		System.out.println("rupee="+inr+"equal to euro="+euro);
	}
	public void yentorupee()
	{
	System.out.println("enter yen to convert into rupees:");
	yen=in.nextInt();
	inr=yen*0.61;
	System.out.println("yen="+yen+"equal to inr="+inr);
	}
	public void rupeetoyen()
	{
		System.out.println("inr="+inr+"equal to yen"+yen);
		inr=in.nextInt();
		yen=(inr/0.61);
		System.out.println("inr="+inr+"equal to yen"+yen);
	}
}