
public class PowerOfThree {
	// Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
    public boolean isPowerOfThree(int n) {
        double x = -((Math.log(n)/Math.log(3)) -  Math.ceil(Math.log(n)/Math.log(3)));
        return  x<1e-14 && n!=0;
    }
}
