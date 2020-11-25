// Algorithm:
// 1. Initialize empty answer list
// 2. Iterate on integers from 1...N.
// 3. For each number, check if divisible by 3 and 5, if yes add string '"FizzBuzz",' to list.
// 4. Else, Check if Divisible by 3, if yes add "Fizz" to list.
// 5. Else, check if divisible by 5, if yes add "Buzz" to List.
// 6. Else add number to list. 

import java.util.*;

class FizzBuzz {
  public List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<String>();

    for (int i = 0; i < n; i++) {
      boolean divisibleBy3 = (i % 3 == 0);
      boolean divisibleBy5 = (i % 5 == 0);

	if (divisibleBy3 && divisibleBy5) answer.add("FizzBuzz");
	else if (divisibleBy3) answer.add("Fizz");
	else if (divisibleBy5) answer.add("Buzz");
	else answer.add(Integer.toString(i));
    }
  
    return answer;
  }

  public static void main (String[]args) {
    FizzBuzz test = new FizzBuzz();
   System.out.println(test.fizzBuzz(123)); 
  }
}
