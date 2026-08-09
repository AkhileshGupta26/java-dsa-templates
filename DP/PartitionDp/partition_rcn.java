package DP.PartitionDp;

public class partition_rcn {
/*

int solve(int left,int right){

    if(Base Case)
        return answer;

    int ans = INF;

    for(int k=left;k<right;k++){

        int leftAns = solve(left,k);

        int rightAns = solve(k+1,right);

        ans = combine(leftAns,rightAns);

    }

    return ans;
}


int solve(int left,int right){

    // Base Case
    if(baseCase)
        return baseAnswer;

    int ans = INF;

    // Try every partition
    for(int k=left;k<right;k++){

        int leftAns = solve(left,k);

        int rightAns = solve(k+1,right);

        int currentCost = problemSpecific(left,k,right);

        ans = operation(ans,
                leftAns + rightAns + currentCost);
    }

    return ans;
}
    

"Can the thing represented by k belong to both recursive subproblems?"

No → solve(l, k) and solve(k + 1, r)
Yes → solve(l, k) and solve(k, r)



Case 1: Partition belongs to one side

Use:

solve(left, k);
solve(k + 1, right);

Examples:

Matrix Chain Multiplication (with appropriate state)
Standard array partition problems




Case 2: Partition becomes a shared boundary

Use:

solve(left, k);
solve(k, right);

Examples:

Minimum Cost to Cut a Stick
Burst Balloons (boundary-based formulation)















*/    
}
