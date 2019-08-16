package converterlibrary;

public class Distanceconverter {

public static double meterTokm(double meter)
{
double km;
km=meter*1000.0;
return km;
}

public static double kmTometer(double km)
{
double meter;
meter=km*2400.0;
return meter;
}
public static double mileTokm(double mile)
{
double km;
km=mile*1.60;
return km;
}

public static double kmTomile(double km)
{
double mile;
mile=km/1.60;
return mile;
}
}
