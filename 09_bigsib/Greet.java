/*
Lior Polischouk (Toothless), Alif (Grippy), Josiah ()
APCS
HW#09: What Are BigSibs Good For?
10/2/21
*/
public class Greet {
  public static void main (String [] args) {
    BigSib.greet("Bob");
    BigSib.greet("Jeff");
    BigSib.greet("Daniel");
  }
}
/*
DISCOVERIES:
1. Discovered that we can call methods from other files in this file when the files are in the same 
directory by simply doing <filename>.<methodname> (BigSib.greet)

UNRESOLVED QUESTIONS:
1. Can you call methods from files not in this directory (but still in the same repository) in this file?

*/
