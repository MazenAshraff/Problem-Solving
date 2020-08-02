
public class BestTimeToBuyAndSellStock {
	// Problem Statement : https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/572/
	 /*
    O(N^2) time
    */
    public int maxProfit2(int[] prices) {
        int max =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }
    // O(N) time 
        public int maxProfit(int[] prices) {
        int max =0;
        int min =Integer.MAX_VALUE;    
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
                min = prices[i];
            
            if(max<prices[i]-min)
                max=prices[i]-min;

            
        }
        return max;
    }
}
