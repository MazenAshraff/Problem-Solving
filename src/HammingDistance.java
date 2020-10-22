
public class HammingDistance {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
	 public int hammingDistance(int x, int y) {
	        int z = x ^ y;
	        int ans =0;
	        for(int i=0;i<32;i++){
	            if((z&(1<<i))!=0) ans++;
	        }
	        return ans;
	    }
}
