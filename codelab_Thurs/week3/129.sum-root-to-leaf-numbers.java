/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *     1
 *   /  \ 
 * 2     3
 */
public class Solution {

    public int sumNumbers_recursion(TreeNode root) {
	return helper(root, 0);
    }

    private int helper(TreeNode cur, int prevSum) {
	if (cur == null) {
	    return 0;
	}
	//reaching leaf
	if(cur.left == null && cur.right == null) {
	    return prevSum * 10 + cur.val;
	}
	prevSum = prevSum * 10 + cur.val;
	return helper(cur.left, prevSum) + helper(cur.right, prevSum);	
    }

    public static main() {}
    public int sumNumbers(TreeNode root) {
	Deque<TreeNode> stack =  new ArrayDeque<>();
	if (root == null) return 0;
	int totalSum = 0;
	TreeNode cur = root;
	int stackSum = 0;
	
	while(cur !=null || !stack.isEmpty()) {
	    while ( cur != null) {
		stackSum = stackSum * 10 + cur.val;
		// stackSum = 2
		//reaching leaf
		if(cur.right == null && cur.left == null) {
		    totalSum +=stackSum;
		}
		stack.push(cur); //stack  2
	    	cur = cur.left; // cur = 0
	    }
	    cur = stack.pop(); //stack - 
	    stackSum = (stackSum - cur.val)/10; // cur
	    cur = cur.right;
	}

	return totalSum;
	
	
    }
}
