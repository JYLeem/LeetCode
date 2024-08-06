/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    bool flag = false;
    int temp = 0;
    int *ans = (int *)malloc(sizeof(int)*2);
    ans[0] = -1;
    ans[1] = -1;

    *returnSize = 2;

    for (int i = 0; i < numsSize; i++){
        if (*(nums + i) == target){
            if (ans[0] == -1) ans[0] = i;
            else ans[1] = i;
            flag = true;
        }
    }

    

    return ans;
}