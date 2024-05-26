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

int size = 0;
int *solution = NULL;

void inorder(struct TreeNode* node){
        if (!node) return;
        inorder(node -> left);
        solution = (int *)realloc(solution, sizeof(int) * ++size);
        solution[size-1] = node -> val;
        inorder(node -> right);
}

int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    size= 0;
    solution = NULL;
    inorder(root);
    *returnSize = size;
    return solution;
}

