/*
TNPG: Worked alone (was absent) 
APCS Pd.6
HW25. Do I repeat myself?
2021-10-26
Time elapsed: ~45 minutes (got stuck with recursion)
DISCO:
0.  Learned that for recursion, I can return a method of a previous value 
(return fenceR(numPosts-1)).
1. Cannot initialize a variable with recursion since the variable will keep resetting.
QCC:
0. Is there any benefit to using recursion over while loops or vice versa?
 */
public class Repeater {
    public static String fenceW (int numPosts) {
        String output = "|";
        int posts = 1;
        if (numPosts == 0) {
            output = "No posts";
        }
        if (numPosts == 1) {
            return output;
        }
        while (posts < numPosts) {
            output += "--|";
            posts += 1;
        }
        return output;
    }
    public static String fenceR(int numPosts) {
        // String output = "|";
        if (numPosts == 0) {
            return "No posts";
        }
        if (numPosts == 1) {
            return "|";
        }
        else {
            System.out.print ("|--");
            return fenceR(numPosts - 1);
        }
    }
    public static void main (String[] args) {
        System.out.println(fenceW (25));
        System.out.println("\n");
        System.out.println(fenceR (10));
    }
}