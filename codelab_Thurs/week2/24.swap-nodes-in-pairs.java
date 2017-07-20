/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairsDraft(ListNode head) {
	if (head == null || head.next == null) return head;
	// head node is changing, so we need a dummy node
	ListNode dummy = new ListNode(0);
	dummy.next = head;
	ListNode pre = dummy;
	
	while (pre.next != null  && pre.next.next !=null) {
	    ListNode cur = pre.next;
	    ListNode curNext = cur.next;
	    cur.next = curNext.next;
	    curNext.next = cur;
	    pre.next = curNext;
	    pre = cur;				 
	}
       	return dummy.next;
    }

    public ListNode swapPairs(ListNode head) {
	if (head == null || head.next == null) return head;
	// head node is changing, so we need a dummy node
	ListNode dummy = new ListNode(0);
	dummy.next = head;
	ListNode pre = dummy;
	ListNode cur = head;

	while (cur != null && cur.next !=null) {
	    ListNode nextstart = cur.next.next;
	    cur.next.next = cur;
	    pre.next = cur.next;
	    cur.next = nextstart;
	    pre = cur;
	    cur = cur.next;
	}
	
       	return dummy.next;
    }


}
