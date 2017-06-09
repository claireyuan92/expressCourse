/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
	if(head == null || head.next == null) return head;
	ListNode cur = head.next;
	ListNode end = head;
	while(cur!=null) {
	    if(cur.val != end.val) {
		end.next = cur;
		end = end.next;
	    } else if (cur.next == null) {
		end.next = null;
	    }
	    cur = cur.next;

	}
	return head;
    }
}
