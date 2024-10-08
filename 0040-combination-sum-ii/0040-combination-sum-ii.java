class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; 
        else if (remain == 0) ans.add(new ArrayList<>(tempList)); 
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                tempList.add(candidates[i]);
                backtrack(ans, tempList, candidates, remain - candidates[i], i + 1); 
                tempList.remove(tempList.size() - 1); 
            }
        }
    }
}
