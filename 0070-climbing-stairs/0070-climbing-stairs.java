/*
    DP vs Greedy 인데, DP의 Knapsack 과 비슷하다. 
    예외: n = 1 일 경우, n = 2일 경우
    분할: 1이 있을 경우, 없을 경우 / 2가 있을 경우 없을 경우
    탈출: n <= 0 일 경우
    점화식: K(n) = K(n-1) + K(n-2);
*/

class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        
        int [] dp = new int [n+1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < n+1; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        
        return dp[n];
    }
}