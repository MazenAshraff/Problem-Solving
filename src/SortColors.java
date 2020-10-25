import java.util.Arrays;

public class SortColors {
	// Problem Statement : https://leetcode.com/problems/sort-colors/
	public static void sortColors(int[] nums) {
		int twos = nums.length - 1;
		int zeros = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			if (nums[i] == 2 && i < twos) {
				if (twos == i) {
					twos--;
					continue;
				}
				while (twos >= 0 && nums[twos] == 2) {
					twos--;
				}
				if (twos < 0||twos<=zeros||twos<i)
					continue;
				nums[i] = nums[twos];
				nums[twos] = temp;
				twos--;
				System.out.println(twos);
			}

			temp = nums[i];
			if (nums[i] == 0 && i > zeros) {
				if (zeros == i) {
					zeros++;
					continue;
				}
				while (zeros < nums.length && nums[zeros] == 0) {
					zeros++;
				}
				if (zeros == nums.length||zeros>=twos||zeros>i)
					continue;
				nums[i] = nums[zeros];
				nums[zeros] = temp;
				zeros++;
			}
		}
	}

	public static void main(String[] args) {
		sortColors(new int[] {0,1,2,0,0,2,2,1});
	}
}
