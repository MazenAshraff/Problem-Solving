import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	// Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/
	List <List <Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = height(root);
        for(int i=0;i<height;i++){
            ans.add(new ArrayList<Integer>());
        }
        levelOrder(root,0);
        return ans;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.right),height(root.left));
    }
    public void levelOrder(TreeNode root, int level){
        if(root == null) return;
        ans.get(level).add(root.val);
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
        
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
