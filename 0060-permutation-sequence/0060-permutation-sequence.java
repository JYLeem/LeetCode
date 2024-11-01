class Solution {
    private int count = 0;

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[n];

        for (int i = 1; i <= n; i++){
            sb.append(i);
        }

        return backTracking(sb.toString(), visited, 0, n, k, new StringBuilder());
    }

    private String backTracking(String temp, boolean[] vis, int depth, int n, int k, StringBuilder ans) {
        if (depth == n) {
            count++;
            if (count == k) {
                return ans.toString();
            }
            return null;
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ans.append(temp.charAt(i));
                vis[i] = true;

                String result = backTracking(temp, vis, depth + 1, n, k, ans);
                if (result != null) return result;

                vis[i] = false;
                ans.deleteCharAt(ans.length() - 1);
            }
        }

        return null;
    }
}
