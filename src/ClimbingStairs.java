
public class ClimbingStairs {
	/*
	 * Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/
	 */
	int memo[]= new int[46];
    public int climbStairs(int n) {
        if(n==0) return 1;
        if(n<0) return (int) (-1e9);
        if (memo[n]!=0) return memo[n];
        else {
              int ans1=climbStairs(n-1);
              int ans2=climbStairs(n-2);
                if(ans1>0&&ans2>0){
                    return memo[n] = ans1 + ans2;
                }
                else{
                    if(ans1>0){
                        return memo[n]=ans1;
                    }
                    else{
                        return memo[n]=ans2;
                    }
                }
                
            }
        }
}
