
public class CountAndSay {
	// problem statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/
	public String countAndSay(int n) {
        return countAndSay(1,n,"1");
    }
    public String countAndSay(int s, int e, String made){
        if(s == e ) return made;
        StringBuilder sb = new StringBuilder();
        int counter =0;
        for(int i=0;i<made.length();i++){
            counter++;
            if(i== made.length()-1||made.charAt(i+1)!=made.charAt(i)){
                sb.append(counter);
                sb.append(made.charAt(i));
                counter=0;
            }
        }
        return countAndSay(s+1,e,sb.toString());
    }
}
