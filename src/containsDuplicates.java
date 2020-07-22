import java.util.HashSet;
public class containsDuplicates {
	/*
	 * problem statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
	 */
	 public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> uniq = new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            if (uniq.contains(nums[i])){
	                return true;
	            }
	            else{
	                uniq.add(nums[i]);
	            }
	        }
	        return false;
	    }
}
