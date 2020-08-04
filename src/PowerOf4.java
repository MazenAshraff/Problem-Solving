
public class PowerOf4 {
// Problem Statement :	https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3412/
	public boolean isPowerOfFour(int num) {
        if (num==0) return false;
        int x = (int) (Math.log(num)/Math.log(4));
        return (int)(Math.pow(4,x))==num;
    }
}
