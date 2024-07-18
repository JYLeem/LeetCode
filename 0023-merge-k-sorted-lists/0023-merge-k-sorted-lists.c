/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int compare(const void *a, const void *b) {
    return (*(struct ListNode **)a)->val - (*(struct ListNode **)b)->val;
}

struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    struct ListNode **arr = (struct ListNode **)malloc(sizeof(struct ListNode *) * 10000);
    int count = 0;

    if (listsSize == 0) return NULL;
    
    for (int i = 0; i < listsSize; i++){
        while (*(lists + i) != NULL)
        {
            arr[count++] = *(lists + i);
            *(lists+i) = (*(lists+i)) -> next;
        }
    }

    if (count == 0) {
        free(arr);
        return NULL;
    }

    qsort(arr, count, sizeof(struct ListNode *), compare);

    struct ListNode *ans = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *temp = ans;

    for (int i = 0; i < count; i++){
        temp -> next = *(arr + i);
        temp = temp -> next;
    }

    free(arr);

    return ans -> next;
}