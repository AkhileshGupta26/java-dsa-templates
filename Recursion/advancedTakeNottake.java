package Recursion;

public class advancedTakeNottake {
/*

1601. Maximum Number of Achievable Transfer Requests
1255 Maximum Score Words Formed by Letters

Given with a consition 
..soln1-> generate all subsets and check validity
..soln2-> check validity using backtracking take and nottake

| LC   | Problem                                        | Difficulty |
| ---- | ---------------------------------------------- | ---------- |
| 416  | Partition Equal Subset Sum                     | Medium     |
| 494  | Target Sum                                     | Medium     |
| 698  | Partition to K Equal Sum Subsets               | Medium     |
| 473  | Matchsticks to Square                          | Medium     |
| 2305 | Fair Distribution of Cookies                   | Medium     |
| 1601 | Maximum Number of Achievable Transfer Requests | Hard       |
| 1255 | Maximum Score Words Formed by Letters          | Hard       |


class Solution {
    public int maximumRequests(int n, int[][] requests) {
        int[] building = new int[n];
        return solve(n, requests, 0, building);
    }

    public int solve(int n, int[][] nums, int idx, int[] building) {

        // Base case
        if (idx == nums.length) {
    for (int x : building) {
        if (x != 0)
            return Integer.MIN_VALUE / 2;
    }
    return 0;
}

        int from = nums[idx][0];
        int to = nums[idx][1];

        // Take
        building[from]--;
        building[to]++;

        int p = 1 + solve(n, nums, idx + 1, building);

        // Undo
        building[from]++;
        building[to]--;

        // Not Take
        int q = solve(n, nums, idx + 1, building);

        return Math.max(p, q);
    }
}



class Solution {

    public int maximumRequests(int n, int[][] requests) {

        int m = requests.length;
        int ans = 0;

        for (int mask = 0; mask < (1 << m); mask++) {

            int[] balance = new int[n];
            int count = 0;

            for (int i = 0; i < m; i++) {

                if ((mask & (1 << i)) != 0) {

                    int from = requests[i][0];
                    int to = requests[i][1];

                    balance[from]--;
                    balance[to]++;

                    count++;
                }
            }

            boolean valid = true;

            for (int x : balance) {
                if (x != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                ans = Math.max(ans, count);
        }

        return ans;
    }
}






















*/    
    
}
