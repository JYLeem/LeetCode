class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] visited = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <= i; j++){
                if(s.charAt(i) == s.charAt(j) && (i-j <= 2 || visited[j+1][i-1])){
                    visited[j][i] = true;
                }

            }
        }

        backTracking(s, ans, new ArrayList<>(), visited, 0);

        return ans;
        
    }

    public void backTracking(String s, List<List<String>> ans, List<String> temp, boolean[][] visited, int depth){
        if (s.length() == depth){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = depth; i < s.length(); i++){
            if(visited[depth][i]){
                temp.add(s.substring(depth, i+1));
                backTracking(s, ans, temp, visited, i+1);
                temp.remove(temp.size()-1);
            }

        }
    }
}