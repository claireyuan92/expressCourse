/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode newhead = new ListNode(-1);
	ListNode p = newhead;
	int carry = 0;
	while(l1!=null || l2!=null) {
	    p.next = l1!=null ? l1:l2;
	    int digit = ((l1!=null) ? l1.val:0) +( (l2!=null) ? l2.val:0) + carry;
	    carry = digit/10;
	    digit = digit%10;
	    p.next.val = digit;
	    p = p.next;

	    if(l1!=null) l1 = l1.next;
	    if(l2!=null) l2 = l2.next;
	}
	if (carry!=0) {
	    p.next = new ListNode(1);
	}
	return newhead.next;
	
    }
}
