NAME (Lior + Toothless, Jacob + Jacob Jr., Jeffery + Mathias)
=======

NAME (Lior + Toothless, Jacob + , Jeffery + Mathias)

APCS pd6

Lab04 -sort-o_NAME

2022-01-06

time spent: 0.5 hours

Bubble:

    Best case: Array is already sorted least to greatest: O(n)
    Worst case: Array is in backwards order (greatest to least) : O(n^2)
    Reasoning:
      We will count the number of swaps by counting the number of times an element swaps with one to its' right.
      For each element in the collection, we can look at the element to its' right. If the element is greater,
      the pair will not swap, because the two would already be ordered if they reach consecutive places. 
      If the element is less, they will have to swap exactly once, because the second element needs to pass 
      the first in order to be left of the first at the end of the process. In an array that is already sorted 
      from least to greatest, no swaps will be required. In an array sorted from greatest to least, the most 
      amount of swaps will be required because the beginning elements must be swaped one index at a time to end up 
      at the highest indexes.

Selection:

    Best case: any case : O(n^2)
    Worst case: any case : O(n^2)
    Reasoning:
        We will count the number of swaps done on an ArrayList in ascending order, descending order, and random order
        with the same number of elements. The number of swaps will be equal in any case because although the order may
        affect the time it takes to locate each subsequent element, the number of swaps required will always be equal
        to the size of the ArrayList. Swaps are done for each index of the ArrayList, including when an element swaps
        to its current index.

Insertion:

    Best case: Array is already sorted least to greatest : O(n)
    Worst case: Array is in backwards order (greatest to least) : O(n^2)
    Reasoning:
        It is similiar to Bubble Sort in that it will take the most swaps to sort an ArrayList in descending order, as
        a greater number of swaps is required to sort the unsorted region.

Bubble:
* Best case: Array is already sorted least to greatest
* Worst case: Array is in backwards order (greatest to least)

Selection:
* Best case: any case
* Worst case: any case

Insertion:
* Best case: Array is already sorted least to greatest
* Worst case: Array is in backwards order (greatest to least)
