
public class JumpGame {
	//Problem statement: https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/807/
	Boolean memo[];

	public boolean canJump(int[] nums) {
		int n = nums.length;
		memo = new Boolean[n];
		return jump(nums);
	}
	// Recursive DP approach
	public boolean jump(int[] nums, int i) {
		if (i >= nums.length - 1)
			return true;

		if (memo[i] != null)
			return memo[i];
		boolean ans = false;
		for (int j = nums[i]; j >= 1; j--) {
			ans |= jump(nums, i + j);
			if (ans)
				break;
		}
		if (ans) {
			return memo[i] = true;
		} else {
			return memo[i] = false;
		}
	}
	//Iterative DP approach
	// for the iterative version to work, you have to change the type of memo from Boolean to boolean across the code.
	public boolean jump(int[] nums) {
		memo[nums.length - 1] = true;
		for (int i = nums.length - 2; i >= 0; i--) {
			for (int j = Math.min(nums[i], nums.length - 1 - i); j >= 1; j--) {
				if (memo[i + j] == true) {
					memo[i] = true;
				}
			}
		}
		return memo[0];
	}
}
