package DP.DigitDp;

public class rcn_ddp {


    int solve(int pos, int isFree, int sum) {

    if (pos == n) {
        return (sum == target) ? 1 : 0;
    }

    if (dp[pos][isFree][sum] != -1)
        return dp[pos][isFree][sum];

    int limit;

    if (isFree == 1)
        limit = 9;
    else
        limit = digits[pos];

    int ans = 0;

    for (int d = 0; d <= limit; d++) {

        int nextFree;

        if (isFree == 1)
            nextFree = 1;
        else if (d < digits[pos])
            nextFree = 1;   // we became smaller → free
        else
            nextFree = 0;   // still matching → limited

        ans += solve(pos + 1, nextFree, sum + d);
    }

    return dp[pos][isFree][sum] = ans;
}
    
}
