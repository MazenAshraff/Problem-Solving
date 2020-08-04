import java.util.Arrays;
public class HouseRobber {
	/*
	 * Problem statement : https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/576/
	 */
	 int memo[];
	    public int rob(int[] nums) {
	        memo = new int [nums.length];
	        Arrays.fill(memo,-1);
	        return rob(nums,0);
	       
	}
	    public int rob (int [] nums,int i){
	        if(i>=nums.length) return 0;
	        if(memo[i]!=-1) return memo[i];
	        int take = nums[i]+rob(nums,i+2);
	        int leave = rob(nums,i+1);
	        return memo[i]= Math.max(take,leave);
	    }
}
