/*
Team LNN: Lior Polischouk, Nakib Abedin, Nicole Zhou
APCS pd6
HW27: FOR the Love of Strings
2021-10-28
Time elapsed: 
*/
/*
DISCO:
0. 
QCC:
0. 
*/

public class Rof {
    public static String fenceF (int posts) {
        String output = "|";
        for (int i = 1; i < posts; i++) {
            output += "--|";   
            }
            if (posts == 0) {
                output = "No posts";
                return output;
            }
            return output;
        }
    public static String reverseF (String s) {
        String output = "";
        for (int i = s.length()-1; i >= 0; i--) {
            output += s.substring(i,i+1);
        }
        return output;
    }
    public static void main( String[] args ) { 
        System.out.println(fenceF(5));
        System.out.println(fenceF(0));
        System.out.println(fenceF(25));
        System.out.println(reverseF("desserts"));
    }
}