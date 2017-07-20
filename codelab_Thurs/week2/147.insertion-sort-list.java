/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
	if (head == null || head.next == null) return head;
	ListNode newhead = new ListNode(0);
	newhead.next = head;
	ListNode prekey = head;
	ListNode preinsert = newhead;
	
	while(prekey!=null && prekey.next!=null) {
	    preinsert = newhead;
	    //insert key to sorted sequence newhead.next ... -> prekey	    
	    while(preinsert.next !=null && preinsert.next.val < prekey.next.val) {
		preinsert = preinsert.next;
	    }

	    if (preinsert == prekey) {
		//no insertion
		prekey = prekey.next;
	    } else {
		ListNode cur = prekey.next;
		prekey.next = cur.next;
		ListNode insert = preinsert.next;
		preinsert.next = cur;
		cur.next = insert;
		// if we do insertion, prekey is already pointing to the key.next
	    }	    
	    
	    
	}
	return newhead.next;
    }
}
