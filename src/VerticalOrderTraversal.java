import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class VerticalOrderTraversal {
	// Problem Statement : https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3415/
	TreeMap<Integer, TreeSet<Triplet>> tm;

	public List<List<Integer>> verticalTraversal(TreeNode root) {
		tm = new TreeMap<>();
		verticalTraversal(root, 0, 0);
		List<List<Integer>> arr = new ArrayList<>();
		int i = 0;
		for (int k : tm.keySet()) {
			TreeSet<Triplet> t = tm.get(k);
			arr.add(new ArrayList<>());
			for (Triplet x : t) {
				arr.get(i).add(x.val);
			}
			i++;
		}
		return arr;

	}

	public void verticalTraversal(TreeNode root, int X, int Y) {
		if (root == null)
			return;
		if (tm.get(X) == null) {
			tm.put(X, new TreeSet<Triplet>());
		}
		tm.get(X).add(new Triplet(root.val, X, Y));
		verticalTraversal(root.left, X - 1, Y - 1);
		verticalTraversal(root.right, X + 1, Y - 1);

	}

	class Triplet implements Comparable<Triplet> {
		int val;
		int x;
		int y;

		public Triplet(int v, int x, int y) {
			val = v;
			this.x = x;
			this.y = y;
		}

		public int compareTo(Triplet o) {
			return x == o.x && y == o.y ? val - o.val : x == o.x ? o.y - y : x - o.x;
		}
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

	public static void main(String[] args) {
		System.out.println((Integer.MAX_VALUE/10)*10+8);
	}
}
