
public class MinStack {
	import java.util.ArrayList;
	
	    ArrayList<Integer> arr;
	    /** initialize your data structure here. */
	    int top=-1;
	    Integer min=null;
	    public MinStack() {
	        arr= new ArrayList<>();
	    }
	    
	    public void push(int x) {
	        if(min==null){
	            min=x;
	        }
	        top++;
	        arr.set(top,x);
	        if(x<min){
	            min=x;
	        }
	    }
	    
	    public void pop() {
	        
	        top--;
	        if(top<-1) top=-1;
	    }
	    
	    public int top() {
	        return arr.get(top);
	    }
	    
	    public int getMin() {
	        return min;
	    }
	}

