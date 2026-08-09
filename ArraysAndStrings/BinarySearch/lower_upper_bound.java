package ArraysAndStrings.BinarySearch;

public class lower_upper_bound {

/*

Frequency in Interviews
Approximate distribution:

Classical Binary Search       10%

Lower Bound / Upper Bound     40%

Binary Search on Answer        50%



public int lowerBound(int[] nums, int target) {

    int s = 0;
    int e = nums.length - 1;
    int ans = as per question (0/nums.length/-1);

    while (s <= e) {

        int m = s + (e - s) / 2;

        if (target > nums[m]) {
            s = m + 1;
        } else {
            ans = m;
            e = m - 1;
        }
    }

    return ans;
}

Lower Bound returns the index of the first element that is greater than or equal to the target (>= target).

Question:
What does Lower Bound return?

Definition:
First element >= target


TO FIND first element > target 
change condition :- target>nums[m]
to :- target >=nums[m]





























*/    
    
}
