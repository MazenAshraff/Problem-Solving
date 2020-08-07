
public class WordDictionary {
	/*
	 * Problem Statement: https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3413/
	 */
	TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode dig = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(dig.children[index]==null) dig.children[index]= new TrieNode();
            dig = dig.children[index];
        }
        dig.endOfWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
    	TrieNode x = root;
      return search(word,x);
    }
    boolean search(String word,TrieNode dig){
         for(int i=0;i<word.length();i++){
        	 if (word.charAt(i)=='.') 
        		 for(int j=0;j<26;j++) {
        			 if(dig.children[j]!=null) {
        		boolean t = search(word.substring(i+1),dig.children[j]);
        		if(t) return true;
        			 }
        		 }
        	 else {
            int index = word.charAt(i)-'a';
            if(dig.children[index]==null) return false;
            dig = dig.children[index];
        	 }
        }
        return dig!=null && dig.endOfWord;
    }
    
    static class TrieNode{
        TrieNode [] children;
        boolean endOfWord;
        TrieNode(){
            children = new TrieNode[26];
            endOfWord=false;
        }
    }
    public static void main(String[] args) {
		WordDictionary x = new WordDictionary();
		x.addWord("bad");
		x.addWord("dad");
		x.addWord("mad");
		x.addWord("pad");
		x.addWord("a");
		System.out.println(x.search("."));
    	
	}
}
