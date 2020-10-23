
public class IncreasingTripletSubsequence {
	// Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/781/
	 public boolean increasingTriplet(int[] nums) {
	        int a=-1,b= -1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]>nums[i-1]&&(a==-1||(nums[i-1]<nums[a]&&nums[i]<nums[b]))){
	                a=i-1;
	                b=i;
	            }
	            else{
	                if(b>=1&&nums[i]<nums[b]&&nums[i]>nums[a]){
	                    b=i;
	                }
	                else{
	                    if(b>=1&&nums[i]>nums[b]) return true;
	                }
	            }
	        }
	        return false;
	    }
}
