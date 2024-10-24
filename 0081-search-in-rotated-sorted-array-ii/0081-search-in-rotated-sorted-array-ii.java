class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Arrays.binarySearch(nums, target);

        if (ans < 0) return false;
        else return true;
    }
}