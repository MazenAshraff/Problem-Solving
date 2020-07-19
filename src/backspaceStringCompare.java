import java.util.Stack;
public class backspaceStringCompare {
	/*
	 * Problem Statement :https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/529/week-2/3291/
	 */
	public boolean backspaceCompare(String S, String T) {
        Stack <Character> s = new Stack<>();
        Stack <Character> t = new Stack<>();
        for(int i=0,j=0;i<S.length()||j<T.length();i++,j++){
            if(i<S.length()){
                if(S.charAt(i)!='#'){
                    s.push(S.charAt(i));
                }
                else{
                    if(!s.isEmpty()){
                        s.pop();
                    }
                }
            }
            if(j<T.length()){
                if(T.charAt(j)!='#'){
                    t.push(T.charAt(j));
                }
                else{
                    if(!t.isEmpty()){
                        t.pop();
                    }
                }
            }
            
        }
        if(s.size()!=t.size()) return false;
        while(!s.isEmpty()){
            if(s.pop()!=t.pop()) return false;
        }
        return true;
    }
}
