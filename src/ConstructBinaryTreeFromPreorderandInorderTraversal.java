
public class ConstructBinaryTreeFromPreorderandInorderTraversal {
	int[] pre, in;
	int p = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		pre = preorder;
		in = inorder;
		if (in.length == 0)
			return null;
		return build(0, in.length - 1);
	}

	public TreeNode build(int i, int j) {
		if (i > j)
			return null;
		TreeNode root = new TreeNode(pre[p++]);
		if (i == j)
			return root;
		int idx = find(root.val);
		root.left = build(i, idx - 1);
		root.right = build(idx + 1, j);
		return root;

	}

	public int find(int x) {
		for (int i = 0; i < in.length; i++) {
			if (x == in[i]) {
				return i;
			}
		}
		return -1;
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
