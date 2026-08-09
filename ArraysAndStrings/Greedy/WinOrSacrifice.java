package ArraysAndStrings.Greedy;

public class WinOrSacrifice {
/*

The classical name comes from the famous Chinese strategy game:
Tian Ji's Horse Racing Strategy

This is called Sacrificing
Whenever -> I cannot win don't waste a valuable resource.
Sacrifice the weakest one.

Universal Rule

Largest resource
↓
Can beat strongest enemy?

YES
↓
Beat it.

NO
↓
Sacrifice weakest resource
to weakest/strongest enemy
(depending on problem).


Template 2 — Win or Sacrifice

Arrays.sort(A);
sort(B with indices);

left = 0;
right = n - 1;

for (largest in A) {

    if (largest > B[right]) {
        beat(right);
        right--;
    } else {
        sacrifice(left);
        left++;
    }
}


Template 1 — Smallest Winner    

Arrays.sort(A);
Arrays.sort(B);

int i = 0;
int j = 0;

while (i < A.length && j < B.length) {

    if (A[i] >= B[j]) {
        // Match
        i++;
        j++;
    } else {
        // Too small
        i++;
    }
}































*/    
    
}
