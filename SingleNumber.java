// 136. Single Number: given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// Algorithm: 
// 1. Create an ArrayList 
// 2. Iterate over all elements of array being tested.
// 3. If some element is not in the ArrayList, add it.
// 4. If some number is already in the ArrayList, remove it.
import java.util.*;

class SingleNumber {
  public static void main (String[]args) {
	int [] arr = {2, 2, 4, 4, 1};
	List<Integer> no_duplicate_list = new ArrayList<>();

	for (int i : arr) {
	  if(!no_duplicate_list.contains(i)) {
	    no_duplicate_list.add(i);
	  } else {
	    no_duplicate_list.remove(new Integer(i));
	  }
	}
	System.out.println(no_duplicate_list.get(0));
  }
}
