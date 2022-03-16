/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 * 
 * Team PJOLLN (Neil Lin, Lior Polischouk, Joseph Othman)
 * APCS
 * HW 76: LList
 * 2022-3-14
 * time spent: 40 mins
 **/ 

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null;
    _size = 0;
    
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal ) //adds newVal to start of List.
  {
    LLNode _addNode = new LLNode(newVal, _head);
    _head = _addNode; 
    _size ++; 
    return true;
  }

  public void add ( int index, String newVal )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    if (index == 0) {//if index is 0, can just do previous add method
      add(newVal);
    }
    else {

    LLNode _addNode = new LLNode(newVal, null);//node with only newVal
    LLNode _temp = _head;//temporary node that is = to existing List
    for (int i = 0; i < index-1; i++) { //sets _temp to start with element after where newVal should be,
      _temp = _temp.getNext();
    }
    _addNode.setNext(_temp.getNext());//adds _temp to node with newVal
    _temp.setNext(_addNode);
    }
    _size++;
  }

   public String remove( int index ){
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    String output;
    LLNode _temp = _head;
    if (index == 0) { //if index is 0, shifts head forward by 1 element, therefore removing 1st element.
      output = _head.getCargo();//sets output to removed element
      _head = _head.getNext();
    }
    else {
      for (int i = 0; i < index-1; i++) {//reaches index before intended removed index
        _temp = _temp.getNext();
      }
      output = _temp.getNext().getCargo();//sets output to removed element
      // System.out.println(" ");
      // System.out.println(output);
      // System.out.println(_temp.getNext());
      _temp.setNext(_temp.getNext().getNext());//removes intended element by setting that index to the element after it
      // System.out.println(_temp.getNext());
    }
    _size --;
    return output; //returns removed element
   }

  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode _getNode = _head;
    for (int i = 0; i < index; i++) { //reaches index through for loop
      _getNode = _getNode.getNext();
    }
    return _getNode.getCargo(); //returns cargo of index
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode _setNode = _head;
    for (int i = 0; i < index; i++) { //reaches index through for loop
      _setNode = _setNode.getNext();
    }
    _setNode.setCargo(newVal); //sets cargo at index to newVal
    return _setNode.getCargo(); //returns cargo of index, which should be newVal
  }


  //return number of nodes in list
  public int size()
  {
    return _size; //returns _size, which should have +1 for each String added to List
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String output = "List: ";
    LLNode _stringNode = _head;
    while (_stringNode != null) {
      output += (_stringNode.getCargo() + " ");
      _stringNode = _stringNode.getNext();
    }
    output += "null";
    return output;
  }


  //main method for testing
  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    james.add(3, "TEST");
    System.out.println( james );

    james.remove(3);
    System.out.println ( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
