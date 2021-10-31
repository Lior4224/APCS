public class string2{
	public static String doubleChar(String str) { 
  		String output = "";
  		for (int i = 0; i < str.length(); i++) {
    			output += str.substring(i,i+1);
    			output += str.substring(i,i+1);
  		}
  		return output;
	}
	public static int countHi(String str) {
  		int output = 0;
  		for (int i = 0; i < str.length()-1; i++) {
    			if ((str.substring(i, i+2)).equals ("hi")) {
     				 output += 1;
    			}
  		}
  		return output;
	}
	public static boolean catDog(String str) {
  		int output1 = 0;
  		int output2 = 0;
  		for (int i = 0; i < str.length()-2; i++) {
    			if ((str.substring(i, i+3)).equals ("cat")) {
     				 output1 += 1;
    			}
			if ((str.substring(i, i+3)).equals ("dog")) {
     				 output2 += 1;
    			}
  		}
  		return (output1 == output2);
	}
	public static int countCode(String str) {
		int output = 0;
		for (int i = 0; i < str.length()-3; i++) {
		  if ((str.substring(i, i+2)).equals ("co") && (str.substring(i+3, i+4)).equals ("e")) {
			output += 1;
		  }
		}
		return output;
	  }
	  public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.length() > b.length()) {
		  return(a.substring(a.length()-b.length(), a.length()).equals (b)); 
		}
		  else {
			return (b.substring(b.length()-a.length(), b.length()).equals (a)); 
		}
	  }
	  public static boolean xyzThere(String str) {
        // boolean output = true;
                    //ATTEMPT 1: all are correct except xyz.abc and other tests
    //     if (str.length() <= 3) {
    //         for (int i = 0; i < str.length()-3; i++) {

    //             if ((str.substring(i+1, i+4)).equals ("xyz")) {
    //                 if (i == 0 || (str.substring(i, i+1)).equals (".")) {
    //                     output = false;
    //                 }
    //                 else {
    //                     output = true;
    //                 }
    //             }
    //             else {
    //                 output = false;
    //             }
    //         }
    //     }
    //     else {
    //         output = false;
    //     }
    //     return output;
    // }
                //ATTEMPT 2: all are correct except abcxy
    // if (str.length() >= 3) {
    //     for (int i = 0; i < str.length()-2; i++) {
          
    //       if ((str.substring(i, i+3)).equals ("xyz")) {
    //         if (i == 0 || !(str.substring(i-1, i)).equals (".")) {
    //          output = true;
    //        }
    //        else {
    //           output = false;
    //        }
    //       }
    //     //   else {
    //     //   output = false;
    //     // }
    //     }
    //   }
    //   else {
    //     output = false;
    //   }
    //   return output;
    // }
                //ATTEMPT 3: searched up on internet, works for all cases but uses str.charAt
        for(int i=0; i < str.length()-2; i++) {
          if(str.substring(i,i+3).equals("xyz")) {
            if(i==0) {
            return true;
            }
            else if(str.charAt(i-1) != '.') {
              return true;
            }
          }
        }
        return false;
      }
	public static boolean bobThere(String str) {
  		for (int i = 0; i < str.length()-2; i++) {
    			if (str.substring(i, i+1).equals ("b") && str.substring(i+2, i+3).equals ("b")) {
      				return true;
    			}
  		}
  		return false;
	}
	public static boolean xyBalance(String str) {
  		int z = 0;
  		for (int i = str.length(); i > 0; i--) {
    			if (str.substring(i-1, i).equals ("y")) {
      				z += 1;
      				return true;
    			}
    			else if (str.substring(i-1, i).equals ("x")) {
      				z += 1;
      				return false;
    			}     
  		}
  		if (z == 0) {
    			return true;
  		}
  		return false;
	}
	public static String mixString(String a, String b) {
  		String x = "";
  		String y = "";
  		String output = "";
  		if (a.length() > b.length()) {
    			x = b;
    			y = a;
  		}
  		else {
    			x = a;
    			y = b;
  		}
  		for (int i = 0; i < x.length(); i++) {
    			output += a.substring(i, i+1);
    			output += b.substring(i, i+1);
  		}
  		output += y.substring(x.length(), y.length());
  		return output;
	}
	public static String repeatEnd(String str, int n) {
  		String output = "";
  		for (int i = 0; i < n; i++) {
    			output += str.substring(str.length()-n, str.length());
  		}
  		return output;
	}
	public static String repeatFront(String str, int n) {
  		String output = "";
  		for (int i = n; i > 0; i--) {
    			output += str.substring(0, i);
  		}
  		return output;
	}
	public static String repeatSeparator(String word, String sep, int count) {
  		String output = "";
  		for (int i = 0; i < count; i++) {
    			output += word;
    			if (i != count-1) {
      				output += sep;
    			}
  		}
  		return output;
	}
	public static boolean prefixAgain(String str, int n) {
  		String x = str.substring(0, n);
  		for (int i = n; i <= str.length()-n; i++) {
    			if (str.substring(i, i+n).equals (x)) {
      				return true;
    			}
  		}
  		return false;
	}


	public static void main(String[] args) {
		System.out.println(doubleChar("Hello"));
		System.out.println(countHi ("abchi hi h hi"));
		System.out.println(catDog ("1cat1cadodog"));
		System.out.println(countCode("copecodecadecolecode"));
		System.out.println(endOther("Hiabc", "abc"));
		System.out.println(endOther("AbC", "HiaBc"));
		System.out.println(endOther("abc", "abXabc"));
		System.out.println(xyzThere("abc.xyz"));
		System.out.println(xyzThere("xyz.abc"));
		System.out.println(bobThere("abcbob"));
		System.out.println(xyBalance("aaxbby"));
		System.out.println(mixString("abc", "xyz"));
		System.out.println(repeatEnd("Hello", 3));
		System.out.println(repeatFront("Chocolate", 4));
		System.out.println(repeatSeparator("Word", "X", 3));
		System.out.println(prefixAgain("abXYabc", 1));
	}

}



/* 
String a = hi, hello
String b = hello
	If substring ((a-b), a-1 equals b OR
       substring ((b-a)), b-1 equals a */
