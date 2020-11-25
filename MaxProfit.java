class MaxProfit {
  public int maxProfit(int[] prices) {
    int maxprofit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i -1])
	      maxprofit += prices[i] - prices[i-1];
    }
    return maxprofit;
  }

  public static void main (String[]args){
    int[] testArray = {1, 7, 2, 3, 6, 7, 6, 7};
    MaxProfit test = new MaxProfit();
    System.out.println(test.maxProfit(testArray));
  }
}
