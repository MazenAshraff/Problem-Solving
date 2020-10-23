
public class UniquePaths {
	// Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/808/
	 int memo[][];
	    public int uniquePaths(int m, int n) {
	        memo= new int[m][n];
	        return findPaths(0,0);
	    }
	    public int findPaths(int i,int j){
	        if(i==memo.length-1&&j==memo[0].length-1) return 1;
	        if(memo[i][j]!=0) return memo[i][j];
	        int ans = 0;
	        if(i<memo.length-1){
	            ans+=findPaths(i+1,j);
	        }
	        if(j<memo[0].length-1){
	            ans+=findPaths(i,j+1);
	        }
	        return memo[i][j]=ans;
	    }
}
