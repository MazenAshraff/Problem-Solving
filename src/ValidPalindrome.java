
public class ValidPalindrome {
	// Problem statement : https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3411/
	 public boolean isPalindrome(String s) {
	        s=s.toLowerCase();
	        int i=0,j=s.length()-1;
	        while(i<=j){
	            if (!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))){
	                i++;
	                continue;   
	            }
	            if (!((s.charAt(j)>='a'&&s.charAt(j)<='z')||(s.charAt(j)>='0'&&s.charAt(j)<='9'))){
	                j--;
	                continue;
	            }
	            if(s.charAt(i)!=s.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	            return true;
	    }
}
