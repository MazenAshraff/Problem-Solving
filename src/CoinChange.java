import java.util.Arrays;

public class CoinChange {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/809/
	 int memo[]= new int[10001];
	    public int coinChange(int[] coins, int amount) {
	        if(amount==0) return 0;
	        Arrays.sort(coins);
	        return minCoins(coins,amount);
	    }
	    public int minCoins(int [] coins,int amount){
	        if(amount<coins[0]) return -1;
	        if(Arrays.binarySearch(coins,amount)>=0) return memo[amount]=1;
	        if(memo[amount]!=0) return memo[amount];
	        
	        int ans = Integer.MAX_VALUE;
	        for(int i=0;i<coins.length;i++){
	            int val = minCoins(coins,amount-coins[i])+1;

	            if(val!=0){
	                ans=Math.min(val,ans);
	            }
	        }
	        return memo[amount]= ans==Integer.MAX_VALUE?-1:ans;
	    }
}
