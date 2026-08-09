package DP.LIS;

public class lis_rcn {
/*



if (prev == -1 || nums[idx] > nums[prev]) {
    int take = 1 + solve(nums, idx + 1, idx);
    int notTake = solve(nums, idx + 1, prev);
    return Math.max(take, notTake);
}

return solve(nums, idx + 1, prev);





int solve(int[] nums, int idx, int prev) {

    if (idx == nums.length)
        return 0;

    // prev == -1
    if (prev == -1) {

        int take = 1 + solve(nums, idx + 1, idx);
        int notTake = solve(nums, idx + 1, prev);

        return Math.max(take, notTake);
    }

    // Increasing condition satisfied
    if (nums[idx] > nums[prev]) {

        int take = 1 + solve(nums, idx + 1, idx);
        int notTake = solve(nums, idx + 1, prev);

        return Math.max(take, notTake);
    }

    // Cannot take
    return solve(nums, idx + 1, prev);
}









*/    
    
}
