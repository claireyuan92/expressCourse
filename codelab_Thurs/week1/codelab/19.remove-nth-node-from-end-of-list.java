/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
	if (head == null) return null;
	ListNode l_fast =  head;
	ListNode l_slow = head;
	for(int i = 0 ; i < n ; i++) {
	    l_fast = l_fast.next;
	}
	if(l_fast == null) {  
	    return head.next;
	}
	while(l_fast.next!=null) {
	    l_slow = l_slow.next;
	    l_fast = l_fast.next;    
	}
	ListNode tmp = l_slow.next;
	l_slow.next =tmp.next;
	return head;
       	
    }
}
