package DP.DigitDpProblems;

public class sum {
    String s;
    int target;

     public int countNumbers(String num, int k) {
        s = num;
        target = k;
        return solve(0, 0, 0);
    }


     int solve(int pos, int isFree, int sum) {
  
        // base case
    if (pos == s.length()) {
        return (sum == target) ? 1 : 0;
    }

    int limit;

    if (isFree == 1)
        limit = 9;
    else
        limit = s.charAt(pos) - '0';

    int ans = 0;

    for (int d = 0; d <= limit; d++) {
        int nextFree;
        if (isFree == 1)
            nextFree = 1;
        else if (d < limit)
            nextFree = 1;   // we became smaller → free
        else
            nextFree = 0;   // still matching → limited

        ans += solve(pos + 1, nextFree, sum + d);
    }

    return  ans;
}
    
}
