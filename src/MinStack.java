import java.util.ArrayList;

public class MinStack {
	//Problem Statement: https://leetcode.com/explore/featured/card/top-interview-questions-easy/98/design/562/
	  ArrayList<Integer> arr;
	    int top=-1;
	    ArrayList<Integer> min;
	    int topMin=-1;
	    public MinStack() {
	        arr= new ArrayList<>();
	        min= new ArrayList<>();
	    }
	    
	    public void push(int x) {
	 
	        top++;
	        if(top==arr.size()){
	            arr.add(x);
	        }
	        else
	        arr.set(top,x);

	        if(topMin==-1||x<=min.get(topMin)){
	            topMin++;
	            if(topMin==min.size())
	                min.add(x);
	            else
	                min.set(topMin,x);
	        }
	    }
	    
	    public void pop() {
	        if((int)min.get(topMin)==(int)arr.get(top)){
	            topMin--;
	            
	        }
	        top--;
	    }
	    
	    public int top() {
	        return arr.get(top);
	    }
	    
	    public int getMin() {
	        return min.get(topMin);
	    }
}
