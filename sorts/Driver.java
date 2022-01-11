import java.util.*;
public class Driver{
  public static ArrayList<Comparable> makeAscending(int size){
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0;i<size;i++){
      glen.add(i);
    }
    return glen;
  }

  public static ArrayList<Comparable> makeDescending(int size){
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0;i<size;i++){
      glen.add(size-i);
    }
    return glen;
  }

  public static ArrayList<Comparable> makeRandom(int size){
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0;i<size;i++){
      glen.add((int) 100000*Math.random());
    }
    return glen;
  }

  public static void main(String[] args){
    int size = Integer.parseInt(args[0]);
    int randos = Integer.parseInt(args[1]);
    if (args[2].equals("bubble")){
        System.out.println("Suspected best case:");
        ArrayList glek =makeAscending(size);
        Sorts.bubble(glek);
        System.out.println("Random cases:");
        for (int i = 0;i<randos;i++){
          ArrayList glem = makeRandom(size);
          Sorts.bubble(glem);
        }
        System.out.println("Suspected worst case:");
        ArrayList glen = makeDescending(size);
        Sorts.bubble(glen);
    } else if (args[2].equals("insertion")){
        System.out.println("Suspected best case:");
        ArrayList glek =makeAscending(size);
        Sorts.insertion(glek);
        System.out.println("Random cases:");
        for (int i = 0;i<randos;i++){
           ArrayList glem = makeRandom(size);
           Sorts.insertion(glem);
        }
        System.out.println("Suspected worst case:");
        ArrayList glen = makeDescending(size);
        Sorts.insertion(glen);
    } else if (args[2].equals("selection")){
              System.out.println("Random cases:");
              for (int i = 0;i<randos;i++){
                 ArrayList glem = makeRandom(size);
                 Sorts.selection(glem);
              }
        }
    }
}
