package MicroTools.Comparator;

public class arraySorting {
/*

1. Sorting 1D Array
This works for Integer[]arr, not for int[]arr.
Arrays.sort(arr);
Arrays.sort(arr,(a,b)->a-b);
Arrays.sort(arr,(a,b)->b-a);


2. Sorting 2D Array ⭐⭐⭐⭐⭐
Each row is one object.
Example

[
[5,6],
[1,2],
[3,8]
]

Sort by first column
Arrays.sort(arr,(a,b)->a[0]-b[0]);

[
[1,2],
[3,8],
[5,6]
]

Sort by second column
Arrays.sort(arr,(a,b)->a[1]-b[1]);
Sort descending : Arrays.sort(arr,(a,b)->b[0]-a[0]);


3.Multi-level Sorting ⭐⭐⭐⭐⭐


[
[1,7]
[1,3]
[2,5]
]

Sort

first column ascending
second ascending
Arrays.sort(arr,(a,b)->{

    if(a[0]!=b[0])
        return a[0]-b[0];

    return a[1]-b[1];
});

Sort

first ascending
second descending
Arrays.sort(arr,(a,b)->{

    if(a[0]!=b[0])
        return a[0]-b[0];

    return b[1]-a[1];
});

Very common.




















*/    
    
}
