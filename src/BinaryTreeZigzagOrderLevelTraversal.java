import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagOrderLevelTraversal {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/787/
	 LinkedList<TreeNode> l= new LinkedList<TreeNode>();
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        List<List<Integer>> arr = new ArrayList<List<Integer>>();
	        if(root==null) return arr;
	        l.add(root);
	        boolean startFromLast =false;
	        int i=0;
	        while(!l.isEmpty()){
	            int level = l.size();
	            arr.add(new ArrayList<>());
	            while(level-->0){
	                if(!startFromLast){
	                    TreeNode temp= l.removeFirst();
	                    int val = temp.val;
	                    arr.get(i).add(val);
	                    if(temp.left!=null)
	                        l.add(temp.left);
	                    if(temp.right!=null)
	                        l.add(temp.right);
	                }else{ 
	                    TreeNode temp=l.removeLast();
	                    int val = temp.val;
	                    arr.get(i).add(val);
	                    if(temp.right!=null)
	                        l.addFirst(temp.right);
	                    if(temp.left!=null)
	                        l.addFirst(temp.left);
	                    }
	            }
	                i++;
	                startFromLast=!startFromLast;
	          }
	        return arr;
	    
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
