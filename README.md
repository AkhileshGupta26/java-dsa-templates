# ⚡ Java DSA Templates

[![Language](https://img.shields.io/badge/language-Java-orange.svg?style=flat-square)](https://www.oracle.com/java/)
[![DSA](https://img.shields.io/badge/DSA-Templates-blue.svg?style=flat-square)](#)
[![PRs](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](#)

A comprehensive, production-grade collection of **Java Data Structures & Algorithms (DSA)** templates and boilerplate code. This repository is specifically curated for competitive programming, coding interviews (LeetCode, Codeforces, CodeChef), and general software engineering problem-solving.

It provides reusable snippets, structural skeletons, and quick-reference cheatsheets so you can write clean, correct, and bug-free code quickly under time constraints.

---

## 🗺️ Index & Directory Structure

The repository is organized by problem patterns and algorithmic strategies. Click on any category to explore the templates:

```text
java-dsa-templates/
├── 📝 ArraysAndStrings/          # Array techniques, Two/Three Pointers, Sliding Windows
├── 🧠 DP/                        # Comprehensive Dynamic Programming archetypes
├── 🕸️ Graph/                     # Graph traversals, Shortest Paths, MST, DSU, Articulation Points
├── 🌲 Tree/                      # Binary Tree traversals, LCA, properties
├── 📊 SegmentTree/               # Range Queries & Point/Range Updates (SGT)
├── 📉 SparseTable/               # Static Range Minimum Queries (RMQ) in O(1)
├── 📚 Stack/                     # Monotonic stack templates & Next Greater Element
├── 🧬 LinkedList/                # Pointer invariants, Dummy Node patterns, reversals
├── 🛠️ MicroTools/                # Comparators, Modulo Arithmetic, BitSets, Math Utilities
├── ⚡ BitManipulation/           # Bit masking, binary string problems, Formula Cheat Sheets
├── 📂 Design/                    # Custom data structures and transformation patterns
├── 🌀 Recursion/                 # Backtracking patterns, Partitioning, Take/Not-Take
├── 🚀 Strategy/                  # Competitive programming templates & fast I/O setup
├── 📥 TakingInput/               # Fast reader implementation (BufferedReader + StringTokenizer)
├── ⏳ TimeComplexity/            # Reference sheets for DP, Graph, Loops, and Recursion
└── 🎯 NEETCODE150/               # Notes and templates map for NeetCode 150
```

---

## 🛠️ Module Breakdowns

### 1. [Arrays & Strings](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/ArraysAndStrings)
Essential patterns for solving contiguous/subarray problems and sequence processing:
*   **[Sliding Window](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/ArraysAndStrings/SlidingWindow)**: Fixed-size, dynamic/variable window size templates, and HashMap-based sliding windows.
*   **[Binary Search](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/ArraysAndStrings/BinarySearch)**: Lower/Upper bounds, peak finding, search in rotated arrays, and binary search on answers.
*   **[Three Pointers](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/ArraysAndStrings/ThreePointers)**: Dutch National Flag algorithm, K-Sum solvers.
*   **[Prefix Sum & Kadane's](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/ArraysAndStrings/PrefixSum)**: Standard 1D/2D prefix sums, subarray XOR sums, and Kadane's algorithm variations.

### 2. [Dynamic Programming (DP)](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/DP) & [Advanced DP](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/AdvancedDp)
Categorized templates for standard and advanced optimization problems:
*   **Classical Models**: [Knapsack](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/DP/Knapsack) (0-1, Unbounded), [LCS](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/DP/LCS) (Longest Common Subsequence), and [LIS](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/DP/LIS) (Longest Increasing Subsequence in $O(N \log N)$).
*   **Intermediate Models**: Grid DP, String/Edit Distance, Game DP (Minimax strategy).
*   **Specialized DP**: [Digit DP](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/DP/DigitDp), [Bitmask DP](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/DP/BitMaskDp), and Graph/DFS memoization.

### 3. [Graph Algorithms](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/Graph)
Comprehensive graph structures and traversal methods:
*   **Traversals**: BFS, DFS, Multi-source BFS, Grid BFS, and Backtracking.
*   **Shortest Paths**: Dijkstra (PriorityQueue and Grid), Bellman-Ford, Floyd-Warshall.
*   **Cycle Detection & Order**: Kahn's BFS & DFS Topological Sort, cycle detection in directed/undirected graphs.
*   **MST & Disjoint Set**: Kruskal's, Prim's, and [Disjoint Set Union (DSU)](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/Graph/MST_DSU/DSU) (optimized with union-by-size and path compression).
*   **Advanced Graph**: Kosaraju's SCC, Bridges, and Articulation Points.

### 4. [Data Structure Design](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/Design) & [MicroTools](file:///c:/Users/MSI/OneDrive/Desktop/DsaTempletByAkhil/MicroTools)
Utilities to streamline implementation details:
*   **Design**: Auxiliary DS patterns, data structure transformation helpers.
*   **MicroTools**: Custom sort Comparators (Array, List, PQ), fast overflows check, Modulo Arithmetic class (Modular Inverse, Big exponentiation), and `java.util.BitSet` utilities.

---

## 💡 Code Highlights

### Disjoint Set Union (DSU) Template
```java
class DSU {
    int[] parent;
    int[] size;
    int components;

    DSU(int n) {
        parent = new int[n];
        size = new int[n];
        components = n;
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    
    int find(int x) {
        if(parent[x] == x)
            return x;
        return parent[x] = find(parent[x]); // Path compression
    }

    boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if(pa == pb) return false;
        
        // Union by size
        if(size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }
        components--;
        return true;
    }
}
```

### Variable Sliding Window Blueprint
```java
int i = 0, j = 0;
while (j < nums.length) {
    // 1. Expand the window
    add(nums[j]);
    
    // 2. Shrink window while invalid
    while (conditionIsInvalid()) {
        remove(nums[i]);
        i++;
    }
    
    // 3. Update answer (window is now guaranteed valid)
    ans = Math.max(ans, j - i + 1);
    j++;
}
```

---

## 🚀 How to Use

1.  **Clone the Repository**:
    ```bash
    git clone https://github.com/AkhileshGupta26/java-dsa-templates.git
    cd java-dsa-templates
    ```
2.  **Navigate & Import**: Copy any template class/method directly into your project. Each file contains clear package declarations matching the folders.
3.  **Fast Input Setup**: For competitive programming, import `TakingInput/br.java` to set up fast standard I/O in Java using `BufferedReader` and `StringTokenizer` to prevent TLE (Time Limit Exceeded).

## 📄 License
This repository is open-sourced and available under the MIT License. Feel free to copy, modify, and use these templates for your personal use, coding contests, and interview preparation!
