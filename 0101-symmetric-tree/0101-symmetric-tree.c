/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

bool popIn(struct TreeNode *rRoot, struct TreeNode *lRoot){
    if (rRoot == NULL && lRoot == NULL) return true;
    if (rRoot == NULL || lRoot == NULL) return false;
    if (rRoot -> val != lRoot -> val) return false;

    return popIn(rRoot -> right, lRoot -> left) && popIn(rRoot -> left, lRoot -> right);
}

bool isSymmetric(struct TreeNode* root) {
    return popIn(root -> right, root -> left); 
}
