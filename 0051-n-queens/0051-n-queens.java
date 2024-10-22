class Solution {
    private Set<Integer> col = new HashSet<Integer>();
    private Set<Integer> diag1 = new HashSet<Integer>();
    private Set<Integer> diag2 = new HashSet<Integer>();

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<List<String>>();
        dfs(ans,new ArrayList<String>(), 0, n);
        return ans;
    }

    private void dfs(List<List<String>> ans, List<String> list, int row, int n){
        if (row == n){
            ans.add(new ArrayList<String>(list));
            return;
        }

        for (int i = 0; i < n; i++){
            if (col.contains(i) || diag1.contains(row+i) || diag2.contains(row - i)) continue;

            char[] charArray = new char[n];
            Arrays.fill(charArray, '.');
            charArray[i] = 'Q';
            String rowString = new String(charArray);
            
            list.add(rowString);
            col.add(i);
            diag1.add(row + i);
            diag2.add(row - i);
            
            dfs(ans, list, row + 1, n);
            
            list.remove(list.size() - 1);
            col.remove(i);
            diag1.remove(row + i);
            diag2.remove(row - i);
        }
    }
}