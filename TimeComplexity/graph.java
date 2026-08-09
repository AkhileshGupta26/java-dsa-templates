public class graph {
  
/*

Universal Rule 1

Traversal Algorithms
DFS
BFS
Cycle Detection
Topological Sort
Bipartite
Connected Components

↓

Time = O(V + E)



Universal Rule 2

Weighted Graph Algorithms

Algorithm	Complexity
Dijkstra	O((V + E) log V)
Prim	O((V + E) log V)
Kruskal	O(E log E)
Bellman-Ford	O(VE)
Floyd-Warshall	O(V³)


| Algorithm                         | Time Complexity             | Space Complexity               | Remember                      |
| --------------------------------- | --------------------------- | ------------------------------ | ----------------------------- |
| Graph Representation (Adj List)   | **O(V + E)**                | **O(V + E)**                   | Best representation           |
| Graph Representation (Adj Matrix) | **O(V²)**                   | **O(V²)**                      | Dense graphs                  |
| DFS                               | **O(V + E)**                | **O(V)** (visited + recursion) | Visit each vertex & edge once |
| BFS                               | **O(V + E)**                | **O(V)** (queue + visited)     | Same as DFS                   |
| Connected Components              | **O(V + E)**                | **O(V)**                       | DFS/BFS repeatedly            |
| Cycle Detection (Undirected)      | **O(V + E)**                | **O(V)**                       | DFS/BFS + parent              |
| Cycle Detection (Directed)        | **O(V + E)**                | **O(V)**                       | DFS recursion stack / Kahn    |
| Topological Sort (DFS)            | **O(V + E)**                | **O(V)**                       | Stack + DFS                   |
| Topological Sort (Kahn)           | **O(V + E)**                | **O(V)**                       | Queue + indegree              |
| Bipartite Check                   | **O(V + E)**                | **O(V)**                       | BFS/DFS coloring              |
| Multi-source BFS                  | **O(V + E)**                | **O(V)**                       | All sources start together    |
| Shortest Path (Unweighted)        | **O(V + E)**                | **O(V)**                       | BFS                           |
| Dijkstra (Priority Queue)         | **O((V + E) log V)**        | **O(V)**                       | Non-negative weights          |
| Bellman-Ford                      | **O(V × E)**                | **O(V)**                       | Handles negative weights      |
| Floyd-Warshall                    | **O(V³)**                   | **O(V²)**                      | All-pairs shortest path       |
| Prim (Priority Queue)             | **O((V + E) log V)**        | **O(V)**                       | MST                           |
| Kruskal                           | **O(E log E)**              | **O(V)**                       | MST + DSU                     |
| Union Find (DSU)                  | **≈ O(α(V))** per operation | **O(V)**                       | Almost constant               |
| Kosaraju SCC                      | **O(V + E)**                | **O(V)**                       | 2 DFS                         |
| Tarjan SCC                        | **O(V + E)**                | **O(V)**                       | 1 DFS                         |
| Bridges                           | **O(V + E)**                | **O(V)**                       | Tarjan                        |
| Articulation Points               | **O(V + E)**                | **O(V)**                       | Tarjan                        |





































*/    
    
}
