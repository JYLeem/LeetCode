class Solution {
    public int threeSumClosest(int[] nums, int target) {
                int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i+1;
            int right = nums.length - 1;
    
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
    
                // 가장 가까운 합 갱신
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
    
                // 합이 타겟보다 작은 경우
                if (sum < target) {
                    left++;
                } 
                // 합이 타겟보다 큰 경우
                else if (sum > target) {
                    right--;
                } 
                // 정확히 같은 경우
                else {
                    return sum;
                }
            }
        }

        return ans;
    }
}