class SingleNumberNinja {
  public static void main (String[]args) {
    int [] testArr = {2,2,1};
    SingleNumberNinja test = new SingleNumberNinja();
    System.out.println(test.singleNumber(testArr));
  }

  public static int singleNumber(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }
}
