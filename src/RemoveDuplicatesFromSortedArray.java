
public class RemoveDuplicatesFromSortedArray {
	/*
	 *  problem statement at https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
	 * 
	 */
    public int removeDuplicates(int[] nums) {
        int pos =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[pos]=nums[i];
                pos++;
            }
        }
        return pos;
    }
}
