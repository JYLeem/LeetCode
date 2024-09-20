class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];

        return dp(m, n, arr, 0, 0);
    }

    private static int dp(int m, int n, int arr[][], int i, int j){
        if (i == m || j == n){
            return 0;
        }

        if (i == m-1 || j == n-1){
            return 1;
        }
        if (arr[i][j] > 0) return arr[i][j];
        return arr[i][j] = dp(m, n, arr, i+1, j) + dp(m, n, arr, i, j+1);
    }
}