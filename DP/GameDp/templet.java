package DP.GameDp;

public class templet {
/*


int solve(state){

    if(base)
        return advantage;

    int op1 = gain1 - solve(nextState1);

    int op2 = gain2 - solve(nextState2);

    return Math.max(op1, op2);
}


//////// STONE GAME ////////////


class Solution {
    public boolean stoneGame(int[] piles) {
        return solve(0,piles.length-1,piles)>=0 ? true:false;
        
    }
    public int solve(int i,int j,int[]piles){
        // base case
        if(i==j)return piles[i];

        // options for p1
        //(1)take from left
        //(2)take from right

        //if take from left, p2 will take from remaining array as shown
        int op1=piles[i]-solve(i+1,j,piles);

        //if take from right, p2 will take from remaining array as shown
        int op2=piles[j]-solve(i,j-1,piles);

        return Math.max(op1,op2);
    }
}




















*/    
    
}
