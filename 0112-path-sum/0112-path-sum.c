/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

bool nodeSearch(struct TreeNode* root, int total, int target){
    if (root == NULL) return false;

    total += root -> val;

    if (total == target && root -> left == NULL && root -> right == NULL) return true;


    return nodeSearch(root->left, total, target) || nodeSearch(root->right, total, target);
}


bool hasPathSum(struct TreeNode* root, int targetSum) {
    return nodeSearch(root, 0, targetSum);
}