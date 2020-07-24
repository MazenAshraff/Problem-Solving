
public class MergeSortedArrays {
	/*
	 * Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=n+m-1;i>=0;i--){
            if(n>=1&&m>=1)
            if(nums2[n-1]>nums1[m-1]){
                nums1[i]=nums2[n-1];
                n--;
            }
            else{
                nums1[i]=nums1[m-1];
                m--;
            }
            else{
                if(n<1){
                    nums1[i]=nums1[m-1];
                    m--;
                }
                else if(m<1){
                    nums1[i]=nums2[n-1];
                    n--;
                }
            }
        }
        
    }

}
