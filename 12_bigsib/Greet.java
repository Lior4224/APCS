/*
Lior Polischouk (Toothless), Alif (Grippy), Josiah (Hedwig)
APCS
HW#12: On Elder Individuality and the Elimination of Radio Fuzz
10/5/21
*/
public class Greet {
  public static void main (String [] args) {
    String greeting;
    
    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib daniel = new BigSib();
    daniel.setHelloMsg("Salutations");
    greeting = daniel.greet("Dr. Spaceman");
    System.out.println(greeting);
    
/*    System.out.println( BigSib.greet("Bob") );
    System.out.println( BigSib.greet("Jeff") );
    System.out.println( BigSib.greet("Daniel") );
    */
  }
}
/*
DISCOVERIES:
1.
UNRESOLVED QUESTIONS:
1. none
*/
