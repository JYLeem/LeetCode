/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if (head == NULL || head -> next == NULL) return head;

    struct ListNode* dummy = head;

    while (dummy != NULL && dummy -> next != NULL)
    {
        struct ListNode *nextNode = dummy -> next;
        int tmp = dummy -> val;
        dummy -> val = nextNode -> val;
        nextNode -> val = tmp;
        dummy = nextNode -> next;
    }

    return head;
}
