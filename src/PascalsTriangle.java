import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	//Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/601/
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++){
                int lastIdx= ans.size()-1;
                if(j==0||j==i){
                    ans.get(lastIdx).add(1);
                }
                else{
                    ans.get(lastIdx).add(ans.get(lastIdx-1).get(j-1)+ans.get(lastIdx-1).get(j));
                }
            }
        }
        return  ans;
    }
}
