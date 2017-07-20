/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
  void helper(vector<vector<int> &res, vector<int> oneRes, TreeNode * root, int target) {
    if (!root ) {
      return;
    }
    if(!root->left && !root->right) {
      if (root.val == target) {
	oneRes.push_back(root.val);
	res.push_back(oneRes);
      }
    }

    
    
    
  }
  vector<vector<int>> pathSum(TreeNode* root, int sum) {
      
    }

  
};
