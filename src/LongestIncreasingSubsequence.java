import java.util.Arrays;

public class LongestIncreasingSubsequence {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/810/
	int memo[][];
    public int lengthOfLIS(int[] nums) {
        memo= new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return LIS(nums,0,0);
    }
    public int LIS(int nums[], int i,Integer val){
        if(i==nums.length) return 0;
        if(memo[i][val]!=-1) return memo[i][val];
        int take=0;

        if(val==0||nums[i]>nums[val-1]) take=1+LIS(nums,i+1,i+1);
        int leave = LIS(nums,i+1,val);
        return memo[i][val] = Math.max(leave,take);
    }
}
