/***
 * class ALStack
 * v1
 * SKELETONTR
 * Implements a stack of Strings using an encapsulated arrayList
 **/

/***
Team PJOLLN: Neil Lin, Lior Polischouk, Joseph Othman
APCS pd7
HW85
2022-03-30
time spent: 0.5 hrs

    DISCO

 **/
import java.util.ArrayList;

public class ALStack<T> implements Stack<T>
{
  private ArrayList<T> _stack;
  private int _stackSize;


  //constructor
  public ALStack( int initCapacity )
  {
    _stack = new ArrayList<T>(initCapacity);
    _stackSize = 0;

  }// O(?) always


  //means of insertion
  public void push( T s )
  {
    _stack.add(s);
    _stackSize ++;
  }// O(?)


  //means of removal
  public T pop( )
  {
    T retT = _stack.get(_stackSize - 1);
    _stack.remove(_stackSize-1);
    _stackSize --;
    return retT;
  }// O(?)

  public T peekTop( ){
    T retT = _stack.get(_stackSize - 1);
    return retT;
  }


  //chk for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == 0);
  }// O(1) always


  //chk for fullness
  public boolean isFull()
  {
    return (_stackSize == _stack.size());
  }// O(1) always


  //main method for testing
  public static void main( String[] args )
  {

    ALStack tastyStack = new ALStack(10);
    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");
    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );
    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
