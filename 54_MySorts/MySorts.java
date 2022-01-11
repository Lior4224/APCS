/*
Lior Polischouk + Toothless
APCS pd6
HW54 -- One File to Bring Them All...(MySorts)
2022-01-11
time spent: <0.5 hrs
*/
import java.util.*;

public class MySorts{
  // * In each pass of the arraylist, we use an if statement inside a for loop to compare consecutive elements on the arraylist. 
  // * If index x is less than the index x - 1, they swap places.
  // * We keep passing through the arraylist until we reach the amount of passes that occured. 
  public static void bubble( ArrayList<Comparable> data )
  {
      int swapCount = 0;
      if (data.size() <= 1) {
        System.out.println(swapCount);
        return;
      }
      else {
          for (int i = 0; i < data.size() - 1; i++) {
              for (int j = data.size() - 1; j > i; j--) {
                  if (data.get(j).compareTo(data.get(j-1)) < 0) {
                      Comparable temp = data.get(j);
                      data.set(j, data.get(j-1));
                      data.set(j-1, temp);
                      swapCount++;
                  }
              }
          }
          System.out.println(swapCount);
          return;
      }
  }
  
  // * Searches for greatest element that hasn't  been found yet and swaps it at the rightmost spot;
  // * Repeats for decreasing elements and decreasing spots;
  // * If element is in the correct spot, it still swaps with itself and therefore there is always the same amount of swaps.
  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int swapCount = 0;
    for( int pass = 1; pass<=data.size();pass++ ) {
      int maxPos=0;
      for(int idx = 0;idx<=data.size()-pass;idx++) {
        if (data.get(maxPos).compareTo(data.get(idx))<0){
          maxPos = idx;
        }
      }
      swapCount++;
      Comparable temp = data.get(maxPos);
      data.set(maxPos,data.get(data.size()-pass));
      data.set(data.size()-pass,temp);
    }
    System.out.println(swapCount);
  }//end selectionSort
  
  // * Partition list into sorted and unsorted regions.
  // * "Walk" an element from unsorted region up to its place in sorted region.
  // * Increase size of sorted partition by 1.
  // * Repeat steps 2 and 3 until sorted.
  public static void insertion( ArrayList<Comparable> data )
  {
    int swapCount = 0;
    for( int partition = 1 ; partition < data.size() ; partition++ ) {
      //partition marks first item in unsorted region
      //traverse sorted region from right to left
      for( int index = partition - 1 ; index >= 0; index-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(index).compareTo(data.get(index + 1)) > 0) {
          Comparable temp = data.get(index);
          data.set(index, data.get(index +1));
          data.set(index +1, temp);
          swapCount++;
        }
        else
          break;
      }
    }
    System.out.println(swapCount);
  }//end insertionSortV
}
