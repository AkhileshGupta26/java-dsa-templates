package DP.LCS;

public class memo_lcs {

    
     static int fun(String s,String t,int m,int n,int[][] dp){
        // base case
        if(m==0||n==0){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        // choice option
        if(s.charAt(m-1)==t.charAt(n-1)){
         return dp[m][n]= 1+fun(s,t,m-1,n-1,dp);
        }
        else{
            int a=fun(s,t,m-1,n,dp);
            int b=fun(s,t,m,n-1,dp);
            return dp[m][n]= Math.max(a, b);
        }
    }
    
}
