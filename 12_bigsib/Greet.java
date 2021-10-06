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
    
    BigSib jeff = new BigSib();
    jeff.setHelloMsg("Hey ya");
    greeting = jeff.greet("Kong Fooey");
    System.out.println(greeting);
    
    BigSib robert = new BigSib();
    robert.setHelloMsg("Sup");
    greeting = robert.greet("mom");
    System.out.println(greeting);
    
  }
}
/*
DISCOVERIES:
1.
UNRESOLVED QUESTIONS:
1. none
*/
