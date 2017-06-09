/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// this is actually  inorder traversal of BST
// refer to  94.binary-tree-inorder-traversal.java
public class BSTIterator {
    TreeNode cur;
    Deque<TreeNode> stack = new ArrayDeque<>();
    public BSTIterator(TreeNode root) {
	// Build the initial stack
	cur = root;
	while(cur!=null) {
	    stack.push(cur);
	    cur = cur.left;
	}
	
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
	return !stack.isEmpty();
        
    }

    /** @return the next smallest number */
    public int next() {
	TreeNode node = stack.pop();
	int res = node.val;
	if(node.right!=null) {
	    node = node.right;
	    while(node!=null) {
		stack.push(node);
		node = node.left;
	    }
	}
	return res;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
