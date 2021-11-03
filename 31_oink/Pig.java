/***
 * UnicornHead: Ariella Katz, Melody Lew, Lior, Polischouk, Tom, Ollie, Toothless
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Ineechay Inchay Inchay
 * 2021-11-03
 * time spent: 0.5hrs
 * 
 * DISCO:
 * 0. 
 * 
 * QCC: 
 * 0. 
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig {
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
    /* YOUR IMPLEMENTATION HERE */
    for (int i=0; i < w.length(); i++) {
      if (w.substring(i, i+1).equals (letter)) {
        return true;
      }
    }
    return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
    /* YOUR IMPLEMENTATION HERE */
    letter = letter.toLowerCase();
    if (letter.equals ("a") || letter.equals ("e") || letter.equals ("i") || 
    letter.equals ("o") || letter.equals ("u") ) {
    return true;
    }
    return false;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
    /* YOUR IMPLEMENTATION HERE */
    int output = 0;
    String x = "";
    for (int i = 0; i < w.length(); i++) {
      x = w.substring(i, i+1);
      if (x.equals ("a") || x.equals ("e") || x.equals ("i") || 
      x.equals ("o") || x.equals ("u") ) {
        output += 1;
      }
    }
    return output;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
    /* YOUR IMPLEMENTATION HERE */
    String x = "";
    for (int i = 0; i < w.length(); i++) {
      x = w.substring(i, i+1);
      if (x.equals ("a") || x.equals ("e") || x.equals ("i") || 
      x.equals ("o") || x.equals ("u") ) {
        return true;
      }
    }
    return false;
    }

  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
    /* YOUR IMPLEMENTATION HERE */
    String output = "";
    String x = "";
    for (int i = 0; i < w.length(); i++) {
      x = w.substring(i, i+1);
      if (x.equals ("a") || x.equals ("e") || x.equals ("i") || 
      x.equals ("o") || x.equals ("u") ) {
        output += x;
      }
    }
    return output;
  }


  public static void main( String[] args ) 
  {
    /* YOUR TEST CALLS HERE */
    System.out.println(hasA("cat", "a"));
    System.out.println(isAVowel("A"));
    System.out.println(countVowels("meatball"));
    System.out.println(hasAVowel("mtbll"));
    System.out.println(allVowels("meatball"));
  }//end main()

}//end class Pig
