package Recursion;

public class kEqualPatition {

/*

This exact template solves:

✅ 473. Matchsticks to Square
✅ 698. Partition to K Equal Sum Subsets
✅ 2305. Fair Distribution of Cookies
✅ 1723. Find Minimum Time to Finish All Jobs (with branch & bound)
✅ Many load-balancing and partitioning interview problems

import java.util.*;

class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for (int x : nums) {
            sum += x;
        }

        if (sum % k != 0) return false;

        int target = sum / k;

        Arrays.sort(nums);

        // Reverse to descending order (important pruning)
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        if (nums[0] > target) return false;

        int[] bucket = new int[k];

        return solve(nums, 0, bucket, target);
    }

    private boolean solve(int[] nums, int index, int[] bucket, int target) {

        if (index == nums.length) {
            return true;
        }

        int current = nums[index];

        for (int i = 0; i < bucket.length; i++) {

            if (bucket[i] + current > target) {
                continue;
            }

            bucket[i] += current;

            if (solve(nums, index + 1, bucket, target)) {
                return true;
            }

            bucket[i] -= current;

            // Pruning:
            // If current bucket was empty before placing the number,
            // don't try other empty buckets (they are symmetric).
            if (bucket[i] == 0) {
                break;
            }
        }

        return false;
    }
}


Family 4B: Optimization Partition

answer = INF

solve(index)

if(all items assigned){

    answer = min(answer,
                 maximumBucket())

    return;
}

for(each bucket){

    place()

    solve(next)

    undo()
}





































*/    
    
}
