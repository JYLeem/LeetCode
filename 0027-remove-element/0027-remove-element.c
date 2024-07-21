int removeElement(int* nums, int numsSize, int val) {
    int sec = 0;

    for (int i = 0; i < numsSize; i++){
        if ( *(nums + i) != val ){
            *(nums + sec) = *(nums + i);
            sec++;
        }
    }

    return sec;
}