class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            machine(nums, i);
        }
        return ans;
    }
    public void machine(int[] nums, int targetIndex){
        int target = nums[targetIndex] * (-1);
        int left = targetIndex + 1;
        int right = nums.length - 1;
        int val;
        int len = nums.length;
        while(left < right){
            val = nums[left] + nums[right];
            if(val == target){
                ans.add(Arrays.asList(nums[left], nums[right], nums[targetIndex]));
                left++;
                right--;
                while (left + 1 < len && nums[left] == nums[left-1]) left++;
                while (right - 1 > - 1 && nums[right] == nums[right+1]) right--;
            } else if (val > target){
                right--;
                while (right - 1 > -1 && nums[right] == nums[right+1]) right--;
            } else {
                left++;
                while (left +1 <len && nums[left] == nums[left-1]) left++;
            }
        }
    }
}