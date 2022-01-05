public class String1 {
	public static String helloName(String name) {
  		return ("Hello " + name + "!");
	}
	public static String makeAbba(String a, String b) {
  		return (a + b + b + a);
	}
	//extra problems (not required)
	public static String makeTags(String tag, String word) {
		return ("<" + tag + ">" + word + "</" + tag + ">");
	}
	public static String makeOutWord(String out, String word) {
		String begin = out.substring(0, 2);
		String end = out.substring(2, 4);
		return (begin + word + end);
	}
	public static String extraEnd(String str) {
		String output = (str.substring(str.length()-2, str.length()));
		return output + output + output;
	}
	public static String firstTwo(String str) {
		if (str.length() < 2) {
		  return str;
		}
		else {
		  return str.substring(0,2);
		}
	}
	public static String firstHalf(String str) {
		return (str.substring(0, str.length() / 2));
	}
	public static String withoutEnd(String str) {
		return str.substring(1,  str.length()-1);
	}
	public static String comboString(String a, String b) {
		if (a.length() > b.length()) {
		  return (b + a + b);
		}
		else {
		  return (a + b + a);
		}
	}
	public static String nonStart(String a, String b) {
		return (a.substring(1, a.length()) + b.substring(1, b.length()));
	}
	public static String left2(String str) {
		return (str.substring(2, str.length()) + str.substring(0, 2));
	}
	public static String right2(String str) {
		return (str.substring(str.length()-2, str.length()) + str.substring(0, str.length()-2));
	}
	public static String theEnd(String str, boolean front) {
		if (front == true) {
		  return str.substring(0, 1);
		}
		else {
		  return str.substring(str.length()-1, str.length());
		}
	}
	public static String withouEnd2(String str) {
		if (str.length() > 2) {
		  return (str.substring(1, str.length()-1));
		}
		else {
		  return "";
		}
	}
	public static String middleTwo(String str) {
		return (str.substring((str.length()/2) - 1, (str.length()/2) + 1));
	}
	public static boolean endsLy(String str) {
		if (str.length() > 1) {
		  if (str.substring(str.length()-2, str.length()).equals ("ly")) {
			return true;
		  }
		  else {
			return false;
		  }
		}
		else {
		  return false;
		}
	}
	public static String nTwice(String str, int n) {
		return (str.substring(0, n) + str.substring(str.length()-n, str.length()));
	}	
	public static String twoChar(String str, int index) {
		if ((index <= str.length()-2) && (index >= 0)) {
		  return (str.substring(index, index+2));
		}
		else {
		  return (str.substring(0, 2));
		}
	}
	public static String middleThree(String str) {
		String x = str.substring(0, str.length()-1);
		if (str.length() <= 3) {
		  return str;
		}
		else {
		  return (x.substring((x.length()/2)-1,(x.length()/2)+2 ));
		}
	}
	public static boolean hasBad(String str) {
		if ((str.length() <= 3)) {
		  if (str.equals ("bad")) {
			return true;
		  }
		  else {
		  return false;
		  }
		}
		else {
		if ((str.substring(0, 3).equals ("bad")) || (str.substring(1, 4).equals ("bad"))) {
		  return true;
		}
		else {
		  return false;
		}
		}
	}
	public static String atFirst(String str) {
		if (str.length() == 1) {
		  return (str + "@");
		}
		else if (str.length() == 0) {
		  return ("@@");
		}
		return (str.substring(0,2));
	}  
	public static String lastChars(String a, String b) {
		String output1 = "";
		String output2 = "";
		if (a.length() == 0) {
		  output1 = "@";
		}
		if (b.length() == 0) {
		  output2 = "@";
		}
		if (a.length() > 0) {
		  output1 = a.substring(0,1);
		}
		if (b.length() > 0) {
		  output2 = b.substring(b.length()-1,b.length());
		}
		return (output1 + output2);
	}
	public static String conCat(String a, String b) {
		if (a.equals("") || b.equals("")) {
		  return (a + b);
		}
		if (a.substring(a.length()-1, a.length()).equals(b.substring(0,1))) {
		  return (a.substring(0, a.length()-1) + b);
		}
		else {
		  return (a + b);
		}
	}
	public static String lastTwo(String str) {
		if (str.length() < 2) {
		  return str;
		}
		else {
		  return (str.substring(0,str.length()-2) + str.substring(str.length()-1, str.length()) + str.substring(str.length()-2, str.length()-1));
		}
	}
	public static String seeColor(String str) {
		String output = "";
		if (str.length() < 4) {
		  if (str.length() < 3) {
		  output = "";
		  }
		  else if (str.substring(0,3).equals("red")) {
			output = "red";
		  }
		}
		else {
		if (str.substring(0,3).equals("red")) {
		  output = "red";
		}
		else if (str.substring(0,4).equals("blue") && str.length() > 3) {
		  output = "blue";
		}
		else {
		  output = "";
		}
	  }
	  return output;
	}
	public static boolean frontAgain(String str) {
		if (str.length() < 2) {
		  return false;
		}
		else {
		  if (str.substring(0,2).equals(str.substring(str.length()-2, str.length()))) {
			return true;
		  }
		  else {
			return false;
		  }
		}
	}
	public static String minCat(String a, String b) {
		String output = "";
		if (a.length() == (b.length())) {
		  output = (a + b);
		}
		else if (a.length() > b.length()) {
		  output = (a.substring(a.length()-b.length(), a.length()) + b);
		}
		else if (b.length() > a.length()) {
		  output = (a + b.substring(b.length()-a.length(), b.length()));
		}
		return output;
	}	  
	public static String extraFront(String str) {
		String output = "";
		if (str.length() == 1) {
		  String one = (str.substring(0,1));
		  output = one + one + one;
		}
		else if (str.length() == 0) {
		  output = "";
		}
		else {
		  String two = (str.substring (0,2));
		  output = two + two + two;
		}
		return output;
	}
	public static String without2(String str) {
		if (str.length() < 2) {
		  return str;
		}
		else if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
		  return (str.substring(2,str.length()));
		}
		else {
		  return str;
		}
	}
	public static String deFront(String str) {    
		if (str.substring(0,1).equals ("a")) {
		  if (str.substring(1,2).equals ("b")) {
			return str;
		  }
		  else {
			return (str.substring(0,1) + str.substring(2, str.length()));
		  }
		}
		else {
		  if (str.substring(1,2).equals ("b")) {
			return (str.substring(1, str.length()));
		  }
		  else {
			return (str.substring(2, str.length()));
		  }
		}
	}
	public static String startWord(String str, String word) {
		if (str.length() >= word.length()) {
		if (word.substring(1, word.length()).equals (str.substring(1, word.length()))) {
		  return (str.substring(0, word.length()));
		}
		else {
		  return "";
		}
		}
		else {
		  return "";
		}
	}
	public static String withoutX(String str) {
		String output = "";
		if (str.length() < 2) {
		  if (str.equals ("x")) {
			output = "";
		  }
		  else {
			output = str;
		  }
		}
		else {
		if (str.substring(0,1).equals ("x")) {
		  if (str.substring (str.length()-1, str.length()).equals ("x")) {
			output = (str.substring(1, str.length()-1));
		  }
		  else {
		  output = str.substring(1, str.length());
		}
		}
		else {
		  if (str.substring (str.length()-1, str.length()).equals ("x")) {
			output = (str.substring(0, str.length()-1));
		  }
		  else {
			output = (str.substring(0, str.length()));
		  }
		}
		}
	  return output;
	}
	public static String withoutX2(String str) {
		String output = "";
		if (str.length() < 2) {
		  if (str.equals ("x")) {
			output = "";
		  }
		  else {
			output = str;
		  }
		}
		else {
		  if (str.substring(0, 1).equals ("x")) {
			if (str.substring(1,2).equals ("x")) {
			  output = str.substring(2, str.length());
			}
			else {
			  output = str.substring(1, str.length());
			}
		  }
		  else {
			if (str.substring(1,2).equals ("x")) {
			  output = str.substring(0, 1) + str.substring(2, str.length());
			}
			else {
			  output = str;
			}
		  }
		}
		return output;
	}	  

	public static void main(String[] args) {
		System.out.println(helloName("Daniel"));
		System.out.println(makeAbba("hello", "hi"));
		System.out.println(makeTags("i", "Yay"));
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(extraEnd("Hello"));
		System.out.println(firstTwo("Hello"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(withoutEnd("Hello"));
		System.out.println(comboString("Hello", "hi"));
		System.out.println(nonStart("Hello", "There"));
		System.out.println(left2("Hello"));
		System.out.println(right2("Hello"));
		System.out.println(theEnd("Hello", true));
		System.out.println(withouEnd2("Hello"));
		System.out.println(middleTwo("string"));
		System.out.println(endsLy("oddly"));
		System.out.println(nTwice("Hello", 2));
		System.out.println(twoChar("java", 2));
		System.out.println(middleThree("Candy"));
		System.out.println(hasBad("badxx"));
		System.out.println(atFirst("hello"));
		System.out.println(lastChars("last", "chars"));
		System.out.println(conCat("abc", "cat"));
		System.out.println(lastTwo("coding"));
		System.out.println(seeColor("redxx"));
		System.out.println(frontAgain("edited"));
		System.out.println(minCat("Hello", "Hi"));
		System.out.println(extraFront("Hello"));
		System.out.println(without2("HelloHe"));
		System.out.println(deFront("Hello"));
		System.out.println(startWord("hippo", "hi"));
		System.out.println(withoutX("xHix"));
		System.out.println(withoutX2("xHi"));
	}
}
	