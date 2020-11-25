
// Check if one String is an anagram of another.

import java.util.Arrays;


class SortStringWithStreamAPI {

// Sort a String alphabetically using Java's Stream API.
    static String sortString(String str) {
	String sorted = str.chars()
		.sorted()
		.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		.toString();
	return sorted;
 
    }

    
// Check if one string is anagram of other;
    static boolean checkAnagram(String x, String y) {
   	boolean flag = false; 
	if (sortString(x).equals(sortString(y))) { flag = true; } 
	
	return flag;
}
    
    public static void main(String[] args){
        String a = "Uma Vez Flamengo";
	String b = "amU zeV ognemalF";
	System.out.println(checkAnagram(a, b));
    }
}

