class Solution {
    static boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        visited = new boolean[nums.length];

        backTracking(ans, new ArrayList<>(), nums, 0);
        
        return ans;
    }

    private static void backTracking(List<List<Integer>> result, List<Integer> temp, int[] nums, int depth){
        if (depth == nums.length){
            if (result.size() == 0){
                result.add(new ArrayList<>(temp));
                return;
            }

            boolean key = false;
            for (List<Integer> tmp : result){
                if (Arrays.equals(tmp.toArray(), temp.toArray())){
                    key = true;
                    break;
                }
            }

            if (!key){
                result.add(new ArrayList<>(temp));
            }
            
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(nums[i]);
                backTracking(result, temp, nums, depth + 1);
                visited[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}