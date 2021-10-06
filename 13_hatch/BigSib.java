/*
Lior Polischouk (Toothless), Alif (Grippy), Josiah (Hedwig)
APCS
HW#13: Where do BigSibs Come From?
10/6/21
*/

/*Add a constructor to class BigSib that would allow Greet to run without richard.SetHelloMsg("Word up") */
public class BigSib {
  String helloMsg;
  public BigSib(String phrase) {
    helloMsg = phrase;
  }

  public String greet (String name) {
    return (helloMsg + " " + name);

  }
  public String setHelloMsg (String str) {
    helloMsg = str;
    return helloMsg;
  }
}
/*
DISCOVERIES:
1. Discovered that constructors potentially cut out a full line from each new instance of BigSib.
UNRESOLVED QUESTIONS:
1. Is there a way to combine the last two lines as well? (greeting = richard.greet("") and ..println(greeting))
*/
