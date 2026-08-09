package DP.Knapsack;

public class rcn_knapsack {

/*


public int solve(int idx, int W, int[] val, int[] wt) {

    // Base Case
    if (idx >= wt.length || W == 0)return 0;
    
    int notTake = solve(idx + 1, W, val, wt);
     
    int take = 0;
    if (wt[idx] <= W) {
        take = val[idx] + solve(idx + 1, W - wt[idx], val, wt);
    }

    // Best Choice
    return Math.max(take, notTake);
}


| Type         | Move      |
| ------------ | --------- |
| 0/1 Knapsack | `idx - 1` |
| Unbounded    | `idx`     |

Partition Equal Subset → boolean → ||
Target Sum → count → +
Knapsack → max → Math.max






















*/    


}
