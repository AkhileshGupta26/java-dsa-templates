package DP.DigitDpProblems;

public class ddp {

// GLOBALS (adjust size based on problem)
long[][][][] dp; 
char[] digits;
int n;

long solve(long x) {
    if (x < 0) return 0;

    digits = Long.toString(x).toCharArray();
    n = digits.length;

    // initialize dp with -1
    // dp size depends on extra state

    return dfs(0, 1, 0, /* extra initial state */);
}

long dfs(int pos, int tight, int started, /* extra state */) {

    // 🔹 BASE CASE
    if (pos == n) {
        // return 1 or 0 depending on validity
    }

    // 🔹 MEMO
    if (tight == 0 && dp[...] != -1) {
        return dp[...];
    }

    int limit = (tight == 1) ? digits[pos] - '0' : 9;

    long ans = 0;

    // 🔹 TRY ALL DIGITS
    for (int d = 0; d <= limit; d++) {

        int newTight = (tight == 1 && d == limit) ? 1 : 0;
        int newStarted = (started == 1 || d != 0) ? 1 : 0;

        if (newStarted == 0) {
            // still leading zeros
            ans += dfs(pos + 1, newTight, 0, /* unchanged state */);
        } else {
            // 🔥 MAIN LOGIC GOES HERE
            // check valid(d, state)
            // update state

            ans += dfs(pos + 1, newTight, 1, /* updated state */);
        }
    }

    if (tight == 0) {
        dp[...] = ans;
    }

    return ans;
}
    
    
}
