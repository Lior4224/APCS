/*
Lior Polischouk , Jomin, Brian
APCS
HW#14: Customize Your Creation
10/7/21
*/
public class BigSib {
  String helloMsg;
  
  public BigSib() {
    helloMsg = ("Hello");
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
1. Discovered that defcon (without parameters) takes less work/coding but only outputs one helloMsg (as far as I know), while overcon
 takes more written lines but can have different helloMsg's.
UNRESOLVED QUESTIONS:
1. Is it possible to have more than one helloMsg with defcon?
*/
