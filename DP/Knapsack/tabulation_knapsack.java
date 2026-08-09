package DP.Knapsack;

public class tabulation_knapsack {
/*

public int knapsack(int W, int[] val, int[] wt) {

    int n = wt.length;
    int[][] dp = new int[n + 1][W + 1];

    // Base Case:
    // dp[n][*] = 0  (already initialized)
    // dp[*][0] = 0  (already initialized)

    for (int idx = n - 1; idx >= 0; idx--) {

        for (int cap = 1; cap <= W; cap++) {

            if (wt[idx] <= cap) {
                dp[idx][cap] = Math.max(
                        val[idx] + dp[idx + 1][cap - wt[idx]],
                        dp[idx + 1][cap]
                );
            } else {
                dp[idx][cap] = dp[idx + 1][cap];
            }
        }
    }

    return dp[0][W];
}



















*/    
    
}
