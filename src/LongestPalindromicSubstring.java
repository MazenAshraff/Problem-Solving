
public class LongestPalindromicSubstring {
	//Problem Statement: https://leetcode.com/problems/longest-palindromic-substring/
	public String longestPalindrome(String s) {
        if(s.length()==0) return "";
       int start=0;
        int maxlength=1;
        for(int i=1;i<s.length();i++){
            int lo=i-1;
            int end=i;
            while(lo>=0&&end<s.length()&&s.charAt(lo)==s.charAt(end)){
                if(end-lo+1>maxlength){
                    start=lo;
                    maxlength=end-lo+1;
                }
                lo--;
                end++;
            }
            lo=i-1;
            end=i+1;
            while(lo>=0&&end<s.length()&&s.charAt(lo)==s.charAt(end)){
                if(end-lo+1>maxlength){
                    start=lo;
                    maxlength=end-lo+1;
                }
                lo--;
                end++;
            }
            
        }
        return s.substring(start,start+maxlength);
    }
}
