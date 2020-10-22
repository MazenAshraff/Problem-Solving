
public class ConvertSortedArrayToBinarySearchTree {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/631/
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return makeBST(nums,0,nums.length-1);
    }
    public TreeNode makeBST(int [] nums,int lo,int hi){
        if(lo>hi){
            return null;
        }
        int mid = lo +(hi-lo)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.right= makeBST(nums,mid+1,hi);
        root.left=makeBST(nums,lo,mid-1);
        return root;
        
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
