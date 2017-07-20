/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> oneRes = new ArrayList<>();
	helper(root, res, oneRes, sum);
	return res;
    }
    
    void helper(TreeNode root, List<List<Integer>> res, List<Integer> oneRes, int target ) {
	if (root == null) {
	    return;
	}
	
	if (root.left == null && root.right == null) {
	    if (root.val == target) {
		oneRes.add(root.val);
		res.add(new ArrayList<Integer>(oneRes));
	    } else {
		if (root.left!=null) {
		    helper(root.left, res, oneRes, target - root.val);
		}
		if (root.right!=null) {
		    helper(root.right, res, oneRes, target - root.val);
		}
	    }
	}
	oneRes.remove(oneRes.size() - 1);
    }    
    	
}
