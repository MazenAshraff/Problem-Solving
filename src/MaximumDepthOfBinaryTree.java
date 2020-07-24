
public class MaximumDepthOfBinaryTree {
	/*
	 * Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
	 */
	public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int right = 1;
        int left = 1;
        if(root.right!=null){
            right = 1 + maxDepth(root.right);
            
        }
        if(root.left!=null){
            left = 1+ maxDepth(root.left);
        }
        return Math.max(right,left);
        
    }
	  public class TreeNode {
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
