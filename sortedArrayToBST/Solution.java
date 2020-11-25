/**
* 1. Get middle of array and make it the root
* 2. Recursively do the same for left and right halves where:
* 	a) get middle of left half and make it left of root
*	b) get middle of right half and make it right of root
/*

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return buildTreeFromArray(nums, 0, nums.length-1);
    }
    
    public TreeNode buildTreeFromArray(int[] nums, int left, int right){
        if(left>right)return null;
        int midpoint = left + (right-left) / 2;
	TreeNode node = new TreeNode(nums[midpoint]);
        node.left = buildTreeFromArray(nums, left, midpoint-1);
        node.right = buildTreeFromArray(nums, midpoint+1, right);
        
        return node;
    }
}