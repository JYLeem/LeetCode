/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if (head == NULL) return false;
    while (true) {
        if (head -> next == NULL) return false;
        else {
            head -> val = -999;
            head = head -> next;
            if (head -> val == -999 && head -> next -> val == -999) return true;
        }
    }
    return false;
}