
public class FindMinimumInRotatedSortedArray {
	// Problem Statement : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public int findMin(int[] nums) {
        int lo = 0;
        int hi= nums.length-1;
        int min = nums[0];
        while(lo<=hi){
            int mid=lo+(hi-lo>>1);
            if(mid<nums.length-1&&nums[mid]>nums[mid+1]){return nums[mid+1];}
            if(mid>0&&nums[mid]<nums[mid-1]){return nums[mid];}
            if(nums[mid]<=nums[0]){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return min;
    }
}
