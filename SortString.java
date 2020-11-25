
// Check if one string is anagram of other


import java.util.Arrays;

class SortString {

    // sort String in alphabetical order
    static String sortString(String str) {
	char []arr = str.toCharArray();
	Arrays.sort(arr);
	return String.valueOf(arr); 
    }

    // compare two sorted Strings 
    static boolean checkAnagram(String x, String y) {
	boolean flag = false;
	x = sortString(x);
	y = sortString(y);
	if (x.equals(y)) { flag = true; }

	return flag;
    }
    
    // Main driver to test
    public static void main(String[] args){
        String a = "abc";
	String b = "cba";	

	System.out.println(checkAnagram(a, b));
    }
}

