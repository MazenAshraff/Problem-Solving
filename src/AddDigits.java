
public class AddDigits {
	/*
	 * Problem Statement: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3402/
	 */
	 public int addDigits(int num) {
	        if(num!=0&&num%9==0) return 9;
	        int x = num/9;
	        return num - x*9;
	    }
}
