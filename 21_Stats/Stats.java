/**
   Lior Polischouk
   APCS
   HW20 Statistically Speaking...
   2021-10-20
   TASK:
   Implement each method without typecasting.
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
 **/

public class Stats {

  public static int mean(int a, int b) {
    int mean = (a + b) / 2;
    return mean;
  }

  public static double mean(double a, double b) {
    double mean = (a + b) / 2;
    return mean;
  }

  public static int max(int a, int b) {
    if (a >= b) {
      return a;
      } else {
      return b;
      }
  }

  public static double max(double a, double b) {
    if (a >= b) {
      return a;
      } else {
      return b;
      }
  }

  public static int geoMean(int a, int b) {
     int mean = Math.sqrt (a * b);
     return mean;
  }

  public static double geoMean(double a, double b) {
     double mean = Math.sqrt (a * b);
     return mean;
  }

  public static int max(int a, int b, int c) {
     if ((a >= b) && (a >= c)) {
        return a;
     } else if ((b >= a) && (b >= c)) {
        return b;
     } else {
        return c;
     }
  }

  public static double max(double a, double b, double c) {
     if ((a >= b) && (a >= c)) {
        return a;
     } else if ((b >= a) && (b >= c)) {
        return b;
     } else {
        return c;
     }
  }

//   public static int geoMean(int a, int b, int c) {

//   }

//   public static double geoMean(double a, double b, double c) {

//   }


//   //main method for testing functionality
  public static void main( String[] args ) {
     System.out.println(mean((int) 1,(int) 5));
     System.out.println(mean((double) 1,(double) 5));
     System.out.println(mean((double) 1,(double) 4));
     System.out.println(max((double) 2,(double) 3));
     System.out.println(max((int) 2,(int) 3));

  }

}//end class
