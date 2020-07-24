import java.util.HashMap;
public class TwoSum {
	/*
	 * Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
	 */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum[]= new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&i!=map.get(target-nums[i])){
                sum[0]=i;
                sum[1]=map.get(target-nums[i]);
                return sum;
            }
        }
        
        return null;
    }
}
