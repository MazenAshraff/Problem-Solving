
public class ShuffleAnArray {
	
	//Problem Statement: https://leetcode.com/explore/featured/card/top-interview-questions-easy/98/design/670/
	  int nums[];
	     public ShuffleAnArray (int[] nums) {
	        this.nums = nums;
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        return nums;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	        int [] k = new int[nums.length];
	        for(int i=0;i<k.length;i++) k[i] = nums[i];
	        for(int i=0;i<k.length;i++){
	            int idx=(int) (Math.random()*k.length);
	            int temp=k[idx];
	            k[idx]=k[i];
	            k[i]=temp;
	        }
	        return k;
	    }
}
