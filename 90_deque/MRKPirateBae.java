/***
Team PJOLLN: Neil Lin, Lior Polischouk, Joseph Othman
APCS pd7
HW90 --
2022-04-12
time spent: 0.5 hrs
DISCO:
-
QCC:
- Do we need methods on the interface such as offer and poll?

**/

public class MRKPirateBae  {
  public static void main(String[] args) {
    public Finn<Integer> jake = new Finn<Integer>();
    System.out.println(jake.addFirst(1));
    System.out.println(jake.addFirst(2));
    System.out.println(jake.addFirst(3));
    System.out.println(jake.addFirst(4));
    System.out.println(jake.addFirst(5));
    System.out.println(jake.addLast(6));
    System.out.println(jake.addLast(7));
    System.out.println(jake.addLast(8));
    System.out.println(jake.addLast(9));
    System.out.println(jake.addLast(10));
    System.out.println(jake.toString());

    System.out.println(jake.removeFirst());
    System.out.println(jake.removeLast());
    System.out.println(jake.toString());

    System.out.println(jake.getFirst());
    System.out.println(jake.getLast());
    System.out.println(jake.size());
    System.out.println(jake.isEmpty());


  }
}
