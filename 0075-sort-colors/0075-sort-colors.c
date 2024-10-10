void sortColors(int* nums, int numsSize) {
    int count[3] = {0, };
    int total = 0;

    for (int i = 0; i < numsSize; i++){
        count[nums[i]]++;
    }

    for (int i = 0; i < count[0]; i++){
        nums[total] = 0;
        total++;
    }

    for (int j = 0; j < count[1]; j++){
        nums[total] = 1;
        total++;
    }

    for (int j = 0; j < count[2]; j++){
        nums[total] = 2;
        total++;
    }
}