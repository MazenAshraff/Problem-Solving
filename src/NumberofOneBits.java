
public class NumberofOneBits {
	// Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/565/
    public int hammingWeight(int n) {
        int sumSofar=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0) sumSofar++;
            
        }
        return sumSofar;
    }
}
