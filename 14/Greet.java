public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib();
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib tracy = new BigSib();
    greeting = tracy.greet("Dr.Spaceman");
    System.out.println(greeting);
  }
}
    
