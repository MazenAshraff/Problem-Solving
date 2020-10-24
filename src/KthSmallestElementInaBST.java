import java.util.ArrayList;

public class KthSmallestElementInaBST {
	// Problem statement : https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/790/
	ArrayList<Integer> arr = new ArrayList<Integer>();

	public int kthSmallest(TreeNode root, int k) {
		inorder(root);
		return arr.get(k - 1);
	}

	public void inorder(TreeNode k) {
		if (k == null)
			return;
		inorder(k.left);
		arr.add(k.val);
		inorder(k.right);
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
