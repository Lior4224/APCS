/*
Lior Polischouk (Toothless), Alif (Grippy), Josiah (Hedwig)
APCS
HW#10: Refactor Big Sib One
10/4/21
*/
public class Greet {
  public static void main (String [] args) {
    System.out.println( BigSib.greet("Bob") );
    System.out.println( BigSib.greet("Jeff") );
    System.out.println( BigSib.greet("Daniel") );
  }
}
/*
DISCOVERIES:
1. Discovered that I had to change void in the greet function to String, so that I could return a string.
2. Discovered that doing println(function which returns something) just prints what is returned.
UNRESOLVED QUESTIONS:
1. none
*/
