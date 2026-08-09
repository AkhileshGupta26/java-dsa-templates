package ArraysAndStrings.BinarySearch;

public class on_rotated_arrays {
/*

Question 1
Which half is sorted?

nums[s] <= nums[m] ?

If true:
Left half is sorted.

Else:
Right half is sorted.


Question 2
Does the target lie inside that sorted half?

If yes:
Discard the other half.

If no:
Search the remaining half.




//////////  TEMPLET /////////

public int search(int[] nums, int target) {

    int s = 0;
    int e = nums.length - 1;

    while (s <= e) {

        int m = s + (e - s) / 2;

        if (nums[m] == target)
            return m;

        // Left half sorted
        if (nums[s] <= nums[m]) {

            if (target >= nums[s] && target < nums[m])
                e = m - 1;
            else
                s = m + 1;
        }

        // Right half sorted
        else {

            if (target > nums[m] && target <= nums[e])
                s = m + 1;
            else
                e = m - 1;
        }
    }

    return -1;
}


/////////  PROBLEMS ///////////

LC 33 - Search in Rotated Sorted Array
LC 153 - Find Minimum in Rotated Sorted Array
LC 81 - Search in Rotated Sorted Array II
LC 154 - Find Minimum in Rotated Sorted Array II











































*/    
    
}
