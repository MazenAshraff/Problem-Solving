import java.util.HashMap;

public class TopKFrequentElements {
	//Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/799/
	 HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
	    public int[] topKFrequent(int[] nums, int k) {
	        for(int i=0;i<nums.length;i++){
	            frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
	        }
	        int[] arr = new int[frequency.size()];
	        int i=0;
	        for(int key: frequency.keySet()){
	            arr[i++]=key;
	        }
	        if(k==frequency.size()) return arr;
	        kthmostfrequent(arr,0,arr.length-1,k);
	        int ans[]= new int[k];
	        i=0;
	        for(int j = arr.length-1;k>0;j--,i++){
	            ans[i] =arr[j];
	            k--;
	        }
	        return ans;
	        
	    }
	    public   int partition(int arr[],int low,int hi){
	        int pivotloc =low;
	        int pivot = arr[hi];
	        for(int i=low;i<=hi;i++){
	            if(frequency.get(arr[i]) < frequency.get(pivot)){
	                int temp =arr[i];
	                arr[i]=arr[pivotloc];
	                arr[pivotloc] =temp;
	                pivotloc++;
	            }
	        }
	        int temp = arr[pivotloc];
	        arr[pivotloc] = arr[hi];
	        arr[hi] = temp;
	        return pivotloc;
	        
	    }
	    public  void kthmostfrequent (int arr[],int lo,int hi,int k){
	        int pivotloc = partition(arr,lo,hi);
	        if(pivotloc==arr.length- k){
	            return;
	        }
	        else{
	            if(pivotloc<arr.length-k){
	                kthmostfrequent(arr,pivotloc+1,hi,k);
	            }
	            else{
	                kthmostfrequent(arr,lo,pivotloc-1,k);
	            }
	        }
	        
	    }
}
