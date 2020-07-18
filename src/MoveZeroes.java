import java.util.*;
public class MoveZeroes {
	
	/*
	 * problem statement at https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3286/
	 */

	public void moveZeroes(int[] nums) {
        Queue<Integer> q= new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                q.add(i);
                
            }
            else{
                if(nums[i]!=0&&!q.isEmpty()){
                    int pos=q.poll();
                    nums[pos]=nums[i];
                    nums[i]=0;
                    q.add(i);
                }
            }
        }
    }
}
