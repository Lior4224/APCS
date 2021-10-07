public class BigSib {
  String helloMsg;
  public BigSib(String phrase) {
    helloMsg = phrase;
  }
  public BigSib() {
    double randomNum = Math.random();
    helloMsg = randomNum.toString();
  }

  public String greet (String name) {
    return (helloMsg + " " + name);

  }
  public String setHelloMsg (String str) {
    helloMsg = str;
    return helloMsg;
  }
}
