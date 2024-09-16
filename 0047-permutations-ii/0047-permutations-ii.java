class Solution {
    static boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        visited = new boolean[nums.length];

        Arrays.sort(nums);

        backTracking(ans, new ArrayList<>(), nums);
        
        return ans;
    }

    private static void backTracking(List<List<Integer>> result, List<Integer> temp, int[] nums){
        if (temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if(i > 0 && ! visited[i-1] && nums[i] == nums[i-1]) continue;
            if (!visited[i]){
                visited[i] = true;
                temp.add(nums[i]);
                backTracking(result, temp, nums);
                visited[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}