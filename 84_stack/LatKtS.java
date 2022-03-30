/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.

 Team PJOLLN: Neil Lin, Lior Polischouk, Joseph Othman
 APCS pd7
 HW84 - Stacks: flip and allMatched
 2022-03-29
 time spent: 0.5 hrs
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    String output = "";
    Latkes tastyStack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      tastyStack.push(s.substring(i, i+1));
    }
    for (int j = 0; j < s.length(); j++){
      output += tastyStack.pop();
    }
    return output;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes tastyString = new Latkes ( s.length() );
    for(int i = 0; i < s.length(); i++) {
      String nextChar = s.substring(i,i+1);
      if( (nextChar.equals("{")) || (nextChar.equals("(")) || (nextChar.equals("[")) ) {
        tastyString.push( nextChar );
      }
      else {
        if( tastyString.isEmpty() ) {
          return false;
        }
        else {
          String justPopped = tastyString.pop();
          // Case 1: nextChar == "}"
          if(nextChar.equals("}")) {
            if( justPopped.equals("[") || justPopped.equals("(")) {
              return false;3 -- Stacks on Stacks (on Stacks. Creating a stack (which is an ADT, or Abstract Data Type))
            }
          }
          // Case 2: nextChar == ")"
          else if(nextChar.equals(")")) {
            if( justPopped.equals("[") || justPopped.equals("{")) {
              return false;
            }
          }
          // Case 3: nextChar == "]"
          else if(nextChar.equals("]")) {
            if( justPopped.equals("{") || justPopped.equals("(")) {
              return false;
            }
          }
        }
      }
    }
    return (tastyString.isEmpty());
  }



  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
