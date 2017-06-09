/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


// 1) Create an empty stack S.
// 2) Initialize current node as root
// 3) Push the current node to S and set current = current->left until current is NULL
// 4) If current is NULL and stack is not empty then
//       a) Pop the top item from stack.
// 	 b) Print the popped item, set current = popped_item->right
// 	 c) Go to step 3.
// 5) If current is NULL and stack is empty then we are done.
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
	Deque<TreeNode> stack = new ArrayDeque<>();
	ArrayList<Integer> res = new ArrayList<>();
	TreeNode cur = root;
	// first node to be visited should be the leftest one
	while(cur !=null) {
	    stack.push(cur);
	    cur = cur.left;
	}
	//traverse
       	while(!stack.isEmpty()) {
	    cur = stack.pop();
	    res.add(cur.val);

	    if( cur.right !=null) {
		cur = cur.right;
		while(cur!=null) {
		    stack.push(cur);
		    cur = cur.left;
		}
	    }
	}
    return res;	
    }

}
