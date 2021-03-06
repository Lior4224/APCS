/*
UnicornHead: Melody Lew, Ariella Katz, Lior Polischouk, Tom, Ollie, Toothless
APCS pd6
HW26: GCD Three Ways
2021-10-27
Time elapsed: ~1 hour
*/

/*
DISCO:
0. 
QCC:
0. 
*/

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
  
  public static int gcd(int a, int b) {
   if (a <= 0 || b <= 0) {
      System.out.print("Error: Non-positive input(s) -> ");
      return 0;
   }
     int x = 1; //starts from 1 and increases by 1 repeatedly
     int output = 1; //stores gcd

     while (x <= a && x <= b) {
        if (a % x == 0 && b % x == 0) {
           output = x;
        }
        x += 1;
     }
     return output;
   }

   public static int gcdER(int a, int b) {
      if (a <= 0 || b <= 0) {
         System.out.print("Error: Non-positive input(s) -> ");
         return 0;
       }
      if (a > b) {
         return gcdER(b, (a - b));
      }
      else if (a < b) {
         return gcdER(a, (b - a));
      }
      else{
         return a;
      }
   }

   public static int gcdEW(int a, int b) {
      if (a <= 0 || b <= 0) {
         System.out.print("Error: Non-positive input(s) -> ");
         return 0;
       }
      int x;
      if (a > b) {
         x = b;
      }
      else {
         x = a;
      }
      while (x >= 1) {
         if (a % x != 0 || b % x != 0) {
            x -= 1;
         }
         else {
            return x;
         }
      }
      return x;
   }

  public static void main( String[] args ) { 
   System.out.println(gcd(15,18));
   System.out.println(gcd(3,3));
   System.out.println(gcd(0,5));
   System.out.println(gcdER(15,18));
   System.out.println(gcdER(3,3));
   System.out.println(gcdER(0,5));
   System.out.println(gcdEW(15,18));
   System.out.println(gcdEW(3,3));
   System.out.println(gcdEW(0,5));
  }

}//end class
