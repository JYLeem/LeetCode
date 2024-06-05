/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* rotateRight(struct ListNode* head, int k) {
    int lastest;
    struct ListNode *prev;
    struct ListNode *temp = head;
    struct ListNode *count = head;
    int cnt = 1;

    while(head != NULL) {
        if (count -> next == NULL) break;
        else {
            count = count -> next;
            cnt++;
        }
    }

    if (k == 0 || cnt == 0) return head;
    else k %= cnt;

    for (int i = 0; i < k; i++) {
        while (1) {
            if (temp->next == NULL) {
                lastest = temp->val;
                prev->next = temp->next; // NULL로 연결
                break;
            } else {
                prev = temp;
                temp = temp->next; 
            }
        }
        temp -> next = head;
        head = temp;
    }
    return head;
}
