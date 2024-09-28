import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        backTracking(nums, temp, ans, 0);

        return ans;
    }

    private void backTracking(int[] nums, List<Integer> temp, List<List<Integer>> ans, int depth) {
        ans.add(new ArrayList<>(temp));

        for (int i = depth; i < nums.length; i++) {
            if (i > depth && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backTracking(nums, temp, ans, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
