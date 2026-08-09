public class dp {

/*




| DP Pattern                 | State             | Time              | Space                   | Famous Problems                                      |
| -------------------------- | ----------------- | ----------------- | ----------------------- | ---------------------------------------------------- |
| **1. Linear DP**           | `dp[i]`           | **O(n)**          | O(n) → O(1)             | Fibonacci, Climbing Stairs, House Robber             |
| **2. Knapsack DP**         | `dp[i][capacity]` | **O(n × W)**      | O(nW) → O(W)            | 0/1 Knapsack, Partition Equal Subset Sum, Target Sum |
| **3. Unbounded Knapsack**  | `dp[i][amount]`   | **O(n × amount)** | O(n×amount) → O(amount) | Coin Change, Rod Cutting                             |
| **4. Grid DP**             | `dp[r][c]`        | **O(m × n)**      | O(mn) → O(n)            | Unique Paths, Minimum Path Sum                       |
| **5. LCS/String DP**       | `dp[i][j]`        | **O(n × m)**      | O(nm) → O(min(n,m))     | LCS, Edit Distance, Delete Operation                 |
| **6. Interval DP**         | `dp[l][r]`        | **O(n³)**         | O(n²)                   | Burst Balloons, Matrix Chain Multiplication          |
| **7. Partition DP**        | `dp[l][r]`        | **O(n³)**         | O(n²)                   | Palindrome Partitioning II, MCM                      |
| **8. LIS DP**              | `dp[i]`           | **O(n²)**         | O(n)                    | LIS, Russian Doll Envelopes (DP version)             |
| **9. LIS + Binary Search** | tails[]           | **O(n log n)**    | O(n)                    | Longest Increasing Subsequence                       |
| **10. Bitmask DP**         | `dp[mask]`        | **O(2ⁿ × n)**     | O(2ⁿ)                   | Traveling Salesman, Matchsticks, Assignment Problems |




| DP Pattern                               | Pure Recursion (RCN)        | Memoization                               | Tabulation                    |
| ---------------------------------------- | --------------------------- | ----------------------------------------- | ----------------------------- |
| **Linear DP** (Fibonacci, House Robber)  | **O(2ⁿ)**                   | **O(n)**                                  | **O(n)**                      |
| **0/1 Knapsack**                         | **O(2ⁿ)**                   | **O(nW)**                                 | **O(nW)**                     |
| **Unbounded Knapsack**                   | Exponential                 | **O(nW)**                                 | **O(nW)**                     |
| **Subset Sum / Partition**               | **O(2ⁿ)**                   | **O(n × target)**                         | **O(n × target)**             |
| **Coin Change**                          | Exponential                 | **O(n × amount)**                         | **O(n × amount)**             |
| **Grid DP** (Unique Paths, Min Path Sum) | Exponential                 | **O(mn)**                                 | **O(mn)**                     |
| **LCS**                                  | **O(2^(n+m))**              | **O(nm)**                                 | **O(nm)**                     |
| **Edit Distance**                        | **O(3^(n+m))** (worst case) | **O(nm)**                                 | **O(nm)**                     |
| **Distinct Subsequences**                | Exponential                 | **O(nm)**                                 | **O(nm)**                     |
| **LIS (DP)**                             | **O(2ⁿ)**                   | **O(n²)**                                 | **O(n²)**                     |
| **LIS (Binary Search)**                  | —                           | —                                         | **O(n log n)** (not DP table) |
| **Matrix Chain Multiplication**          | Exponential (Catalan-like)  | **O(n³)**                                 | **O(n³)**                     |
| **Burst Balloons**                       | Exponential                 | **O(n³)**                                 | **O(n³)**                     |
| **Palindrome Partitioning II**           | Exponential                 | **O(n³)** *(or O(n²) with preprocessing)* | **O(n³)** *(or O(n²))*        |
| **Interval DP**                          | Exponential                 | **O(n³)**                                 | **O(n³)**                     |
| **Bitmask DP (TSP, Assignment)**         | **O(n!)** or worse          | **O(2ⁿ × n²)** *(depends on transition)*  | **O(2ⁿ × n²)**                |



| DP Pattern  | Recursion        | Memoization   | Tabulation                  |
| ----------- | ---------------- | ------------- | --------------------------- |
| Linear DP   | **O(n)** stack   | **O(n)**      | **O(n)** → **O(1)**         |
| Knapsack    | **O(n)** stack   | **O(nW)**     | **O(nW)** → **O(W)**        |
| Grid DP     | **O(m+n)** stack | **O(mn)**     | **O(mn)** → **O(n)**        |
| LCS         | **O(n+m)** stack | **O(nm)**     | **O(nm)** → **O(min(n,m))** |
| Interval DP | **O(n)** stack   | **O(n²)**     | **O(n²)**                   |
| Bitmask DP  | **O(n)** stack   | **O(2ⁿ × n)** | **O(2ⁿ × n)**               |




























*/    
    
}
