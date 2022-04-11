/***
Team PJOLLN: Neil Lin, Lior Polischouk, Joseph Othman
APCS pd7
HW89
2022-04-11
time spent: 0.5 hrs

DISCO:
-

QCC:
-

**/

public class ALQueue<T> implements Queue<T> {




  public static void main(String[] args) {

    ALQueue<Integer> Adi = new ALQueue<Integer>();
    Adi.enqueue(1);
    Adi.enqueue(2);
    Adi.enqueue(3);
    Adi.enqueue(4);
    Adi.enqueue(5);
    Adi.enqueue(6);
    Adi.enqueue(7);
    //System.out.println(Adi);
    while(!Adi.isEmpty()) {
      System.out.println(Adi.peekFront());
      Adi.dequeue();
    }


    ALQueue<String> wu = new ALQueue<String>();
    wu.enqueue("RZA");
    wu.enqueue("GZA");
    wu.enqueue("ODB");
    wu.enqueue("Inspectah Deck");
    wu.enqueue("Raekwon the Chef");
    wu.enqueue("U-God");


  }
}
