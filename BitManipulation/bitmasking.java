package BitManipulation;

public class bitmasking {
/*
Now the meaning of bits changes.
Bits are no longer just binary digits.
Each bit represents an element of a set.


Operations become

Contains ->(mask & (1<<i)) != 0

Add ->    mask |= (1<<i);

Remove -> mask &= ~(1<<i);

Toggle -> mask ^= (1<<i);


| Operation | Formula                |           |
| --------- | ---------------------- | --------- |
| Check     | `(mask & (1<<i)) != 0` |           |
| Set       | `mask                  | = (1<<i)` |
| Clear     | `mask &= ~(1<<i)`      |           |
| Toggle    | `mask ^= (1<<i)`       |           |


for (int mask = 0; mask < (1 << n); mask++) {

    // One subset

    for (int i = 0; i < n; i++) {

        if ((mask & (1 << i)) != 0) {

            // nums[i] belongs to this subset

        }
    }
}






















*/    
    
}
