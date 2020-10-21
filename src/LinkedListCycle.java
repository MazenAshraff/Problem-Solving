
public class LinkedListCycle {
	//Problem Statement:   https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/773/
	public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;
        if(head.next.next==head) return true;
        ListNode slow=head.next;
        ListNode fast =head.next.next;;
        while(fast!=null&&fast.next!=null){
            if(fast==slow) return true;
            fast=fast.next.next;
            slow=slow.next;

        }
        return false;
    }
	static class ListNode {
		int val;

		ListNode next;

		public ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	}
}
