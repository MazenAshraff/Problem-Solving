import java.util.ArrayList;
class MyHashSet {
	// Problem Statement : https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410/ 
    ArrayList<Integer> arr[];
    /** Initialize your data structure here. */
    public MyHashSet() {
        arr = new ArrayList[100000];
    }
    
    public void add(int key) {
        int pos = key%100000;
        if(arr[pos]==null){
            arr[pos]=new ArrayList<>();
        }
        if(!contains(key))
        arr[pos].add(key);
    }
    
    public void remove(int key) {
        int pos = key%100000;
        if(arr[pos]!=null){
            System.out.println(arr[pos]);
            arr[pos].remove((Integer)key);
            System.out.println(arr[pos]);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
                int pos = key%100000;
           return arr[pos]==null?false:arr[pos].contains(key)?true
:false;        
    }
     
}
