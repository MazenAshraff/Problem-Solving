
public class MissingNumber {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/
	 public int missingNumber(int[] nums) {
	        int sum =0;
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	        }
	        int n=nums.length;
	        return n*(n+1)/2 -sum;
	    }
}
