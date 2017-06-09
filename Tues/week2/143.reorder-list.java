/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
	ListNode s = head;
	ListNode f = head;
	ListNode dummy = new ListNode(0);
	//findMid
	while(f!=null && f.next!=null) {
	    s = s.next;
	    f = f.next.next;
	}

	ListNode secondHalf = reverse(s);
	//merge
	ListNode l = head;
	ListNode r = secondHalf;
	ListNode cur = dummy;
	while(l!=null || r!=null ) {
	    if(l!=null) {
		cur.next = l;
		l = l.next;
		cur = cur.next;
	    }
	    if(r!=null) {
		cur.next = r;
		l = l.next;
		cur = cur.next;
	    }
	}
	return dummy.next;
	
    }

    private  ListNode reverse(ListNode head) {
	ListNode dummy = new ListNode(0);
	dummy.next = head;
	ListNode prev = dummy;
	ListNode cur = head;

	while(prev!=null) {
	    ListNode tmp = cur.next;
	    cur.next = prev;
	    prev = cur;
	    cur = tmp;
	}
	return dummy.next;
    }
}
