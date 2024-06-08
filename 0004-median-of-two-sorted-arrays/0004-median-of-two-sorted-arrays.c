#include <stdio.h>
#include <stdlib.h>

struct LinkedList {
    int val;
    struct LinkedList *next;
};

struct LinkedList *createList(int a) {
    struct LinkedList *newNode = (struct LinkedList*)malloc(sizeof(struct LinkedList));
    newNode->val = a;
    newNode->next = NULL;
    return newNode;
}

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int num1 = 0, num2 = 0;
    int totalNum = nums1Size + nums2Size;

    struct LinkedList *dummyHead = createList(0); // 작업을 단순화하기 위한 더미 헤드
    struct LinkedList *current = dummyHead;

    // 두 배열을 병합하여 연결 리스트에 추가
    while (num1 < nums1Size && num2 < nums2Size) {
        if (*(nums1 + num1) < *(nums2 + num2)) {
            current->next = createList(*(nums1 + num1));
            num1++;
        } else {
            current->next = createList(*(nums2 + num2));
            num2++;
        }
        current = current->next;
    }

    // 남은 요소 추가
    while (num1 < nums1Size) {
        current->next = createList(*(nums1 + num1));
        num1++;
        current = current->next;
    }

    while (num2 < nums2Size) {
        current->next = createList(*(nums2 + num2));
        num2++;
        current = current->next;
    }

    // 중앙값 계산
    current = dummyHead->next; // 실제 시작 지점
    for (int i = 0; i < (totalNum - 1) / 2; i++) {
        current = current->next;
    }

    if (totalNum % 2 != 0) {
        return (double)(current->val);
    } else {
        return (current->val + current->next->val) / 2.0;
    }
}

