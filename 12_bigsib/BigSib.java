/*
Lior Polischouk (Toothless), Alif (Grippy), Josiah (Hedwig)
APCS
HW#12: On Elder Individuality and the Elimination of Radio Fuzz
10/5/21
*/

/*Add a constructor to class BigSib that would allow Greet to run without richard.SetHelloMsg("Word up") */
public class BigSib {
  String helloMsg;
  public static void main (String [] args) {

  }
  public String greet (String name) {
    return (helloMsg + " " + name);

  }
  public String setHelloMsg (String str) {
    helloMsg = str;
    return helloMsg;
  }
}
