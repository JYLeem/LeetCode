/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    struct ListNode *dummy = head;

    while (dummy != NULL){
        int arr[k];
        struct ListNode *temp = dummy;

        for (int i = 0; i < k; i++){    
            arr[i] = temp -> val;
            temp = temp -> next;
            if (temp == NULL){
                return head;
            }
        }

        for (int i = k-1; i >= 0; i--){
            if (dummy == NULL || arr[i] == NULL) return head;
            dummy -> val = arr[i];
            dummy = dummy -> next;
        }
    }

    return head;
}