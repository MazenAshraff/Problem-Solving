
public class ExcelSheetColumnNumber {
	// Problem Statement : https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3417/
    public int titleToNumber(String s) {
        int sum =0;
        int pow =0;
        for(int i=s.length()-1;i>=0;i--){
            sum+=(int) (Math.pow(26,pow++))*(s.charAt(i)-'A'+1);
        }
        return sum;
    }
}
