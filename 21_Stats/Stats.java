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
    mean = (a + b) / 2;
    return mean;
  }

  public static double mean(double a, double b) {
    mean = (Math.round((a + b)/2));
    return mean;
  }

//   public static int max(int a, int b) {
//     if a > b {
//       return a
//       }
//     else {
//       return b
//       }
//   }

//   public static double max(double a, double b) {
//     if a > b {
//       return a
//       }
//     else {
//       return b
//       }
//   }

//   public static int geoMean(int a, int b) {

//   }

//   public static double geoMean(double a, double b) {

//   }

//   public static int max(int a, int b, int c) {

//   }

//   public static double max(double a, double b, double c) {

//   }

//   public static int geoMean(int a, int b, int c) {

//   }

//   public static double geoMean(double a, double b, double c) {

//   }


//   //main method for testing functionality
  public static void main( String[] args ) {
    mean((int) 1,(int) 5);
    mean((double) 1,(double) 5);
    mean((double) 1,(double) 4);

  }

}//end class
