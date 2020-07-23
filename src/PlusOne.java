
public class PlusOne {
	/*
	 * problem statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
	 */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]==10){
                digits[i]=0;
            }
            else{
                break;
            }
        }
        if(digits[0]==0){
            int[] dig =digits;
            digits = new int[dig.length+1];
            digits[0]=1;
            for(int i=1 ;i<digits.length;i++){
                digits[i]=dig[i-1];
            }
        }
        return digits;
    }

}
