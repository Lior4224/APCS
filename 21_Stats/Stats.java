/**
   Melody Lew, Ariella Katz, Lior Polischouk
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
     int mean = (int)Math.sqrt (a * b);
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

  public static int geoMean(int a, int b, int c) {
     int mean = (int)Math.pow(a*b*c, 1.0/3.0);
     return mean;
  }

  public static double geoMean(double a, double b, double c) {
     double mean = Math.pow(a*b*c, 1.0/3.0);
     return mean;
  }


//   //main method for testing functionality
  public static void main( String[] args ) {
//      Stats test = new Stats();
//      test.mean(2,4);
//      test.mean(3,4);
//      test.mean(2.0,4.0);
//      test.mean(3.0,4.0);
//      test.geoMean(4,5);
//      test.geoMean(4.0,5.0);
//      test.max(2,3);
//      test.max(2.0,3.0);
//      test.geoMean(4,5,6);
//      test.geoMean(4.0,5.0,6.0);
   
  }

}//end class
