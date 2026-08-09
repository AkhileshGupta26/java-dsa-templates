package DP.LCS;

public class rcn_lcs {

      static int fun(String s,String t,int m,int n){
        // base case
        if(m==0 || n==0){
            return 0;
        }
        // choice diagram
        if(s.charAt(m-1)==t.charAt(n-1)){
            return 1 + fun(s, t, m-1, n-1);
        } else {
            int a = fun(s, t, m-1, n);
            int b = fun(s, t, m, n-1);
            return Math.max(a, b);
        }
    }
    
}
