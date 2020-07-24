
public class RemoveNthNodeFromTheEnd {
	/*
	 * Problem Statement: https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
	 */
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode copy = head;
	        ListNode move = null;
	        ListNode parent = head;
	        for(int i=1;copy!=null;i++){

	            if(i==n){
	                move = head;
	            }
	            else{
	            if(i>n){
	                move= move.next;
	                }
	            }
	            if(copy.next==null){
	                if(move.next==null){
	                    if(i==1){
	                        return null;
	                    }
	                    else{
	                        parent.next=null;
	                        
	                    }
	                }
	                else{
	                move.val=move.next.val;
	                move.next=move.next.next;
	                    
	                }
	                break;
	            }
	            if(i>1) parent=parent.next;
	            copy=copy.next;
	        }
	        return head;
	    }
	  class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
}
