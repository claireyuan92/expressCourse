/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
	ListNode cur = head;
	ListNode prev = null;

	while(cur != null) {
	    ListNode tmp = cur.next;
	    cur.next = prev;
	    prev = cur;
	    cur = tmp;
	}
	return prev;
    }
}
