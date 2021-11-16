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
      //Given an array of ints, return true if 6 appears as either the first or last element in the array. 
      //The array will be length 1 or more.
      return (nums[0]==6 || nums[nums.length - 1]==6);
    }
    public static boolean sameFirstLast(int[] nums) {
      //Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
      return (nums.length > 0 && nums[0]==nums[nums.length - 1]);
    }
    public static int[] makePi() {
      //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
      int [] pi = {3, 1, 4};
      return pi;
    }
    public static boolean commonEnd(int[] a, int[] b) {
      //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
      //Both arrays will be length 1 or more.
      return (a[0]==b[0] || a[a.length - 1]==b[b.length - 1]);
    }
    public static int sum3(int[] nums) {
      //Given an array of ints length 3, return the sum of all the elements.
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
