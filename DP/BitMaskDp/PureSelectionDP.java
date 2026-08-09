package DP.BitMaskDp;

public class PureSelectionDP {
/*
Universal Template (Pure Selection DP)

int solve(int mask){

    // Base Case
    if(mask == (1<<n)-1)
        return BASE;

    int ans = INITIAL;

    int position = Integer.bitCount(mask) + 1;

    for(int i=0;i<n;i++){

        // if not chosen
        if((mask & (1<<i)) == 0){

            // if current choice is valid

            ans = COMBINE(
                    ans,
                    solve(mask | (1<<i))
            );

        }

    }

    return ans;
}


//////  AT INITIAL  //////////

BASE (0, 1, cost, score, etc.)
INITIAL (0, INF, -INF)
COMBINE (+, min, max)















*/    
    
}
