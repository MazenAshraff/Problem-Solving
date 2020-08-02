
public class DetectCapital {
	// Problem statement : https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/ 
	 public boolean detectCapitalUse(String word) {
	        return word.equals(word.toUpperCase())| word.substring(1).equals(word.substring(1).toLowerCase());
	    }
}
