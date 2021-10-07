public class BigSib {
  String helloMsg;
  public BigSib(String phrase) {
    helloMsg = phrase;
  }
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
