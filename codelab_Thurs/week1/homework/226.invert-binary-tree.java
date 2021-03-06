/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//refer to pre order traversal

public class Solution {
    public TreeNode invertTree(TreeNode root) {
	helper(root);
	return root;
    }

    private void helper(TreeNode root) {
	if(root == null) {
	    return;
	}

	TreeNode tmp = root.left;
	root.left = root.right;
	root.right = tmp;

	helper(root.left);
	helper(root.right);
    }
}
