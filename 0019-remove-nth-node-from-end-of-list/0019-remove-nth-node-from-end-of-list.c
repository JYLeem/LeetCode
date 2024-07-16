/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int cnt = 0;
    struct ListNode *temp = head;

    while (temp != NULL){
        cnt++;
        temp = temp -> next;
    }
    int nth = cnt - n - 1; // 0

    if (cnt == 1){
        temp = NULL;
        return temp;
    } 
    else if (nth < 0){
        return head -> next;
    }

    struct ListNode *exec = head;
    
    for (int i = 0; i < nth; i++){
        exec = exec -> next;
    }

    if (exec -> next != NULL){
        struct ListNode *temp2 = exec -> next;
        exec -> next = temp2 -> next;
        free(temp2);
    }

    return head;
}