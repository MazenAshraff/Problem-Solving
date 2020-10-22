
public class ReverseBits {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/648/
	 public int reverseBits(int n) {
	        int ans =0;
	        for(int i=31,j=0;i>=0;i--,j++){
	            ans|= (n&(1<<i))!=0? 1<<j:0;
	        }
	        return ans;
	    }
}
