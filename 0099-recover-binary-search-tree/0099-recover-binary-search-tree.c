/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool treeValidation(struct TreeNode *node, struct TreeNode *prevNode, long min, long max){
    if (node == NULL) return true;
    
    if (node -> val <= min || node -> val >= max){
        int temp = node -> val;
        node -> val = prevNode -> val;
        prevNode -> val = temp;
        return false;
    } 

    return treeValidation(node -> left, node, min, node -> val) && treeValidation(node -> right, node, node -> val, max);
}

void recoverTree(struct TreeNode* root) {
    while (1) {
        if (treeValidation(root, root, LONG_MIN, LONG_MAX ) == true) break;
    }
    
}