import java.util.Arrays;
import java.util.ArrayList;
public class IntersectionOf2Arrays {
	/*
	 * Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else{
                if(nums1[i]<nums2[j]){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        int out[]= new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            out[i]=arr.get(i);
        }
        return out;
    }

}
