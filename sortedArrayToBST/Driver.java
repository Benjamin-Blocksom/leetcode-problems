import java.util.Arrays;
 
public class Driver {


/**
* A printing utility function 
*
*/

  void preOrder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
  
        System.out.print(node.data + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }

  public static void main(String[]args){
	Solution solution = new Solution();
	int[] test = {-42,-9,-13,29,35};
	int n = test.length;
	rootNode = solution.sortedtArrayToBST(test, 0, n-1);
	solution.preOrder(rootNode);
  }
}