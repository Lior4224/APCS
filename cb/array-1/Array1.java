/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
HW36 -- PPMP[]
2021-11-16
time spent: .5 hours
DISCO
-
QCC
-
*/
public class Array1 {
    public static boolean firstLast6(int[] nums) {
      return (nums[0]==6 || nums[nums.length - 1]==6);
    }
    public static boolean sameFirstLast(int[] nums) {
      return (nums.length > 0 && nums[0]==nums[nums.length - 1]);
    }
    public static int[] makePi() {
      int [] pi = {3, 1, 4};
      return pi;
    }
    public static boolean commonEnd(int[] a, int[] b) {
      return (a[0]==b[0] || a[a.length - 1]==b[b.length - 1]);
    }
    public static int sum3(int[] nums) {
      int local = 0;
      for (int element : nums) {
        local += element;
      }
      return local;
    }
    public static void main (String[] args) {
        int[] test1 = new int[] {1, 2, 6};
        System.out.println(firstLast6(test1));
        int[] test2 = new int[] {1, 2, 3};
        System.out.println(sameFirstLast(test2));
        System.out.println(makePi());
        int[] test3 = new int[] {1, 2, 3};
        int[] test3_1 = new int[] {7, 3};
        System.out.println(commonEnd(test3, test3_1));
        int[] test4 = new int[] {1, 2, 3};
        System.out.println(sum3(test4));
    }
  }