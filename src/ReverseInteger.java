
public class ReverseInteger {
	/*
	 * Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
	 */
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if(x<0) sb.append('-');
        x=Math.abs(x);
        while(x>0){
            sb.append(x%10);
            x/=10;
        }
        try{
            int ans = Integer.parseInt(sb.toString());
            return ans;
        }
        catch(Exception e){
            return 0;
        }
    }
}
