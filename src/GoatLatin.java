
public class GoatLatin {
	// Problem Statement : https://leetcode.com/explore/featured/card/august-leetcoding-challenge/551/week-3-august-15th-august-21st/3429/
	 public String toGoatLatin(String S) {
	        String[] sent = S.split(" ");
	        StringBuilder a = new StringBuilder("a");
	        StringBuilder ans = new StringBuilder();
	        for(int i=0;i<sent.length;i++){
	            StringBuilder part = new StringBuilder();
	            switch(sent[i].charAt(0)){
	                case 'a':
	                case 'e':
	                case 'i':
	                case 'o':
	                case 'u':
	                case 'A':
	                case 'E':
	                case 'I':
	                case 'O':
	                case 'U':part.append(sent[i]);break;
	                default: part.append(sent[i].substring(1));
	                         part.append(sent[i].charAt(0));    
	            }
	            part.append("ma");
	            part.append(a.toString());
	            a.append("a");
	            ans.append(part);
	            if(i!=sent.length-1)
	            ans.append(" ");

	        }
	        return ans.toString();
	    }
}
