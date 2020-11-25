// Reverse an Array of char

class ReverseArray {
  public static void main (String [] args) {
    char [] testArr = {'a', 'b', 'c', 'g', 'h'};
    System.out.print(reverseArrayMethod(testArr, testArr.length));
  }

  static char[] reverseArrayMethod (char arr[], int arrSize) {
  	char [] temp = new char[arrSize];
	int j = arrSize;

	for (int i = 0; i < arrSize; i++){
	  temp[j-1] = arr[i];
	  j--;
	}

	return temp;
  } 
}
