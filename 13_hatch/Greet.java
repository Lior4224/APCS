/*
Lior Polischouk (Toothless), Alif (Grippy), Josiah (Hedwig)
APCS
HW#13: Where do BigSibs Come From?
10/6/21
*/
public class Greet {
  public static void main (String [] args) {
    String greeting;
    
    BigSib richard = new BigSib("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib daniel = new BigSib("Salutations");
    greeting = daniel.greet("Dr. Spaceman");
    System.out.println(greeting);
    
    BigSib jeff = new BigSib("Hey ya");
    greeting = jeff.greet("Kong Fooey");
    System.out.println(greeting);
    
    BigSib robert = new BigSib("Sup");
    greeting = robert.greet("mom");
    System.out.println(greeting);
    
  }
}
/*
DISCOVERIES:
1. Discovered that constructors potentially cut out a full line from each new instance of BigSib.
UNRESOLVED QUESTIONS:
1. none
*/
