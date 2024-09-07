/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

 void postOrder(struct TreeNode* root, int* result, int* index) {
    if (root == NULL) {
        return;
    }
    
    postOrder(root->left, result, index);
    postOrder(root->right, result, index);
    result[(*index)++] = root->val;
}

int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize = 0;
    
    if (root == NULL) {
        return NULL;
    }
    
    int* result = (int*)malloc(100 * sizeof(int));  
    
    int index = 0;
    postOrder(root, result, &index);
    
    *returnSize = index;
    
    return result;
}