package convertorlibrary;

public class TimeConvertor {
 public static double hrstomins(double hrs )
 {double mins;
  mins=60*hrs;
  return mins;
 }
 public static double minstohrs(double mins)
 {double hrs;
 hrs=(mins/60)+(mins%60);
 return hrs;
 }
 public static double hrstosec(double hrs )
 {double sec;
 sec=3600*hrs;
 return sec;
}
 public static double sectohrs(double sec)
 {double hrs;
 hrs=(sec/3600)+(sec%3600);
 return hrs;
 }
}
