package ArraysAndStrings.OnetoN;

public class templet {
/*

Universal Template ⭐⭐⭐⭐⭐

int i = 0;

while (i < nums.length) {

    int correct = nums[i] - 1;

    if (nums[i] != nums[correct]) {
        //This single line prevents infinite loops.
        swap(nums, i, correct);

    } else {

        i++;
    }
}
##########  GOD TEMPLET ##########

int i = 0;

while (i < nums.length) {

    int val = nums[i];

    // Can this value be placed?
    if (val >= MIN &&
        val <= MAX &&
        nums[i] != nums[homeIndex(val)]) {

        swap(nums, i, homeIndex(val));

    } else {

        i++;
    }
}
    

int i = 0;

while (i < n) {

    int correct = homeIndex(nums[i]);

    if (canPlace(nums[i]) &&
        nums[i] != nums[correct]) {

        swap(nums, i, correct);

    } else {

        i++;
    }
}





Why is it O(n)?

At first glance, there are swaps inside a loop.

Looks like

O(n²)

Actually,

Every swap places at least one element into its final position.

An element never leaves its correct position again.























*/    
    
}
