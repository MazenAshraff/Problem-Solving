
public class LongestCommonPrefix {
	// Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
	  public String longestCommonPrefix(String[] strs) {
	        if(strs.length ==0) return "";
	        int i=0;
	        StringBuilder ans = new StringBuilder();
	        while(true){
	            if(i==strs[0].length())
	                return ans.toString();
	            for(int j=1;j<strs.length;j++){
	                if (i==strs[j].length()||strs[j].charAt(i)!=strs[j-1].charAt(i)){
	                    return ans.toString();
	                }
	            }
	                ans.append(strs[0].charAt(i));
	            i++;
	        }
	    }
}
