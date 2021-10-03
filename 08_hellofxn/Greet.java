/*
Lior Polischouk
APCS
HW#08: Refactor Freshie Zero
9/30/21
*/
public class Greet {
  public static void main (String [] args) {
    greet("Bob");
    greet("Jeff");
    greet("Daniel");
  }
  public static void greet (String name) {
    System.out.println("Greetings, " + name + ", how do you do?");
  }
}
/*
DISCOVERIES:
1.Noticed at first that doing greet (String [] args) instead of just greet () didn't work, since I had no 
args to put into greet() when I called it in main.
2.We also realized that we could not define a method within another method.
3.Then realized that I could call methods in main by making a method "greet" with a string:
[Greet (String name)

UNRESOLVED QUESTIONS:
1. Is it possible to define a method within a method, or do we have to define them separately?
*/
