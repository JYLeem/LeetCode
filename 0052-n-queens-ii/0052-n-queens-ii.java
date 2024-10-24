class Solution {
    int ans = 0;
    public int totalNQueens(int n) {
        boolean[] vertical = new boolean[n];
        boolean[] left = new boolean[2 * n - 1];
        boolean[] right = new boolean[2 * n - 1];
        helper(n, vertical, left, right, 0);
        return ans;
    }
    
    void helper(int n, boolean[] v, boolean[] l, boolean[] r, int row){
        if(row == n){
            ans++;
            return;
        }
      
        for(int col = 0; col < n; col++){
            if(v[col] || l[row - col + n - 1] || r[row + col]) continue;
            v[col] = true;
            l[row - col + n - 1] = true;
            r[row + col] = true;
            
            helper(n, v, l, r, row + 1);
            
            v[col] = false;
            l[row - col + n - 1] = false;
            r[row + col] = false;
        }    
    }
}