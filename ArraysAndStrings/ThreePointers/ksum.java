package ArraysAndStrings.ThreePointers;

public class ksum {
/*

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }

    private List<List<Integer>> kSum(int[] nums, int start, int k, long target) {

        List<List<Integer>> ans = new ArrayList<>();

        // Base Case -> 2 Sum
        if (k == 2) {

            int left = start;
            int right = nums.length - 1;

            while (left < right) {

                long sum = (long) nums[left] + nums[right];

                if (sum < target) {
                    left++;
                }
                else if (sum > target) {
                    right--;
                }
                else {

                    ans.add(Arrays.asList(nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
            }

            return ans;
        }

        // Recursive Case
        for (int i = start; i <= nums.length - k; i++) {

            if (i > start && nums[i] == nums[i - 1])
                continue;

            List<List<Integer>> temp =
                    kSum(nums, i + 1, k - 1, target - nums[i]);

            for (List<Integer> list : temp) {

                List<Integer> cur = new ArrayList<>();

                cur.add(nums[i]);

                cur.addAll(list);

                ans.add(cur);
            }
        }

        return ans;
    }
}


List<List<Integer>> kSum(int start, int k, int target) {

    if (k == 2) {
        return twoSum(start, target);   // Two Pointers
    }

    for (int i = start; i <= n - k; i++) {

        // Skip duplicates

        // Fix nums[i]

        // Solve (k-1)Sum

        // Add nums[i] to every returned answer
    }
}


Time Complexity = O(n^(k-1))


K-Sum

↓

Fix one number

↓

Reduce to (K−1)-Sum

↓

Repeat

↓

When K becomes 2

↓

Use Two Pointers



























*/    
    
}
