class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    boolean[] visited;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        visited = new boolean[n + 1]; 

        backTracking(n, k, 1, new ArrayList<>());
        return ans;
    }

    private void backTracking(int N, int K, int start, List<Integer> temp) {
        if (temp.size() == K) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(i); 
                backTracking(N, K, i + 1, temp);
                temp.remove(temp.size() - 1); 
                visited[i] = false; 
            }
        }
    }
}
