// Reverse an array using two point opposite direction logic

public class ReverseArrayTwoPointer {
  public static void main (String [] args) {
    char [] testArr = {'a','i','r','p','l','a','n','e'};
    System.out.println(reverseArr(testArr, testArr.length));
  }

  static char[] reverseArr (char sourceArr[], int arrLength) {
    int i;
    char temp;
    for ( i = 0; i < arrLength / 2; i++ ) {
      temp = sourceArr[i];
      System.out.println(temp);
      System.out.println(sourceArr);
      sourceArr[i] = sourceArr[arrLength - i - 1];
      System.out.println(temp);
      System.out.println(sourceArr); 
      sourceArr[arrLength - i - 1] = temp;
      System.out.println(temp);
      System.out.println(sourceArr);
    }

    return sourceArr;
  }
}
