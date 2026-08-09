package TimeComplexity;

public class recursion {
/*


Time = (number of nodes) × (work per node)

How many recursive calls does one function make and How deep can recursion go?

| Pattern                     | Example            | TC         |
| --------------------------- | ------------------ | ---------- |
| `fun(n-1)`                  | One branch         | O(n)       |
| `fun(n-1), fun(n-1)`        | Decision recursion | O(2ⁿ)      |
| `fun(n/2)`                  | Binary search      | O(log n)   |
| `fun(n/2), fun(n/2)`        | Divide & Conquer   | O(n)       |
| `fun(n/2), fun(n/2) + O(n)` | Merge Sort         | O(n log n) |


| Pattern                    | Example                        | Recursive Calls          | Height     | Nodes       | Time                   | Stack Space                               |
| -------------------------- | ------------------------------ | ------------------------ | ---------- | ----------- | ---------------------- | ----------------------------------------- |
| **Linear Recursion**       | Factorial, Sum, Reverse String | 1                        | n          | n           | **O(n)**               | O(n)                                      |
| **Halving Recursion**      | Binary Search                  | 1                        | log n      | log n       | **O(log n)**           | O(log n)                                  |
| **Binary Tree DFS**        | Max Depth, Same Tree           | 2                        | h          | n           | **O(n)**               | O(h)                                      |
| **Divide & Conquer**       | Merge Sort                     | 2                        | log n      | n per level | **O(n log n)**         | O(log n) recursion *(+ O(n) merge array)* |
| **Naive Binary Recursion** | Fibonacci                      | 2                        | n          | ≈2ⁿ         | **O(2ⁿ)**              | O(n)                                      |
| **Take / Not Take**        | Subsets                        | 2                        | n          | 2ⁿ          | **O(n·2ⁿ)**            | O(n)                                      |
| **k Choices**              | Combination Sum                | k                        | target / n | kʰ          | **O(kʰ)**              | O(h)                                      |
| **Permutations**           | LC 46                          | n,n−1,...                | n          | n!          | **O(n·n!)**            | O(n)                                      |
| **Grid Backtracking**      | Word Search                    | ≤4 (≈3 after first move) | L          | 3ᴸ–4ᴸ       | **O(3ᴸ)** or **O(4ᴸ)** | O(L)                                      |
| **N-Queens**               | LC 51                          | Variable                 | n          | ~n!         | **≈O(n!)**             | O(n)                                      |

Question -1
void fun(int n){

    if(n<=1) return;

    fun(n-1);

    for(int i=0;i<n;i++){

    }
}
    
✅ Correct Answer: TC = O(n²), SC = O(n)


Question-2
void fun(int n){

    if(n<=1) return;

    fun(n/2);

    for(int i=0;i<n;i++){

    }
}
✅ Correct Answer: TC = O(n), SC = O(log n)


QUESTION-3
fun(n/2);

fun(n/2);

for(i=0;i<n;i++)

✅ Correct Answer :TC = O(n log n)
































*/    
    
}
