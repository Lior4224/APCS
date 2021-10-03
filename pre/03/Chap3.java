import java.util.Scanner;
import java.util.Random;

public class Chap3 {
  public static void main(String[] args){
    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    Scanner in = new Scanner(System.in);
    System.out.print("Type a number: ");
    int num1 = in.nextInt();
    System.out.println("Your guess was " + num1);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println("The number I was thinking of is: " + number);
    System.out.println("You were off by: " + (Math.abs(num1 - number)));
  }
}
//Scanner in = new Scanner(System.in);
