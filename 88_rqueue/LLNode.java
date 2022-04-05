/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 * 
 * Team PJOLLN (Neil Lin, Lior Polischouk, Joseph Othman)
 * APCS
 * HW 77: LList
 * 2022-3-15
 * time spent: 40 mins
 **/

public class LLNode<T>
{
  //instance vars
  public T cargo;
  public LLNode nextNode;
  
  // constructor
  public LLNode( T value, LLNode<T> next )
  {
    cargo = value;
    nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo()
  {
    return cargo;
  }

  public LLNode<T> getNext()
  {
    return nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo )
  {
    cargo = newCargo;
    return cargo;
  }

  public LLNode<T> setNext( LLNode<T> newNext )
  {
    nextNode = newNext;
    return nextNode;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return ("Cargo: " + cargo);
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );
    System.out.println(first);

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );
    System.out.println(first);
    System.out.println(first.nextNode);

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );
    System.out.println(first);
    System.out.println(first.nextNode);
    System.out.println(first.nextNode.nextNode);
    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
     */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
      // A: The cargo of the node that it just left is lost, since first is reassigned.
    //...so better: ?
    //  A: could possibly store cargo of node it just left in another variable
    //
    //

  }//end main

}//end class LLNode
