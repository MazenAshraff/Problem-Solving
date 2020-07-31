
public class SymmetricTree {
	/*
	 * Problem Statement : https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/627/
	 */
	public boolean isSymmetric(TreeNode root) {

		return root == null ? true : isSymmetric(root.right, root.left);
	}

	public boolean isSymmetric(TreeNode right, TreeNode left) {
		if (right == null && left == null)
			return true;
		if (right == null ^ left == null)
			return false;
		if (right.val == left.val)
			return isSymmetric(right.left, left.right) && isSymmetric(left.left, right.right);

		else
			return false;

	}

	class TreeNode {
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
