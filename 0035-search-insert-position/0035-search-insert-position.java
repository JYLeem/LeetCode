class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = Arrays.binarySearch(nums, target);

        if (ans < 0){
            if (nums[nums.length - 1] < target){
                return nums.length;
            } 
            else if (nums[0] > target){
                return 0;
            } else {
                nums[nums.length-1] = target;
                Arrays.sort(nums);
            
                return Arrays.binarySearch(nums, target);
            }
        } 
        else {
            return ans;
        }
    }
}