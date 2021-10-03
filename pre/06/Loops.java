public class Loops {
  public static double power(double x, int n) {
    double a = n;
    double result = x;
    while (a > 0){
      result = (result * x);
      a = a - 1;
    }
    return result;
  }
  public static double power2(double x, int n) {
    double result = x;
    for (double a = n; a > 0; a--){
      result = (result * x);
    }
    return result;
  }
  public static int factorial(int n){
    int a = 1;
    for (int b = 1; b <= n; b++){
      a = (a * b);
    }
    return a;
  }
  public static double myexp(int x, int n) {
    double a = 0;
    for (int b = 1; b <= n; b++){
      a = (a + (power2(x, b)) / factorial(b));
    }
    return a;
  }

  public static void main(String[] args){
    System.out.println(power2(3, 4));
    System.out.println(factorial(9));
    System.out.println(myexp(2, 2));
  }
}
