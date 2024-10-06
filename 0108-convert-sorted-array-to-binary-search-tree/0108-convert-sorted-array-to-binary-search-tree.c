/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* BST(int *nums, int start, int end){
    if (end < start){
        return NULL;
    }
    int mid = (start+end)/2;
    struct TreeNode *root = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    root -> val = *(nums+mid);
    root -> left = BST(nums, start, mid-1);
    root -> right = BST(nums, mid+1, end);
    return root;
}


struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {
    if (numsSize <= 0){
        return NULL;
    }
    return BST(nums, 0, numsSize-1);
}

// 0 1 2 3 4 5