package DP.GridDp;

public class grid {

class Solution {

    static int[][] dp;
    static int n, m;

    int solve(int i, int j, int[][] grid) {

        //  OUT OF BOUNDS
        if (i < 0 || j < 0 || i >= n || j >= m)
            return (int)1e9; // or 0 or -INF

        //  BASE CASE
        if (i == n-1 && j == m-1)
            return grid[i][j];

        if (dp[i][j] != -1) return dp[i][j];

        //  MOVES
        int ans = (int)1e9;

        ans = Math.min(ans, solve(i+1, j, grid));
        ans = Math.min(ans, solve(i, j+1, grid));

        // add more moves if needed

        //  COMBINE
        return dp[i][j] = grid[i][j] + ans;
    }
}
    
}
