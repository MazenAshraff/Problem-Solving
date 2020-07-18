
public class MiddleofTheLinkedList {
	/**
	  Definition for singly-linked list.
	  Question Link:
	  https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3290/
	  */

	 
	
	    public ListNode middleNode(ListNode head) {
	        ListNode search = head;
	        while(search!=null){
	            search=search.next;
	            if(search!=null){
	                search=search.next;
	                head=head.next;
	            }
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
