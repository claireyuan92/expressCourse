/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
	if(head == null || head.next == null)
	    return head;
	ListNode smaller = new ListNode(0);
	ListNode greater = new ListNode(0);
	ListNode newsmallhead = smaller;
	ListNode newgreaterhead = greater;
	ListNode cur = head;

	while(cur!=null) {
	    if (cur.val < x) {
		smaller.next = cur;
		smaller = smaller.next;
	    } else {
		greater.next = cur;
		greater = greater.next;
	    }
	    cur = cur.next;
	}
	greater.next = null;
	
	smaller.next = newgreaterhead.next;

	return newsmallhead.next;
       
    }
}
