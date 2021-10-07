public class BigSib {
  String helloMsg;
  public BigSib(String phrase) {
    helloMsg = phrase;
  }
  public BigSib() {
    double randomNum = Math.random();
    helloMsg = String.valueOf(randomNum);
  }

  public String greet (String name) {
    return (helloMsg + " " + name);

  }
  public String setHelloMsg (String str) {
    helloMsg = str;
    return helloMsg;
  }
}
