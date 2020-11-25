import java.util.*;

class MoveZeroes {
  static int [] TEST_ARRAY;
  static {
    TEST_ARRAY = new int[] {
    new Integer(0),
    new Integer(0),
    new Integer(1),
    new Integer(0),
    new Integer(0),
    new Integer(1),
    new Integer(0),
    new Integer(12),
    new Integer(1),
    };
}

  public static int[] moveZeroes(int[] nums) {
        if(nums.length <= 1)
          return nums;

        int zeroIndex = 0;

        // replace all zeroes
        for(int i = 0; i < nums.length; i++) {
          if(nums[i] != 0){
            nums[zeroIndex] = nums[i];
            zeroIndex++;
          }
        }

        // fill in zeroes
        while(zeroIndex < nums.length) {
          nums[zeroIndex] = 0;
          zeroIndex++;
        }

        return nums;
      }

  public static void main (String[]args) {
      System.out.println(Arrays.toString(moveZeroes(TEST_ARRAY)));
  }

}
