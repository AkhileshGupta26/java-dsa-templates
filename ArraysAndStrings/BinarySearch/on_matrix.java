package ArraysAndStrings.BinarySearch;

public class on_matrix {

/*


            Matrix Problem
                  │
        ┌─────────┴─────────┐
        │                   │
Globally Sorted?      Row & Col Sorted?
        │                   │
    Flatten BS         Staircase Search
        │
        └─────────┐
                  │
        kth / Median / Min Value?
                  │
         Binary Search on Answer


Pattern 1 — Flatten the Matrix ⭐⭐⭐⭐⭐

// ROW WISE SORTED

1   3   5   7
10 11 16 20
23 30 34 60

public boolean searchMatrix(int[][] matrix, int target) {

    int rows = matrix.length;
    int cols = matrix[0].length;

    int s = 0;
    int e = rows * cols - 1;

    while (s <= e) {

        int m = s + (e - s) / 2;

        int value = matrix[m / cols][m % cols];

        if (value == target)
            return true;

        if (target < value)
            e = m - 1;
        else
            s = m + 1;
    }

    return false;
}

Pattern 2 — Staircase Search ⭐⭐⭐⭐⭐

1   4   7   11
2   5   8   12
3   6   9   16
10 13 14 17

Rows sorted
✅

Columns sorted
✅

int r = 0;
int c = cols - 1;

while (r < rows && c >= 0) {

    if (matrix[r][c] == target)
        return true;

    if (target < matrix[r][c])
        c--;
    else
        r++;
}

return false;




















*/    
    
}
