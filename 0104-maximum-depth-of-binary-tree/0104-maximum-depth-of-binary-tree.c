/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if (root == NULL) return 0;


    return depth(root);
}

int depth(struct TreeNode* tmp){
    if (tmp == NULL) return 0;
    int left = depth(tmp -> left);
    int right = depth(tmp -> right);

    return 1 + (left > right ? left : right);
}