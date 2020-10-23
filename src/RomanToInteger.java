import java.util.HashMap;

public class RomanToInteger {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/878/
	 public int romanToInt(String s) {
	        HashMap<Character,Integer> dict = new HashMap<>();
	        dict.put('I',1);
	        dict.put('V',5);
	        dict.put('X',10);
	        dict.put('L',50);
	        dict.put('C',100);
	        dict.put('D',500);
	        dict.put('M',1000);
	        int ans =  0;
	        for(int i=0;i<s.length();i++){
	            int cur =dict.get(s.charAt(i));
	            if(i+1<s.length()){
	                int next = dict.get(s.charAt(i+1));
	                if(next>cur){
	                    ans+=(next-cur);
	                    i++;
	                    continue;
	                }
	                
	            }
	            ans+=cur;
	        }
	     return ans;   
	    }
}
