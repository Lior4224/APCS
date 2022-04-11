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

public class LLQueue<T> implements Queue<T> {

  private class Node
  {
    //instance vars
    private T _cargo;
    private Node _nextNode;

    // constructor
    public Node( T value, Node next )
    {
      _cargo = value;
      _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo()
    {
      return _cargo;
    }

    public Node getNext()
    {
      return _nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo )
    {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public Node setNext( Node newNext )
    {
      Node foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------
  }

  Node _first;
  int _queueSize;

  public T dequeue() {
    if( _queueSize == 0 ) {
      return null;
    }
    else {
      T retVal = _first.getCargo();
      _first = _first.getNext();
      _queueSize--;
      return retVal;
    }
  }

  public void enqueue( T x ) {
    Node newNode = new Node( x, null);
    if(_queueSize == 0) {
      _first = newNode;    //--------------v  ACCESSORS  v--------------
    public T getCargo()
    {
      return _cargo;
    }

    public Node getNext()
    {
      return _nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo )
    {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public Node setNext( Node newNext )
    {
      Node foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------
  }

  Node _first;
  int _queueSize;

  public T dequeue() {
    if( _queueSize == 0 ) {
      return null;
    }
    else {
      T retVal = _first.getCargo();
      _first = _first.getNext();
      _queueSize--;
      return retVal;
    }
  }

  public void enqueue( T x ) {
    Node newNode = new Node( x, null);
    if(_queueSize == 0) {
      _first = newNode;
    }
    else {
    }
    _queueSize++;
  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }    Node temp = _first;
      while( temp.getNext() != (null) ) {
        temp = temp.getNext();
      }
      temp.setNext( newNode );
    }
    _queueSize++;
  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }



  public static void main(String[] args) {

    ALQueue<Integer> Adi = new ALQueue<Integer>();
    Adi.enqueue(1);    //--------------v  ACCESSORS  v--------------
    public T getCargo()
    {
      return _cargo;
    }

    public Node getNext()
    {
      return _nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo )
    {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public Node setNext( Node newNext )
    {
      Node foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------
  }

  Node _first;
  int _queueSize;

  public T dequeue() {
    if( _queueSize == 0 ) {
      return null;
    }
    else {
      T retVal = _first.getCargo();
      _first = _first.getNext();
      _queueSize--;
      return retVal;
    }
  }

  public void enqueue( T x ) {
    Node newNode = new Node( x, null);
    if(_queueSize == 0) {
      _first = newNode;
    }
    else {
    }
    _queueSize++;
  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }    Node temp = _first;
      while( temp.getNext() != (null) ) {
        temp = temp.getNext();
      }
      temp.setNext( newNode );
    }
    _queueSize++;    //--------------v  ACCESSORS  v--------------
    public T getCargo()
    {
      return _cargo;
    }

    public Node getNext()
    {
      return _nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo )
    {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public Node setNext( Node newNext )
    {
      Node foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------
  }

  Node _first;
  int _queueSize;

  public T dequeue() {
    if( _queueSize == 0 ) {
      return null;
    }
    else {
      T retVal = _first.getCargo();
      _first = _first.getNext();
      _queueSize--;
      return retVal;
    }
  }

  public void enqueue( T x ) {
    Node newNode = new Node( x, null);
    if(_queueSize == 0) {
      _first = newNode;
    }
    else {
    }
    _queueSize++;
  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }    Node temp = _first;
      while( temp.getNext() != (null) ) {
        temp = temp.getNext();
      }
      temp.setNext( newNode );
    }
    _queueSize++;
  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }



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
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man")
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man");
    System.out.println(wu);
    while(!wu.isEmpty()) {
      System.out.println(wu.peekFront() + " raps for the Wu");
      wu.dequeue();
    }
  }

}

  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }



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
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man")
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man");
    System.out.println(wu);
    while(!wu.isEmpty()) {
      System.out.println(wu.peekFront() + " raps for the Wu");
      wu.dequeue();
    }
  }

}

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
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man")
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man");
    System.out.println(wu);
    while(!wu.isEmpty()) {
      System.out.println(wu.peekFront() + " raps for the Wu");
      wu.dequeue();
    }
  }

}

    }
    else {
      Node temp = _first;
      while( temp.getNext() != (null) ) {
        temp = temp.getNext();
      }
      temp.setNext( newNode );
    }
    _queueSize++;
  }

  public boolean isEmpty() {
    return ( _queueSize == 0 );
  }

  public T peekFront() {
    return _first.getCargo();
  }

  public String toString() {
    Node temp = _first;
    String retVal = "";
    while( temp.getNext() != (null) ) {
      retVal += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    retVal += temp.getCargo();
    return retVal;
  }



  public static void main(String[] args) {

    LLQueue<Integer> Adi = new LLQueue<Integer>();
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


    LLQueue<String> wu = new LLQueue<String>();
    wu.enqueue("RZA");
    wu.enqueue("GZA");
    wu.enqueue("ODB");
    wu.enqueue("Inspectah Deck");
    wu.enqueue("Raekwon the Chef");
    wu.enqueue("U-God");
    wu.enqueue("Ghostface");
    wu.enqueue("Method Man");
    System.out.println(wu);
    while(!wu.isEmpty()) {
      System.out.println(wu.peekFront() + " raps for the Wu");
      wu.dequeue();
    }
  }

}
