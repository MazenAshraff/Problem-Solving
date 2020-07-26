
public class AddTwoNumbers {
	/*
	 * Problem Statement: https://leetcode.com/problems/add-two-numbers/
	 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode l3 = new ListNode();
        ListNode l =l3;
        boolean old=false;
        while(l1!=null||l2!=null||carry!=0){
            if(l1!=null&&l2!=null){
                if(old){
                   l.next=new ListNode();
                    l=l.next;
                }
                int x = l1.val+l2.val+carry;
                int val =x%10;
                l.val+=val;
                carry = x/10;
                l1=l1.next;
                l2=l2.next;
                old=true;
                
            }
            else if(l2!=null){
                l.next = new ListNode();
                l=l.next;
                int val = carry + l2.val;
                l.val+=val%10;
                carry=val/10;
                l2=l2.next;
            }
            else if(l1!=null){
                l.next = new ListNode();
                l=l.next;
                int val = carry + l1.val;
                l.val+=val%10;
                carry=val/10;
                l1=l1.next;
            }
            else{
                if(carry!=0){
                    l.next = new ListNode();
                    l=l.next;
                    l.val=carry;
                    carry=0;
                }
            }
        }
        return l3;
    }
 
    	class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}