/****
 *Developed By Avinash Raja

 *Reg n0:212217105009
 *exp n0:2
 *EEE-A
 */
package convertorlibrary;

public class CurrencyConvertor {
   public static double dollarTOINR(double dollar)
   {
	   double INR;
	   INR=68.52*dollar;
	   return INR;
   }
   public static double INRTOdollar(double INR)
   {
	   double DOLLAR;
	   DOLLAR=(INR/68.52)+(INR%68.52);
	   return DOLLAR;
   }
   public static double euroTOINR(double euro)
   {
	   double INR;
	   INR=77.16*euro;
	   return INR;
   }
   public static double INRTOEURO(double INR)
   {
	   double EURO;
	   EURO=(INR/77.16)+(INR%77.16);
	   return EURO;
   }
   public static double yenTOINR(double yen)
   {
	   double INR;
	   INR=0.63*yen;
	   return INR;
   }
   public static double INRTOYEN(double INR)
   {
	   double YEN;
	   YEN=(INR/0.63)+(INR%0.63);
	   return YEN;
   }
}
   
 

