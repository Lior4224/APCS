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
public class Array2 {
    public static int countEvens(int[] nums) {
      int local = 0;
      for (int element : nums) {
        if (element % 2 == 0) {
          local += 1;
        }
      }
      return local;
    }
    public static int bigDiff(int[] nums) {
      int max = 0;
      int min = 999;
      for (int element : nums) {
        max = Math.max(max, element);
        min = Math.min(min, element);
      }
      return max - min;
    }
    public static int centeredAverage(int[] nums) {
      int max = 0;
      int min = 999;
      int sum = 0;
      for (int element : nums) {
        max = Math.max(max, element);
        min = Math.min(min, element);
        sum += element;
      }
      return (sum - (max + min))/(nums.length - 2);
    }
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int x = 0; x < nums.length; x += 1) {
          if (x == 0 && nums[x] != 13) {
            sum += nums[x];
          }
          else if (nums[x] != 13 && nums[x-1] != 13) {
            sum += nums[x];
          }
        }
        return sum;
    }
    public static int sum67(int[] nums) {
        int sum = 0;
        for (int x = 0; x < nums.length; x += 1) {
          if (nums[x] == 6) {
            while (nums[x] != 7) {
              x += 1;
            }
          }
          else {
            sum += nums[x];
          }
        }
        return sum;
    }
    public static void main(String []args) {
        int[] test1 = new int[] {2, 1, 2, 3, 4};
        System.out.println(countEvens(test1));
        int[] test2 = new int[] {10, 3, 5, 6};
        System.out.println(bigDiff(test2));
        int[] test3 = new int[] {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(test3));
        int[] test4 = new int[] {1, 2, 2, 1, 13};
        System.out.println(sum13(test4));
        int[] test5 = new int[] {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(test5));
    }
}