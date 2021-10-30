public class string2[
	public String doubleChar(String str) {
  		String output = "";
  		for (int i = 0; i < str.length(); i++) {
    			output += str.substring(i,i+1);
    			output += str.substring(i,i+1);
  		}
  		return output;
	}
	public int countHi(String str) {
  		int output = 0;
  		for (int i = 0; i < str.length()-1; i++) {
    			if ((str.substring(i, i+2)).equals ("hi")) {
     				 output += 1;
    			}
  		}
  		return output;
	}
	public boolean catDog(String str) {
  		int output1 = 0;
  		int output2 = 0;
  		for (int i = 0; i < str.length()-2; i++) {
    			if ((str.substring(i, i+3)).equals ("cat")) {
     				 output1 += 1;
    			}
  		}
  		for (int j = 0; j < str.length()-2; j++) {
    			if ((str.substring(j, j+3)).equals ("dog")) {
     				 output2 += 1;
    			}
  		}
  		return (output1 == output2);
	}



