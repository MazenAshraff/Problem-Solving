
public class PathSumIII {
	// Problem Statement: https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3417/
	int memo[][];

	public int pathSum(TreeNode root, int sum) {
		if (root == null)
			return 0;
		return pathSumHelper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

	public int pathSumHelper(TreeNode root, int sum) {
		if (root == null)
			return 0;
		return (root.val == sum ? 1 : 0) + pathSumHelper(root.right, sum - root.val)
				+ pathSumHelper(root.left, sum - root.val);
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
