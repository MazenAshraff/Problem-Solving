import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ThreeSum {
	/*
	 * Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> arr = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int lo = j + 1;
				int hi = nums.length - 1;
				while (lo <= hi) {
					int mid = lo + hi >> 1;
					int tar = -(nums[i] + nums[j]);
					if (nums[mid] == tar) {
						ArrayList<Integer> sub = new ArrayList<Integer>();
						sub.add(nums[i]);
						sub.add(nums[j]);
						sub.add(tar);
						arr.add(sub);
						break;
					} else if (nums[mid] > tar) {
						hi = mid - 1;
					} else {
						lo = mid + 1;
					}
				}

			}
		}
		return arr;
	}
}
