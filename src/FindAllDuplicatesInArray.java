import java.util.*;
public class FindAllDuplicatesInArray {
	// Problem Statement : https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/
	 public List<Integer> findDuplicates(int[] nums) {
	        HashSet<Integer>hs = new HashSet<Integer>();
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(!hs.add(nums[i]))
	                ans.add(nums[i]);
	        }
	        return ans;
	    }
}
