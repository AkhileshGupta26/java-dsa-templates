package ArraysAndStrings.ThreePointers;

public class DutchNationalFlagAlgorithm {

/*

0........s-1      -> All 0s

s........m-1      -> All 1s

m........e        -> Unknown

e+1......n-1      -> All 2s



0's | 1's | Unknown | 2's

0    s    m        e

class Solution {

    public void sortColors(int[] nums) {

        int s = 0;
        int m = 0;
        int e = nums.length - 1;

        while (m <= e) {

            if (nums[m] == 0) {

                swap(nums, s, m);
                s++;
                m++;

            }
            else if (nums[m] == 1) {

                m++;

            }
            else {

                swap(nums, m, e);
                e--;

            }
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


Time = O(n)






























*/    
    
}
