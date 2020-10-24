import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	// Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/786/
	  List<Integer> arr = new ArrayList<Integer>();
	    Stack<TreeNode> s= new Stack<>();
	    //Iterative solution
	    public List<Integer> inorderTraversal(TreeNode root) {
	        TreeNode temp=root;
	    while(temp!=null||!s.isEmpty()){
	        if(temp!=null){
	            s.push(temp);
	            temp=temp.left;
	        }
	        if(temp==null){
	            temp=s.pop();
	            arr.add(temp.val);
	             temp=temp.right;
	            }
	        }

	    return arr;
	    }
	    
	    // recursive solution
	    public void inorder(TreeNode root){
	        if(root==null) return;
	        inorder(root.left);
	        arr.add(root.val);
	        inorder(root.right);
	    }

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	     
}
