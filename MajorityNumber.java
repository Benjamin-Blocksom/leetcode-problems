// This brute force search contains two nested
// for loops that run for n iterations, adding up 
// to quadratic time complexity.

class MajorityNumber {
  public static int getMajority (int[] nums) {
    
    int majorityCount = nums.length/2;

    // Brute force search by iterating over array
    for (int num : nums) {
      int count = 0;
      for (int elem : nums) {
        if (elem == num) {
	  count += 1;
	}
      }

      if (count > majorityCount) {
        return num;
      }
    }
 	// if for some reason the above did not return 
    return -1; 
  }

  public static void main (String[]args) {
    int [] testArr = {2,1,1,2,2};
    System.out.println(getMajority(testArr));
  }
}
