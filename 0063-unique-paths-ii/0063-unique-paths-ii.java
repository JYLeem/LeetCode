class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int col = obstacleGrid.length;
        int row = obstacleGrid[0].length;

        int[] dp = new int[row];
        dp[0] = 1;

        for (int[] tmp : obstacleGrid){
            for (int j = 0; j < row; j++){
                if (tmp[j] == 1){
                    dp[j] = 0;
                }
                else if (j > 0){
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[row-1];   
    }
}